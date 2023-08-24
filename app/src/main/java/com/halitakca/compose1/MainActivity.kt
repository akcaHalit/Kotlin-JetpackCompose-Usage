package com.halitakca.compose1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.halitakca.compose1.ui.theme.Compose1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

    @Composable
    fun MainScreen(){
        Column(modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CustomText(text = "Halit")
            Spacer(modifier = Modifier.padding(5.dp))
            CustomText(text = "Android")
            Spacer(modifier = Modifier.padding(5.dp))
            CustomText(text = "Kotlin")

            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
                    ){
                CustomText(text = "Test 1")
                CustomText(text = "Test 2")
                CustomText(text = "Test 3")

            }
        }
    }

@Composable
fun CustomText(text: String){
    Text(modifier = Modifier
        .background(color = Color.Yellow)
        .padding(start = 10.dp, top = 5.dp, end = 13.dp)
        .clickable {
            println("Hello Halit Clicked!")
        }
        //.width(150.dp)
        //.height(20.dp)
        //.size(width = 40.dp, height = 100.dp)
        //.fillMaxSize(0.5f)
        ,text = "Hello $text",
        color = Color.Blue,
        fontSize = 25.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center)
}

    //      Preview'ın altında ne yazıyorsa Preview'da görünecek O'dur.  onCreate ile bir alakası yok yani.
    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {

        MainScreen()





        /*
Row{
    Text(text = "Hello Halit",color = Color.Blue, fontSize = 25.sp, fontWeight = FontWeight.Bold)//color = MaterialTheme.colors.onSecondary
    Text(text = "Hello Halit",color = Color.Blue, fontSize = 25.sp, fontWeight = FontWeight.Bold)//color = MaterialTheme.colors.onSecondary
}
 */
    }
/* LAMBDA
fun test1(int: Int, myFunction: () -> Unit){
    myFunction.invoke()
}
 */
/*
    @Composable
    fun Greeting(name: String) {
        Text(text = "Hello $name!",color = Color.Blue, fontSize = 25.sp, fontWeight = FontWeight.Bold)//color = MaterialTheme.colors.onSecondary
    }
 */


