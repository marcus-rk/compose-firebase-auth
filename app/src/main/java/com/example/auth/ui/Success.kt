package com.example.auth.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.google.firebase.auth.FirebaseAuth

@Composable
fun Success(){
    Box(Modifier
        .fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Column (){
            Text("Success 🚀", fontSize = 20.sp);
            val userMail: String? = FirebaseAuth.getInstance().currentUser!!.email;
            Text(userMail!!, fontSize = 20.sp);
        }
    }
}

@Preview
@Composable
fun SuccessPreview(){
    Success()
}