package com.example.tarjetapresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarjetapresentacion.ui.theme.TarjetaPresentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaPresentacionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage(message = "Dylan Bruno Gonzales Camarena", from = "From Dylan_Ricardo_Fabrizzio")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TarjetaPresentacionPreview() {
    TarjetaPresentacionTheme {
        GreetingImage(message = "Dylan Bruno Gonzales Camarena", from ="From Dylan_Ricardo_Fabrizzio")
    }
}


@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    // Create a column so that texts don't overlap
    val imagenPresentacion = painterResource(R.drawable.fotopresentacion)
    val imagenTelefono = painterResource(R.drawable.telefono)
    val imagenRedes = painterResource(R.drawable.redessociales)
    val imagenEmail = painterResource(R.drawable.email)
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Image(
            painter = imagenPresentacion,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(150.dp)
        )
        Text(
            text = message,
            fontSize = 20.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = from,
            fontSize = 15.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.End)
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center, // Center horizontally
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painter = imagenTelefono,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(25.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "(+51) 968599003",
                fontSize = 15.sp,
                textAlign = TextAlign.Center
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center, // Center horizontally
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painter = imagenRedes,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(25.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "@GRUPO1_DSM",
                fontSize = 15.sp,
                textAlign = TextAlign.Center
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center, // Center horizontally
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painter = imagenEmail,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(25.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "dylan.gonzales@unmsm.edu.pe",
                fontSize = 15.sp,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.fondo)
    // Step 3 create a box to overlap image and texts
    Box {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.FillBounds, // Expands the image to fill the space
            alpha = 0.4F,
            modifier = Modifier.fillMaxSize() // Fill the entire Box
        )
        GreetingText(
            message = message,
            from = from,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }
}
