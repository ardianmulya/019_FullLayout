package com.example.layout_activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.layout_activity.ui.theme.Layout_ActivityTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Layout_ActivityTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Home()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun Boximage( Ket : String){
    val image = painterResource(R.drawable.background)
    Box(modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(20.dp))
            .background(Color.Cyan)){
            Column (horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth()){
                Image(painter = image,
                    contentDescription = null,
                    contentScale = ContentScale.FillHeight,
                    modifier = Modifier.size(200.dp)
                )
                Text(text = Ket,
                    fontSize = 20.sp,
                    lineHeight = 110.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)
                )
            }
        }
}

@Composable
fun keterangan(){
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth()){
        Text(text = "19 C",
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold
        )
        Row (){
            Image(painter = painterResource(R.drawable.location_on), contentDescription = "",
                modifier = Modifier.size(60.dp)
                )
            Spacer(modifier = Modifier.padding(10.dp))
            Text(text = "Yogyakarta",
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Text(text = "Jl. Brawijaya, Geblagan, Tamantirto, Kec. Kasihan, Kabupaten Bantul, Daerah Istimewa Yogyakarta ",
            textAlign = TextAlign.Center,
            color = Color.Gray,
            modifier = Modifier.padding(10.dp)
            )
    }
}

@Composable
fun detail(){
    Box (modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(20.dp))
        .background(color = Color.Cyan)
        .height(200.dp)){
        Column (horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
            .fillMaxSize(), verticalArrangement = Arrangement.SpaceAround
            ){
            Row (horizontalArrangement = Arrangement.SpaceAround, modifier = Modifier.fillMaxWidth()){
                Column (horizontalAlignment = Alignment.CenterHorizontally){
                    Text(text = "Humidity", fontSize = 20.sp)
                    Text(text = "98%", fontWeight = FontWeight.Bold, fontSize = 25.sp)
                }
                Column (horizontalAlignment = Alignment.CenterHorizontally){
                    Text(text = "UV Index", fontSize = 20.sp)
                    Text(text = "9/10",  fontWeight = FontWeight.Bold, fontSize = 25.sp)
                }
            }

            Row (horizontalArrangement = Arrangement.SpaceAround, modifier = Modifier.fillMaxWidth()){
                Column (horizontalAlignment = Alignment.CenterHorizontally){
                    Text(text = "Sunrise", fontSize = 20.sp)
                    Text(text = "05.00 AM",  fontWeight = FontWeight.Bold, fontSize = 25.sp)
                }
                Column (horizontalAlignment = Alignment.CenterHorizontally){
                    Text(text = "Sunset", fontSize = 20.sp)
                    Text(text = "05.40 PM", fontWeight = FontWeight.Bold, fontSize = 25.sp)
                }
            }
        }
    }
}

@Composable
fun Home(){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Ardian Mulya W", fontSize = 40.sp)
        Boximage(Ket = "Rain")
        Spacer(modifier = Modifier.padding(10.dp))
        keterangan()
        Spacer(modifier = Modifier.padding(10.dp))
        detail()
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Layout_ActivityTheme {
        Home()
    }
}