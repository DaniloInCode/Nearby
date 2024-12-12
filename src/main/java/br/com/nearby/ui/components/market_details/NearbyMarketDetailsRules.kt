package br.com.nearby.ui.components.market_details
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.nearby.data.model.Rule
import br.com.nearby.data.model.mock.mockRules
import br.com.nearby.ui.theme.Gray400
import br.com.nearby.ui.theme.Gray500

@Composable
fun NearbyMarketDetailsRules(modifier: Modifier = Modifier, rules : List<Rule>) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(text = "Regulamento", color = Gray400)
        Text(
         modifier = Modifier.padding(start = 16.dp),
         text = rules.joinToString(separator = "\n", transform = {". ${it.description}"}),
            lineHeight = 24.sp,
            color = Gray500
        )
    }
}

@Preview
@Composable
private fun MarketDetailsRulesPreview() {
        NearbyMarketDetailsRules(
            rules = mockRules
        )
}