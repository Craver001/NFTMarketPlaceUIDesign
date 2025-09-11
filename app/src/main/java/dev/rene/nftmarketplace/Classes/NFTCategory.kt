package dev.rene.nftmarketplace.Classes


import dev.rene.nftmarketplace.R
import java.util.UUID

class NFTCategory (
    val title: String,
    val icon: Int,
    val id: UUID = UUID.randomUUID()
)

val categories = listOf<NFTCategory>(
    NFTCategory("Art", R.drawable.card_art),
    NFTCategory("Music", R.drawable.card_music),
    NFTCategory("Photography", R.drawable.card_vw)

)