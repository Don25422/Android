package com.nyokabi.harakamall.ui.screens.start

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.navigation.ROUT_DASHBOARD
import com.navigation.ROUT_ITEM
import com.nyokabi.harakamall.R
import com.nyokabi.harakamall.ui.theme.neworange

@Composable
fun StartScreen(navController: NavController){

Column (
    modifier = Modifier.fillMaxSize(),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center,

){

    Text(
        text = "HarakaMall",
        fontSize = 20.sp
    )

    Spacer(modifier = Modifier.height(20.dp))


    //circular image
    Image(
        painter = painterResource(R.drawable.img),
        contentDescription = "home",
        modifier = Modifier.size(300.dp).clip(shape = CircleShape),
        contentScale = ContentScale.Crop
    )
    // end

    Spacer(modifier = Modifier.height(20.dp))


    Text(
        text = "Find your order!!!",
        fontSize = 30.sp,
        fontWeight = FontWeight.ExtraBold,
        color = neworange
        )

    Spacer(modifier = Modifier.height(20.dp))


    Text(
        text = "Find New Products & Suppliers — Traditional Sourcing Brought Online. Find Quality Products & Contact Verified Suppliers! Reduce Costs With Factory Direct Sourcing. Low MOQ, OEM/ODM Available. Source Now!",
        textAlign = TextAlign.Center,
        fontSize = 18.sp
        )


    Spacer(modifier = Modifier.height(20.dp))



    Button(onClick = {
        navController.navigate(ROUT_DASHBOARD)
    },
        colors = ButtonDefaults.buttonColors(neworange),
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier.fillMaxWidth().padding(start =20.dp, end = 20.dp)

    ) {
        Text( text = "Get started")
    }



}


}

@Preview(showBackground = true)
@Composable
fun StartScreenPreview(){
    StartScreen(rememberNavController())
}