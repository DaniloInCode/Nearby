package br.com.nearby.ui.components.market

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.nearby.R
import br.com.nearby.data.model.Market
import br.com.nearby.ui.theme.Gray100
import br.com.nearby.ui.theme.Gray200
import br.com.nearby.ui.theme.Gray400
import br.com.nearby.ui.theme.RedBase
import br.com.nearby.ui.theme.Typography

@Composable
fun NearbyMarketCard(modifier: Modifier = Modifier, market : Market, onClick : (Market) -> Unit) {
    Card(
        modifier = modifier.clip(RoundedCornerShape(12.dp))
            .background(Gray100)
            .border(width = 1.dp, color = Gray200, shape = RoundedCornerShape(12.dp)),
        onClick = {
            onClick(market)
        }
    ) {
        Row(
            modifier = Modifier.fillMaxWidth()
                .background(Gray100)
                .padding(8.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Image(modifier = Modifier
                .clip(RoundedCornerShape(12.dp))
                .fillMaxWidth(0.3f)
                .height(IntrinsicSize.Min)
                .aspectRatio(ratio = 1f, matchHeightConstraintsFirst = true),
                 contentScale = ContentScale.Crop,
                painter = painterResource(R.drawable.img_burger),
                contentDescription = "Imagem do estabelecimento" // TODO : substituir pela imagem do estabelecimento
            )
            Column{
                Text(text = market.name, style = Typography.labelLarge)
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = market.description, maxLines = 2, overflow = TextOverflow.Ellipsis)
                Spacer(modifier = Modifier.height(16.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                Icon(
                    modifier = Modifier.size(24.dp),
                    tint = if (market.coupons > 0) RedBase else Gray400,
                    painter = painterResource(id = R.drawable.ic_ticket),
                    contentDescription = "Ícone de cupom"
                )
                Text(
                    text = "${market.coupons} cupons disponíveis",
                    color = Gray400,

                    )

                }
            }
            }
        }
    }


@Preview
@Composable
private fun NearByMarketCardPreview() {
    NearbyMarketCard(
    modifier = Modifier.fillMaxWidth(),
    market = Market(
        id = "67621762-dajsj12-333jjdsdd-ccc",
        categoryId = "adjhsuidhauidha321y3821-dadad222-daad",
        name = "Sabor Grill",
        description = "Churrascaria com cortes nobres e buffet variado. Experiência completa para amantes de carne.",
        coupons = 5,
        rules = emptyList(),
        latitude = 12.0000,
        longitude = 13.0000,
        address = "Av.Paulista - Bela Vista",
        phone = "(11) 94567-1212",
        cover = "https:testeeeee.com.br"

    ),
    onClick = {}
    )
}