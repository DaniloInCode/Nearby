package br.com.nearby.data.model.mock
import br.com.nearby.data.model.Market
import br.com.nearby.data.model.Rule

val mockMarkets = listOf(
    Market(
        id = "67621762-dajsj12-333jjdsdd-ccc",
        categoryId = "adjhsuidhauidha321y3821-dadad222-daad",
        name = "Sabor Grill",
        description = "Churrascaria com cortes nobres e buffet variado. Experiência completa para amantes de carne.",
        coupons = 5,
        /*rules = listOf(
            Rule(id = "1", description = "Valido até o dia 25/12", marketId = "67621762-dajsj12-333jjdsdd-ccc"),
            Rule(id = "2", description = "Disponível apenas para consumo local", marketId = "67621762-dajsj12-333jjdsdd-ccc")
        ),*/
        latitude = 12.0000,
        longitude = 13.0000,
        address = "Av.Paulista - Bela Vista",
        phone = "(11) 94567-1212",
        cover = "https:testeeeee.com.br"

    ),
    Market(
        id = "22222222222222222",
        categoryId = "222333333333333333",
        name = "Boy na brasa",
        description = "Churrascaria com cortes nobres e buffet variado. Experiência completa para amantes de carne.",
        coupons = 5,
        /*rules = emptyList(),*/
        latitude = 12.0000,
        longitude = 13.0000,
        address = "Av.Paulista - Bela Vista",
        phone = "(11) 94567-1212",
        cover = "https:testeeeee.com.br"

    ),
)