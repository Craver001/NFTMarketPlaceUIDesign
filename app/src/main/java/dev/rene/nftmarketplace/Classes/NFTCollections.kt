package dev.rene.nftmarketplace.Classes

import dev.rene.nftmarketplace.R

class NFTCollections (
    val title:String,
    val Image: Int,
    var Likes: Int,

)

val collections = listOf<NFTCollections>(
    NFTCollections("card_3d", R.drawable.card_3d, 111 ),
    NFTCollections("card_abs23", R.drawable.card_abs23, 223),
    NFTCollections("card_abstract", R.drawable.card_abstract, 233)
)