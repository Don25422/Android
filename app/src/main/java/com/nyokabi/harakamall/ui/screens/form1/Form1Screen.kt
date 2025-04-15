package com.nyokabi.harakamall.ui.screens.form1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.navigation.ROUT_HOME
import com.nyokabi.harakamall.R
import com.nyokabi.harakamall.ui.theme.newdb
import com.nyokabi.harakamall.ui.theme.newgrey
import com.nyokabi.harakamall.ui.theme.neworange
import com.nyokabi.harakamall.ui.theme.newwhite

@Composable
fun Form1Screen(navController: NavController){
    Column ( modifier = Modifier.fillMaxSize().background(newdb),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
       Row (modifier = Modifier
           .padding(top = 20.dp)

       )
       {
           Image(
               painter = painterResource(R.drawable.img_11),
               contentDescription = "home",
           )

           Spacer(modifier = Modifier.width(10.dp))

           Text (text = "Logo App",
               fontSize = 20.sp,
               fontWeight = FontWeight.ExtraBold,
               color = newwhite

           )
       }
        Spacer(modifier = Modifier.height(10.dp))

        Image(
            painter = painterResource(R.drawable.img_10),
            contentDescription = "home",
            modifier = Modifier.height(100.dp).width(150.dp).padding(start = 20.dp)

        )

        
    }
}

@Preview(showBackground = true)
@Composable
fun Form1ScreenPreview(){
    Form1Screen(rememberNavController())
}