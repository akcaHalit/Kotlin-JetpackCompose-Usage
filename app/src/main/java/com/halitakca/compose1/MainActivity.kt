package com.halitakca.compose1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
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
        Text(text = "Hello Halit",color = Color.Blue, fontSize = 25.sp, fontWeight = FontWeight.Bold)//color = MaterialTheme.colors.onSecondary
    }

    //      Preview'ın altında ne yazıyorsa Preview'da görünecek O'dur.  onCreate ile bir alakası yok yani.
    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {

        // Column Row Box

        Column{
            Text(text = "Hello Halit",color = Color.Blue, fontSize = 25.sp, fontWeight = FontWeight.Bold)//color = MaterialTheme.colors.onSecondary
            Text(text = "Hello Halit",color = Color.Blue, fontSize = 25.sp, fontWeight = FontWeight.Bold)//color = MaterialTheme.colors.onSecondary
        }
        Row{
            Text(text = "Hello Halit",color = Color.Blue, fontSize = 25.sp, fontWeight = FontWeight.Bold)//color = MaterialTheme.colors.onSecondary
            Text(text = "Hello Halit",color = Color.Blue, fontSize = 25.sp, fontWeight = FontWeight.Bold)//color = MaterialTheme.colors.onSecondary
        }
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


