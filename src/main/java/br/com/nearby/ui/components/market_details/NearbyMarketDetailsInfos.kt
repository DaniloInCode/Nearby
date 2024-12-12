package br.com.nearby.ui.components.market_details
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.nearby.data.model.Market
import br.com.nearby.ui.theme.Gray400
import br.com.nearby.R
import br.com.nearby.data.model.mock.mockMarkets
import br.com.nearby.ui.theme.Gray500

@Composable
fun NearbyMarketDetailsInfos(modifier: Modifier = Modifier, market: Market) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        Text(text = "Informações", color = Gray400)
        Column() {
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                Icon(modifier = Modifier.size(16.dp),
                painter = painterResource(id = R.drawable.ic_ticket),
                tint = Gray500, contentDescription = "Icons cupom")
                Text(text = "${market.coupons} cupons disponiveis", color = Gray500)
            }

            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                Icon(modifier = Modifier.size(16.dp),
                    painter = painterResource(id = R.drawable.ic_map_pin),
                    tint = Gray500, contentDescription = "Icons location")
                Text(text = market.address, color = Gray500)
            }

            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                Icon(modifier = Modifier.size(16.dp),
                    painter = painterResource(id = R.drawable.ic_phone),
                    tint = Gray500, contentDescription = "Icons phone")
                Text(text = market.phone, color = Gray500)
            }
        }
    }
}

@Preview
@Composable
private fun MarketDetailsinfosPreview () {
    NearbyMarketDetailsInfos(
        modifier = Modifier.fillMaxWidth(),
        market = mockMarkets.first()
    )
}