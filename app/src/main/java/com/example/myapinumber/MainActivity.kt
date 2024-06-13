package com.example.myapinumber

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapinumber.compose.ActivityScreen
import com.example.myapinumber.ui.theme.MyApiNumberTheme
import com.example.myapinumber.viewmodel.MainViewModel

class MainActivity : ComponentActivity() {
    private val viewModel = MainViewModel() // Crea una instancia del ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApiNumberTheme {
                // Llama a NumberFactScreen pasando el ViewModel como argumento
                ActivityScreen(viewModel)
            }
        }
    }
}



@Composable
@Preview(showBackground = true)
fun MainScreenPreview() {
    MyApiNumberTheme {
        // Llama a NumberFactScreen en la vista previa
        ActivityScreen(MainViewModel())
    }
}