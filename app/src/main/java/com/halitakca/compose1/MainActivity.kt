package com.halitakca.compose1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.halitakca.compose1.ui.theme.Compose1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting(name = "Android")
        }
    }

    // LAMBDA
    fun test1(int: Int, myFunction: () -> Unit){
        myFunction.invoke()
    }
    fun testFunctionLambda(){
        println("TEST")
    }

    @Composable
    fun Greeting(name: String) {
        Text(text = "Hello $name!")
    }

    //      Preview'ın altında ne yazıyorsa Preview'da görünecek O'dur.  onCreate ile bir alakası yok yani.
    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        Compose1Theme {
            Greeting("Android")
        }
    }
}