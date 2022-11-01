package com.example.challenge2_mobile
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.challenge2_mobile.ui.theme.Challenge2_MobileTheme

class MainActShort : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Challenge2_MobileTheme() {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ComposeQuadrantApp()
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrantApp() {
    Column(Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier.weight(1f)
        ) {
            ComposableInfoCard(
                title = stringResource(R.string.p1),
                description = stringResource(R.string.p1_desc),
                backgroundColor = Color(0xFFe0091f),
                modifier = Modifier.weight(1f)
            )
            ComposableInfoCard(
                title = stringResource(R.string.p2),
                description = stringResource(R.string.p2_desc),
                backgroundColor = Color(0xFF388518),
                modifier = Modifier.weight(1f)
            )
            ComposableInfoCard(
                title = stringResource(R.string.p3),
                description = stringResource(R.string.p3_desc),
                backgroundColor = Color.Yellow,
                modifier = Modifier.weight(1f)
            )
        }

        Row(
            modifier = Modifier.weight(1f)
        ) {
            ComposableInfoCard(
                title = stringResource(R.string.p4),
                description = stringResource(R.string.p4_desc),
                backgroundColor = Color(0xfff7521b) ,
                modifier = Modifier.weight(1f)
            )
            ComposableInfoCard(
                title = stringResource(R.string.p5),
                description = stringResource(R.string.p5),
                backgroundColor = Color(0xfff57fd4),
                modifier = Modifier.weight(1f)
            )
            ComposableInfoCard(
                title = stringResource(R.string.p6),
                description = stringResource(R.string.p6_desc),
                backgroundColor = Color(0xfff7bd48),
                modifier = Modifier.weight(1f)
            )
        }

    }
}

// weight issue : https://stackoverflow.com/questions/64751198/column-weight-distribution-in-compose

@Composable
private fun ComposableInfoCard(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Image(
            painter = painterResource(id = R.drawable.burrito),
            contentDescription = "luffy",
            modifier = Modifier
                .padding(bottom = 24.dp)
                .clip(RoundedCornerShape(percent = 50))
                .border(4.dp, Color.White, CircleShape)
        )

        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 4.dp),
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}



@Preview(showBackground = true)
@Composable
fun BirthDayCardPreview() {
    Challenge2_MobileTheme() {
        ComposeQuadrantApp()
    }
}