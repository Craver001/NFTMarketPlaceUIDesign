package dev.rene.nftmarketplace



import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import dev.rene.nftmarketplace.Component.OnboardingCard
import dev.rene.nftmarketplace.ui.theme.NFTMarketplaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NFTMarketplaceTheme {
                Surface(modifier = Modifier.fillMaxSize(),
                       color = MaterialTheme.colorScheme.primary){

                    OnboardingCard()

                }
            }
        }
    }
}

