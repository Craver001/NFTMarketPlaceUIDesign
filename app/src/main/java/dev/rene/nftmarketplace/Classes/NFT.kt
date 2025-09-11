package dev.rene.nftmarketplace.Classes

import dev.rene.nftmarketplace.R
import java.util.UUID


class NFT (

    val title: String,
    val subTitle: String,
    val Image: Int,
    var likes: Int,
    var eth: Double = 0.0,
    val id: UUID = UUID.randomUUID()

)

val nfts = listOf<NFT>(
    NFT("wave1", "wave1", R.drawable.card_wave, 334, 123.3),
    NFT("abstract", "Abs", R.drawable.card_abstract, 2354, 237.23),
    NFT("meta", "metaverse", R.drawable.card_metaverse, 4433,563.43) ,
    NFT("Music", "Music", R.drawable.card_music, 23345, 388.233),
    NFT( "Ring", "Ring", R.drawable.card_ring, 23664, 993.23),
    NFT("Ball", "Ball", R.drawable.card_ball, 3636, 233.44)
)