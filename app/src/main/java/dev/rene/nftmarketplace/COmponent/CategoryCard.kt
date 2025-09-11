package dev.rene.nftmarketplace.Component


import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.rene.nftmarketplace.R
import dev.rene.nftmarketplace.ui.theme.NFTMarketplaceTheme

@Composable
fun CategoryCard(title: String, Image: Painter){

        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(27.dp))
                .border(
                    width = 1.dp,
                    Color.White,
                    shape = RoundedCornerShape(27.dp) )
                .height(186.dp)
                .width(280.dp)


        ){
            Image(
                painter = Image,
                contentDescription = "category card",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop)

            Text(title,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = (25.sp),
                textAlign = TextAlign.Center,
                modifier = Modifier
                   .align(Alignment.BottomCenter)
                   .padding(bottom = 15.dp))



        }


}

@Preview
@Composable
fun CategoryPreview () {
    NFTMarketplaceTheme {

        CategoryCard("Art", painterResource(R.drawable.card_art))

    }

}