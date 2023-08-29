package com.uvg.laboratorio4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.uvg.laboratorio4.ui.theme.Laboratorio4Theme

class MainActivity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio4Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SettingsTab()
                }
            }
        }
    }
}

@Composable
fun SettingsTab() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Settings",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            textAlign = TextAlign.Center
        )


        Spacer(modifier = Modifier.height(16.dp))

        Divider(modifier = Modifier.padding(vertical = 8.dp))
        SettingSelection(title = "Edit Profile")
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        SettingSelection(title = "Email Adresses")
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        SettingSelection(title = "Notifications")
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        SettingSelection(title = "Privacy")
        Divider(
            modifier = Modifier
                .padding(vertical = 8.dp)
                .fillMaxWidth(),
            thickness = 25.dp,
            color = Color.Gray
        )
        SettingSelection(title = "Help&Feedback")
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        SettingSelection(title = "About")
        Divider(
            modifier = Modifier
                .padding(vertical = 8.dp)
                .fillMaxWidth(),
            thickness = 25.dp,
            color = Color.Gray
        )
        Text(
            text = "Log Out",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),

            textAlign = TextAlign.Center
        )
    }
}


@Composable
fun SettingSelection(title: String) {
    Text(
        text = title,
        style = MaterialTheme.typography.titleLarge,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        textAlign = TextAlign.Left
    )
}

@Composable
fun SettingScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        ProfileTab()
    }
}


