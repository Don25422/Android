package com.nyokabi.harakamall.ui.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.carousel.CarouselDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.navigation.ROUT_ABOUT
import com.navigation.ROUT_HOME
import com.navigation.ROUT_INTENT
import com.navigation.ROUT_ITEM
import com.navigation.ROUT_START
import com.nyokabi.harakamall.R
import com.nyokabi.harakamall.ui.theme.neworange
import com.nyokabi.harakamall.ui.theme.newwhite

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(navController: NavController){
    Column (modifier = Modifier
        .fillMaxSize()
        .background(neworange)
        .verticalScroll(rememberScrollState())
    ){

        Box (){
            //Card
            Card (
                modifier = Modifier.fillMaxWidth().height(300.dp),
                shape = RoundedCornerShape(bottomStart = 60.dp, bottomEnd = 60.dp),
                colors = CardDefaults.cardColors(newwhite)
            ){
                TopAppBar(
                    title = { Text(text = "Dashboard Section") },
                    navigationIcon = {
                        IconButton(onClick = {}) {
                            Icon(imageVector = Icons.Default.Menu, contentDescription = "icon for menu")
                        }
                    },

                    )

            }
            //End of card

            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
                    .align(alignment = Alignment.BottomCenter)
                    .padding(start = 20.dp, end = 20.dp)
                    .offset(y = 90.dp)



            ){
                Column (modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Text(text = "HARAKAMALL", fontSize = 40.sp)

                }
            }

        }
        //End of box

        Spacer(modifier = Modifier.height(100.dp))

        //Row1
        Row(modifier = Modifier.padding(start = 20.dp)) {
            //Card1
            Card(modifier = Modifier
                .width(150.dp)
                .height(180.dp)
                .clickable{ navController.navigate(ROUT_HOME)}
            ) {
                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Image(
                        painter = painterResource(R.drawable.img_2),
                        contentDescription = "home"
                    )
                     Text(text ="Home", fontSize = 15.sp )
                }

            }
            //End of card1

            Spacer(modifier = Modifier.width(40.dp))


            //Card2
            Card(modifier = Modifier
                .width(150.dp)
                .height(180.dp)
                .clickable{ navController.navigate(ROUT_ABOUT)}
            ) {
                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Image(
                        painter = painterResource(R.drawable.img_3),
                        contentDescription = "home"
                    )
                    Text(text ="About", fontSize = 15.sp )
                }

            }
            //End of card2
        }

        //End of row1

        Spacer(modifier = Modifier.height(20.dp))

        //Row2
        Row(modifier = Modifier.padding(start = 20.dp)) {
            //Card1
            Card(modifier = Modifier
                .width(150.dp)
                .height(180.dp)
                .clickable{ navController.navigate(ROUT_INTENT)}

            ) {
                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Image(
                        painter = painterResource(R.drawable.img_4),
                        contentDescription = "home"
                    )
                    Text(text ="Contact", fontSize = 15.sp )
                }

            }
            //End of card1

            Spacer(modifier = Modifier.width(40.dp))


            //Card2
            Card(modifier = Modifier
                .width(150.dp)
                .height(180.dp)
                .clickable{ navController.navigate(ROUT_ITEM)}
            ) {
                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Image(
                        painter = painterResource(R.drawable.img_5),
                        contentDescription = "home"
                    )
                    Text(text ="Products", fontSize = 15.sp )
                }

            }
            //End of card2
        }

        //End of row2






    }

}

@Preview(showBackground = true)
@Composable
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())
}