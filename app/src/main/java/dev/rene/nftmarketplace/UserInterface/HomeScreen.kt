package dev.rene.nftmarketplace.UserInterface


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.rene.nftmarketplace.Component.CategoryList
import dev.rene.nftmarketplace.ui.theme.NFTMarketplaceTheme

@Composable
fun HomeScreen() {
    // 🔹 Foreground scaffold
    Scaffold(
        containerColor = Color(33, 17, 52), // make scaffold background transparent
        modifier = Modifier.padding(10.dp)
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Welcome to NFT Marketplace",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier.padding(15.dp)
            )
            CategoryList()
        }
    }

}

@Preview
@Composable
fun HomeScreenPreview(){
    NFTMarketplaceTheme {
        HomeScreen()
    }
}