package com.example.auth.ui


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Failed(){
    Box(Modifier
        .fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text("Failed 👁️👄👁️", fontSize = 20.sp);
    }
}

@Preview
@Composable
fun FailedPreview(){
    Failed()
}