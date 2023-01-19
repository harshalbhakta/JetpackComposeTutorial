package com.harshalbhakta.jetpackcomposetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.harshalbhakta.jetpackcomposetutorial.ui.theme.JetpackComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard(Message("Harshal", "Hey! How are you?"))
        }
    }
}

data class Message(val author: String, val body: String)

@Composable
fun MessageCard(message: Message) {
    Row (modifier = Modifier.padding(all = 8.dp)) {
        Image(
            painter = painterResource(R.drawable.harshal_cital_profile),
            contentDescription = "Contact profile picture",
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
        )

        // Add a horizontal space between the image and the column
        Spacer(modifier = Modifier.width(8.dp))

        Column {
            Text(text = message.author)
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = message.body)
        }
    }
}

@Preview
@Composable
fun PreviewMessageCard() {
    MessageCard(Message("Harshal", "Hey! How are you?"))
}