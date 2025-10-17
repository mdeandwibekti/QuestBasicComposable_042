package com.example.questbasiccomposable_042

import android.graphics.Paint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun tataletakColumn(modifier: Modifier) {
    Column(modifier= modifier.padding(top = 20.dp, start = 20.dp, end = 20.dp)) {
        Text(text = "Komponen1")
        Text(text = "Komponen2")
        Text(text = "Komponen3")
        Text(text = "Komponen4")
    }
}

@Composable
fun tataletakRow(modifier: Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Komponen1")
        Text(text = "komponen2")
        Text(text = "Komponen3")
        Text(text = "Komponen4")
    }
}

@Composable
fun tataletakBox(modifier: Modifier) {
    Box(
        modifier = modifier
            .fillMaxHeight()
            .fillMaxWidth(), contentAlignment = Alignment.Center
    ) {
        Text(text = "Box 1")
        Text(text = "Column 1")
        Text(text = "Row 1")
        Text(text = "Box 2")
        Text(text = "Column 2")

    }
}

@Composable
fun tataletakColumnRow(modifier: Modifier) {
    Column () {
        //baris1
        Row (modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly){
            Text(text = "Komponen1baris1")
            Text(text = "Komponen2baris1")
            Text(text = "Komponen3baris1")
        }
        //baris2
        Row(modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly) {
            Text(text = "Komponen1baris2")
            Text(text = "Komponen2baris2")
            Text(text = "Komponen3baris2")
        }
    }
}

@Composable
fun tataletakRowColumn(modifier: Modifier) {
    Column() {
        //kolom1
        Row (modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly){
            Text(text = "Komponen1kolom1")
            Text(text = "Komponen2kolom1")
            Text(text = "Komponen3kolom1")
        }
        //kolom2
        Column() {
            Text(text = "komponen1kolom2")
            Text(text = "Komponen2kolom2")
            Text(text = "Komponen3kolom2")
        }
    }
}

@Composable
fun tataletakBoxColumnRow(modifier: Modifier) {
    val gambar = painterResource(id =R.drawable.umy)
    Column {
        Box(
            modifier = modifier
                .fillMaxWidth()
                .height(height = 110.dp)
                .background(color = Color.Red),
            contentAlignment = Alignment.Center
        ) {
            Column () {
                Row (
                    modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ){
                    Text(text = "Col1_Row1_komponen1")
                    Text(text = "Col1_Row1_komponen2")
                    Text(text = "Col1_Row1_komponen3")
                }
                Row (
                    modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ){
                    Text(text = "Col1_Row2_Komponen1")
                    Text(text = "Col1_Row2_Komponen2")
                    Text(text = "Col1_Row2_Komponen3")
                }
            }
        }
        Spacer(modifier = modifier.height(height = 10.dp))
        Box(
            modifier = modifier
                .fillMaxWidth()
                .height(height = 300.dp)
                .background(color = Color.Cyan),
            contentAlignment = Alignment.Center
        ) {
            Image(painter = gambar,
                contentDescription = null,
                contentScale = ContentScale.Fit)
            Text(text = "My Music",
                fontSize = 50.sp,
                color = color.Red,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Cursive,
                modifier = Modifier.align(
                    alignment = Alignment.Center
                )
            )

        }
    }
}




