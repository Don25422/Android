package com.nyokabi.harakamall.ui.screens.intent

import android.content.Intent
import android.provider.MediaStore
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.navigation.ROUT_ITEM
import com.nyokabi.harakamall.ui.theme.neworange
import com.nyokabi.harakamall.ui.theme.newwhite

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IntentScreen(navController: NavController){
    Column (modifier = Modifier.fillMaxSize()){

        val mContext = LocalContext.current

        //topappbar
        TopAppBar(
            title = { Text(text = "Intents") },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = neworange,
                titleContentColor = newwhite,
                navigationIconContentColor = newwhite,
                actionIconContentColor = newwhite
            ),
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "icon for menu")
                }
            },
            actions = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Share, contentDescription = "")
                }

                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Settings, contentDescription = "")
                }







            }
        )
        //end

        Spacer(modifier = Modifier.height(20.dp))

        //mpesa
        Button(onClick = {
            val simToolKitLaunchIntent =
                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { mContext.startActivity(it) }


        },
            colors = ButtonDefaults.buttonColors(neworange),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start =20.dp, end = 20.dp)

        ) {
            Text( text = "Mpesa")
        }

        Spacer(modifier = Modifier.height(20.dp))

        //call
        Button(onClick = {
            val callIntent=Intent(Intent.ACTION_DIAL)
            callIntent.data="tel:0720245837".toUri()
            mContext.startActivity(callIntent)
        },
            colors = ButtonDefaults.buttonColors(neworange),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start =20.dp, end = 20.dp)

        ) {
            Text( text = "Call")
        }
        Spacer(modifier = Modifier.height(20.dp))

        //sms
        Button(onClick = {
            val smsIntent=Intent(Intent.ACTION_SENDTO)
            smsIntent.data="smsto:0720245837".toUri()
            smsIntent.putExtra("sms_body","Hello Glory,how was your day?")
            mContext.startActivity(smsIntent)
        },
            colors = ButtonDefaults.buttonColors(neworange),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start =20.dp, end = 20.dp)

        ) {
            Text( text = "SMS")
        }
        Spacer(modifier = Modifier.height(20.dp))

        //share
        Button(onClick = {
            val shareIntent=Intent(Intent.ACTION_SEND)
            shareIntent.type="text/plain"
            shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this is a cool content")
            mContext.startActivity(Intent.createChooser(shareIntent, "Share"))
        },
            colors = ButtonDefaults.buttonColors(neworange),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start =20.dp, end = 20.dp)

        ) {
            Text( text = "Share")
        }
        Spacer(modifier = Modifier.height(20.dp))

        //camera
        Button(onClick = {
            val cameraIntent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (cameraIntent.resolveActivity(mContext.packageManager)!=null){
                mContext.startActivity(cameraIntent)
            }else{
                println("Camera app is not available")
            }
        },
            colors = ButtonDefaults.buttonColors(neworange),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start =20.dp, end = 20.dp)

        ) {
            Text( text = "Camera")
        }
        Spacer(modifier = Modifier.height(20.dp))

        //email
        Button(onClick = {
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("akinyiglory2@gmail.com"))
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
            mContext.startActivity(shareIntent)
        },
            colors = ButtonDefaults.buttonColors(neworange),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start =20.dp, end = 20.dp)

        ) {
            Text( text = "Email")
        }


    }

}

@Preview(showBackground = true)
@Composable
fun IntentScreenPreview(){
    IntentScreen(rememberNavController())
}