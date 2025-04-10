package com.nyokabi.harakamall.ui.screens.Home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.navigation.ROUT_START
import com.nyokabi.harakamall.R

@Composable
fun HomeScreen(navController: NavController){

Column (
    modifier = Modifier
        .fillMaxSize()
        .paint(painter = painterResource(R.drawable.img_6), contentScale = ContentScale.FillBounds)

){
    Text(
        text = "HarakaMall",
        fontSize = 30.sp,
        color = Color.Magenta,
        fontWeight = FontWeight.ExtraBold

    )

    Image(
        painter = painterResource(R.drawable.home),
        contentDescription = "home"
    )




    Text(
        text = "Welcome to my app",
        fontSize = 15.sp,
        fontStyle = FontStyle.Italic
    )

    Text(
        text = "welcome to my mall where all services are important and available with an affordable budget",
        fontSize = 15.sp,
        fontStyle = FontStyle.Italic
    )

    Button(onClick = {
        navController.navigate(ROUT_START)
    },
        colors = ButtonDefaults.buttonColors(),
        shape = RoundedCornerShape(10.dp)
    ) {
        Text( text = "Add to cart")
    }

}



}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){

HomeScreen(rememberNavController())

}