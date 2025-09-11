package dev.rene.nftmarketplace.Component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
fun OnboardingCard() {
    Box(){
        // main background image
        Image(
            painter = painterResource(id = R.drawable.bg1),
            contentDescription = "Card background",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

    }
    Column (modifier = Modifier
        .fillMaxSize()
        .padding(horizontal = 30.dp, vertical = 80.dp)
    ){



        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .align(Alignment.CenterHorizontally)
        )

        {

            Text(
                text = "Welcome",
                color = Color.White,
                fontWeight = FontWeight.Black,
                fontSize = 36.sp,

                // adjust as needed
            )
            Text(
                text = "to NFT Marketplace",
                color = Color.White,
                fontWeight = FontWeight.Black,
                fontSize = 26.sp,

                )


        }



        Spacer(modifier = Modifier.fillMaxHeight(0.5f))
        //horizontalAlignment = Alignment.CenterHorizontally)


        Card(
            modifier = Modifier
                .padding(36.dp)
                .fillMaxWidth(),
               // .border(width = 1.dp, Color.Blue),
            shape = RoundedCornerShape(30.dp),
            // elevation = CardDefaults.cardElevation(8.dp),

        )
        {
            Box (modifier = Modifier
                .wrapContentHeight(),
                contentAlignment = Alignment.Center,

            ){


                // Background image
                Image(
                    painter = painterResource(id = R.drawable.cardblur),
                    contentDescription = "Card background",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )

                // Content
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally, // center horizontally
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)



                ) {
                    Text(
                        text = "Explore and Mint NFTs",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                    Text(
                        text = "You can exchange your NFTs with crypto",
                        color = Color.White,
                        fontSize = 15.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(top = 8.dp, start = 12.dp, end = 12.dp)
                    )

                    Spacer(modifier = Modifier.height(25.dp))

                    Button(
                        onClick = {},
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Text("Get Started")
                    }
                }

            }


        }
    }
}


@Preview
@Composable
fun CardPreviev(){
    NFTMarketplaceTheme{
        OnboardingCard()
    }
}