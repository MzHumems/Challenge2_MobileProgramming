package com.example.challenge2_mobile

import android.content.res.Resources
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.challenge2_mobile.ui.theme.Challenge2_MobileTheme

// Challenge 2
// Zaid Sa'ad Humam (191344031)

val Crimson = 0xff750101
val Moss = 0xff054A09
val jingga = 0xffEB5E34
val Horizontal = Alignment.CenterHorizontally
val Vertikal = Arrangement.Center
val MaxSize = Modifier.fillMaxSize()
val circle = Modifier
    .size(100.dp)
    .clip(CircleShape)
    .border(2.dp, Color.White, CircleShape)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            celeng2()
        }
    }
}

//Menangkap ukuran layar handphone
fun getScreenWidth(): Int {
    return Resources.getSystem().displayMetrics.widthPixels
}
fun getScreenHeight(): Int {
    return Resources.getSystem().displayMetrics.heightPixels
}

//UI
@Preview(showBackground = true)
@Composable
fun celeng2() {
    val surfaceWidth = getScreenWidth()
    val surfaceHeigt = getScreenHeight()
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxHeight()
    ){
        Row(
            verticalAlignment = Alignment.CenterVertically
        ){
            Surface(
                modifier = Modifier.size(surfaceWidth.dp, surfaceHeigt.dp),
                color = Color(jingga)
            ){
                Column(
                    verticalArrangement = Vertikal,
                    horizontalAlignment = Horizontal,
                    modifier = MaxSize
                ){
                    Image(
                        painter = painterResource(id = R.drawable.bacon),
                        contentDescription = "bacon bergoyang",
                        modifier = circle
                    )
                    Text(text = "P1", fontSize = 12.sp, textAlign = TextAlign.Center)
                }
            }

            Surface(
                modifier = Modifier.size(surfaceWidth.dp, surfaceHeigt.dp),
                color = Color(Moss)
            ){
                Column(
                    verticalArrangement = Vertikal,
                    horizontalAlignment = Horizontal,
                    modifier = MaxSize
                ){
                    Image(
                        painter = painterResource(id = R.drawable.seall),
                        contentDescription = "seal bergoyang"
                    )
                    Text(text = "P2", fontSize = 12.sp, textAlign = TextAlign.Center)
                }
            }

            Surface(
                modifier = Modifier.size(surfaceWidth.dp, surfaceHeigt.dp),
                color = Color(Crimson)
            ){
                Column(
                    verticalArrangement = Vertikal,
                    horizontalAlignment = Horizontal,
                    modifier = MaxSize
                ){
                    Image(
                        painter = painterResource(id = R.drawable.pizza),
                        contentDescription = "pizza bergoyang",
                        modifier = circle
                    )
                    Text(text = "P3", fontSize = 12.sp, textAlign = TextAlign.Center)
                }
            }
        }

        Row(
            verticalAlignment = Alignment.CenterVertically
        ){
            Surface(
                modifier = Modifier.size(surfaceWidth.dp, surfaceHeigt.dp),
                color = Color(Crimson)
            ){
                Column(
                    verticalArrangement = Vertikal,
                    horizontalAlignment = Horizontal,
                    modifier = MaxSize
                ){
                    Image(
                        painter = painterResource(id = R.drawable.ghostly1),
                        contentDescription = "jurig bergoyang",
                        modifier = circle
                    )
                    Text(text = "P4", fontSize = 12.sp, textAlign = TextAlign.Center)
                }
            }

            Surface(
                modifier = Modifier.size(surfaceWidth.dp, surfaceHeigt.dp),
                color = Color(jingga)
            ){
                Column(
                    verticalArrangement = Vertikal,
                    horizontalAlignment = Horizontal,
                    modifier = MaxSize
                ){
                    Image(
                        painter = painterResource(id = R.drawable.burrito),
                        contentDescription = "burrito bergoyang"
                    )
                    Text(text = "P5", fontSize = 12.sp, textAlign = TextAlign.Center)
                }
            }

            Surface(
                modifier = Modifier.size(surfaceWidth.dp, surfaceHeigt.dp),
                color = Color(Moss)
            ){
                Column(
                    verticalArrangement = Vertikal,
                    horizontalAlignment = Horizontal,
                    modifier = MaxSize
                ){
                    Image(
                        painter = painterResource(id = R.drawable.breado),
                        contentDescription = "roti bergoyang",
                        modifier = circle
                    )
                    Text(text = "P6", fontSize = 12.sp, textAlign = TextAlign.Center)
                }
            }
        }
    }
}