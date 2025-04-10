package com.nyokabi.harakamall.ui.screens.assignment

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.navigation.ROUT_HOME
import com.nyokabi.harakamall.R
import com.nyokabi.harakamall.ui.theme.newblue
import com.nyokabi.harakamall.ui.theme.newgreen
import com.nyokabi.harakamall.ui.theme.neworange
import com.nyokabi.harakamall.ui.theme.newwhite

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AssignmentScreen(navController: NavController){


    //scaffold
    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(


        //BottomBar
        bottomBar = {
            NavigationBar(
                containerColor = newwhite
            ){
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                    label = { Text("") },
                    selected = selectedIndex == 0,
                    onClick = { selectedIndex = 0
                        navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.DateRange, contentDescription = "Favorites") },
                    label = { Text("") },
                    selected = selectedIndex == 1,
                    onClick = { selectedIndex = 1
                        navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Info, contentDescription = "Profile") },
                    label = { Text("") },
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2
                        //  navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.AccountCircle, contentDescription = "Profile") },
                    label = { Text("Info") },
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2
                        navController.navigate(ROUT_HOME)
                    }
                )

            }
        },

        //FloatingActionButton
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* Add action */ },
                containerColor = neworange
            ) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
            ) {


                Column (
                    modifier = Modifier.fillMaxSize().padding(start = 20.dp, top = 90.dp),

                ){
                    Text(text = "Hi Samantha",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Text(text = "Here are your projects")

                    Spacer(modifier = Modifier.height(40.dp))

                   //row
                    Row (
                        modifier = Modifier.horizontalScroll(rememberScrollState())
                    ){
                        //Card1
                        Card(modifier = Modifier
                            .width(150.dp)
                            .height(250.dp)
                            .clickable{ navController.navigate(ROUT_HOME)}
                        ) {
                            Column (
                                modifier = Modifier.fillMaxSize().background(newblue),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,

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
                            .height(250.dp)
                            .clickable{ navController.navigate(ROUT_HOME)}
                        ) {
                            Column (
                                modifier = Modifier.fillMaxSize().background(neworange).padding(20.dp),
                                verticalArrangement = Arrangement.Center

                            ){
                                Image(
                                    painter = painterResource(R.drawable.img_2),
                                    contentDescription = "home"
                                )
                                Text(text ="Statistics", fontSize = 15.sp )
                                Text(text ="Dashboard", fontSize = 15.sp )
                            }

                        }
                        //End of card2

                        Spacer(modifier = Modifier.width(40.dp))

                        //Card3
                        Card(modifier = Modifier
                            .width(150.dp)
                            .height(250.dp)
                            .clickable{ navController.navigate(ROUT_HOME)}
                        ) {
                            Column (
                                modifier = Modifier.fillMaxSize().background(newgreen),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ){


                            }

                        }
                        //End of card3



                    }
                }











            }
        }
    )

    //End of scaffold


}

@Preview(showBackground = true)
@Composable
fun AssignmentScreenPreview(){
    AssignmentScreen(rememberNavController())
}