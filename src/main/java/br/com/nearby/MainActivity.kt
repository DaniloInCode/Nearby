package br.com.nearby

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import br.com.nearby.data.model.Market
import br.com.nearby.ui.screen.HomeScreen
import br.com.nearby.ui.screen.MarketDetailsScreen
import br.com.nearby.ui.screen.SplashScreen
import br.com.nearby.ui.screen.WelcomeScreen
import br.com.nearby.ui.screen.route.Home
import br.com.nearby.ui.screen.route.Splash
import br.com.nearby.ui.screen.route.Welcome
import br.com.nearby.ui.theme.NearbyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NearbyTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = Splash
                ) {
                    composable<Splash> {
                        SplashScreen(modifier = Modifier.fillMaxSize(),
                            onNavigateToWelCome = {
                                navController.navigate(Welcome)
                            }
                        )
                    }
                    composable<Welcome> {
                        WelcomeScreen(onNavigationToHome = { navController.navigate(Home) })
                    }
                    composable<Home> {
                        HomeScreen(onNavigateToMarketDetails = { selectedMarket ->
                            navController.navigate(selectedMarket)
                        })
                    }
                    composable<Market> {
                        val selectedMarket = it.toRoute<Market>()
                        MarketDetailsScreen(market = selectedMarket, onNavigateBack = {
                            navController.popBackStack()
                        })
                    }
                }
            }
        }
    }
}

