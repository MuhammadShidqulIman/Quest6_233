package com.example.myarsitektur

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.example.myarsitektur.ui.theme.MyArsitekturTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyArsitekturTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    // Panggil fungsi SiswaApp di sini
                    NavigasiApp()
                }
            }
        }
    }
}
