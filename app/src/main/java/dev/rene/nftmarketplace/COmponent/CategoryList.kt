package dev.rene.nftmarketplace.Component


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.rene.nftmarketplace.Classes.categories // form NFT Categories
import dev.rene.nftmarketplace.ui.theme.NFTMarketplaceTheme

@Composable
fun CategoryList(){
    LazyRow(modifier = Modifier.padding(10.dp),
                horizontalArrangement = Arrangement.spacedBy (10.dp))

    {
        items(categories) { category ->
                CategoryCard(
                    title = category.title,
                    Image =  painterResource(category.icon))

        }
    }
}

@Preview
@Composable
fun CategoryListPreview(){
    NFTMarketplaceTheme {
        CategoryList()
    }

}