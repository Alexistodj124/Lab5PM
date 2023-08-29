package com.uvg.laboratorio4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.uvg.laboratorio4.ui.theme.Laboratorio4Theme

class MainActivity4 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio4Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    emergencyTab()
                }
            }
        }
    }
}

@Composable
fun emergencyTab(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Emergency Contacts",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(16.dp))
        SettingSelection(title = "Emergencias")
        SettingSelection(title = "Si se presenta un incidente o un percance por favor marca el numero de emergencia y rapidamente te apoyamos.")
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            content = {
                Text(
                    text = "Call 5978-1736"
                )
            },
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White
            )
        )
        Spacer(modifier = Modifier.height(16.dp))
        SettingSelection(title = "Clinica UVG")
        SettingSelection(title = "La Clinica UVG presenta los siguientes servicios: \n\n Atncion a Emergencias \n Atencion Primaria a enfermedades comunes\n Plan educacional Sobre enferemedades\n\n Horario de atencion: 7 am - 8:30 pm")
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            content = {
                Text(
                    text = "Call 2507-1500 ex 21212"
                )
            },
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White
            )
        )
    }
}