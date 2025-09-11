package dev.rene.nftmarketplace.Classes

import android.health.connect.datatypes.units.Percentage
import dev.rene.nftmarketplace.R
import java.util.UUID

class Ranking(
    val title: String,
    val image: Int,
    var eth: Double = 00.00,
    var percentChange: Double = 00.00,
    val id: UUID = UUID.randomUUID()
)

val rankings =  listOf<Ranking>(
    Ranking(" rank1", R.drawable.ranking01, 1233.44, 99.34),
    Ranking(" rank2", R.drawable.ranking02, 1033.44, 95.34),
    Ranking(" rank3", R.drawable.ranking03, 1133.44, 92.34),
    Ranking(" rank4", R.drawable.ranking04, 633.44, 88.34),
    Ranking(" rank5", R.drawable.ranking05, 344.44, 83.34),
    Ranking(" rank6", R.drawable.ranking06, 233.44, 79.34),
    Ranking(" rank7", R.drawable.ranking07, 133.44, 76.34),
    Ranking(" rank8", R.drawable.ranking08, 133.44, 75.34),
    Ranking(" rank9", R.drawable.ranking10, 123.44, 73.34),



)