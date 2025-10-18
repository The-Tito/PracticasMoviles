package com.antonioselvas.cuartitosa_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import com.antonioselvas.cuartitosa_app.viewmodel.StudentViewModel
import com.antonioselvas.cuartitosa_app.presentation.navegation.NavManager
import com.antonioselvas.cuartitosa_app.ui.theme.CuartitosA_appTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val studentViewModel = ViewModelProvider(this)[StudentViewModel::class.java]
        enableEdgeToEdge()
        setContent {
            CuartitosA_appTheme {
                NavManager(studentViewModel)
            }
        }
    }
}

