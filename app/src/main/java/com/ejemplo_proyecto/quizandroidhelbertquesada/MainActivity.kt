package com.ejemplo_proyecto.jetpackbasico

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ejemplo_proyecto.quizandroidhelbertquesada.ui.theme.QuizAndroidHelbertQuesadaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            QuizAndroidHelbertQuesadaTheme() {
                ContentScreen()
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ContentScreen() {
    Column(
        modifier = Modifier
            .background(Color.Gray)
            .padding(all = 12.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .background(Color.Magenta)
                .padding(all = 18.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "inicio",
                fontSize = 20.sp,
                modifier = Modifier
                    .background(Color.Red)
                    .padding(all = 8.dp)
            )

            Text(
                text = "Perfil",
                fontSize = 20.sp,
                modifier = Modifier
                    .background(Color.Green)
                    .padding(all = 8.dp)
            )

            Text(
                text = "configuración",
                fontSize = 20.sp,
                modifier = Modifier
                    .background(Color.Yellow)
                    .padding(all = 8.dp)
            )
        }

        Text(
            text = "Inicio",
            fontSize = 25.sp,
            modifier = Modifier
                .padding(top = 12.dp)
                .background(Color.Blue)
                .padding(all = 8.dp)
        )

        Text(
            text = "Perfil",
            fontSize = 25.sp,
            modifier = Modifier
                .background(Color.Cyan)
                .padding(all = 8.dp)
        )

        Text(
            text = "Configuracion",
            fontSize = 25.sp,
            modifier = Modifier
                .background(Color.DarkGray)
                .padding(all = 8.dp)
        )
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PantallaPerfil() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F5F5))
            .padding(all = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        Image(
            painter = painterResource(id = R.drawable.perfil),
            contentDescription = "Foto de perfil",
            modifier = Modifier
                .width(110.dp)
                .height(110.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )


        Text(
            text = "Helbert Mauricio",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 14.dp),
            textAlign = TextAlign.Center
        )


        Text(
            text = "Desarrollador Android apasionado por la\ntecnología y el diseño.",
            fontSize = 12.sp,
            color = Color.DarkGray,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 6.dp),
            textAlign = TextAlign.Center
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 18.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "150", fontWeight = FontWeight.Bold, fontSize = 16.sp)
                Text(text = "Posts", fontSize = 12.sp, color = Color.Gray)
            }

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "2.3K", fontWeight = FontWeight.Bold, fontSize = 16.sp)
                Text(text = "Seguidores", fontSize = 12.sp, color = Color.Gray)
            }

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "980", fontWeight = FontWeight.Bold, fontSize = 16.sp)
                Text(text = "Likes", fontSize = 12.sp, color = Color.Gray)
            }
        }


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 18.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Seguir",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .width(150.dp)
                    .clip(CircleShape)
                    .background(Color(0xFF6E59B5))
                    .padding(vertical = 10.dp),
                textAlign = TextAlign.Center
            )

            Text(
                text = "Mensaje",
                color = Color(0xFF6E59B5),
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .width(150.dp)
                    .clip(CircleShape)
                    .background(Color(0xFFEDEDED))
                    .padding(vertical = 10.dp),
                textAlign = TextAlign.Center
            )
        }


        Text(
            text = "Intereses",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp)
        )


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Gym",
                modifier = Modifier
                    .clip(CircleShape)
                    .background(Color(0xFFD9D9D9))
                    .padding(horizontal = 12.dp, vertical = 6.dp),
                fontSize = 12.sp
            )
            Text(
                text = "Programación",
                modifier = Modifier
                    .clip(CircleShape)
                    .background(Color(0xFFD9D9D9))
                    .padding(horizontal = 12.dp, vertical = 6.dp),
                fontSize = 12.sp
            )
            Text(
                text = "UI/UX",
                modifier = Modifier
                    .clip(CircleShape)
                    .background(Color(0xFFD9D9D9))
                    .padding(horizontal = 12.dp, vertical = 6.dp),
                fontSize = 12.sp
            )
        }


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Música",
                modifier = Modifier
                    .clip(CircleShape)
                    .background(Color(0xFFD9D9D9))
                    .padding(horizontal = 12.dp, vertical = 6.dp),
                fontSize = 12.sp
            )
            Text(
                text = "Viajes",
                modifier = Modifier
                    .clip(CircleShape)
                    .background(Color(0xFFD9D9D9))
                    .padding(horizontal = 12.dp, vertical = 6.dp),
                fontSize = 12.sp
            )
            Text(
                text = "Gaming",
                modifier = Modifier
                    .clip(CircleShape)
                    .background(Color(0xFFD9D9D9))
                    .padding(horizontal = 12.dp, vertical = 6.dp),
                fontSize = 12.sp
            )
        }


        Text(
            text = "Proyectos Recientes",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp)
        )


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFBDBDBD))
                .padding(top = 0.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.perfil_foto),
                contentDescription = "Proyecto",
                modifier = Modifier
                    .width(110.dp)
                    .height(110.dp),
                contentScale = ContentScale.Crop
            )





