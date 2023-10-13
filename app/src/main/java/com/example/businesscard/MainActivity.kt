package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppScreen()
                }
            }
        }
    }
}

@Composable
fun AppScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize().background(Color(0xFFD2E8D4)),
        verticalArrangement = Arrangement.SpaceAround
    ) {
        LogoAndNames()
        ContactDetails()
    }
}

@Composable
fun ContactDetails(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column {
            Row(verticalAlignment = Alignment.CenterVertically) {
                val image = painterResource(R.mipmap.ic_launcher)
                Image(painter = image, contentDescription = "call icon", Modifier.width(30.dp))
                Spacer(modifier = Modifier.width(20.dp).height(40.dp))
                Text(text = "(+234) 906 846 0732", fontWeight = FontWeight.Medium, color = Color(0XFF091C10))
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                val image = painterResource(R.mipmap.share)
                Image(painter = image, contentDescription = "share icon", Modifier.width(30.dp))
                Spacer(modifier = Modifier.width(20.dp).height(40.dp))
                Text(text = "@MbFreed", fontWeight = FontWeight.Medium, color = Color(0XFF091C10))
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                val image = painterResource(R.mipmap.mail)
                Image(painter = image, contentDescription = "mail icon", Modifier.width(30.dp))
                Spacer(modifier = Modifier.width(20.dp).height(40.dp))
                Text(text = "freedteck@gmail.com", fontWeight = FontWeight.Medium, color = Color(0XFF091C10))
            }
        }
    }
}

@Composable
fun LogoAndNames(modifier: Modifier = Modifier) {
    Column(
        modifier
            .fillMaxWidth()
            .padding(top = 60.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val image = painterResource(R.drawable.android_logo)
        Image(
            painter = image,
            contentDescription = "Logo",
            modifier = modifier
                .background(Color(0xFF073042))
                .width(200.dp)
        )
        Text(text = "Mubarak Freed", fontSize = 48.sp, color = Color(0XFF091C10))
        Text(
            text = "Android Developer Extraordinary",
            fontSize = 18.sp, color = Color(0XFF00703B),
            fontWeight = FontWeight.Bold
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        AppScreen()
    }
}