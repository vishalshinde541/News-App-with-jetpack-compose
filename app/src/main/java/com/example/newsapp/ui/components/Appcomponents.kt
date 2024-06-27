package com.example.newsapp.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newsapp.data.entity.NewsResponse

@Composable
fun Loader() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {
        CircularProgressIndicator(
            modifier = Modifier
                .size(70.dp)
                .padding(10.dp),
            color = Color.DarkGray
        )
    }


}

@Composable
fun NewsList(response: NewsResponse) {
    LazyColumn {
        items(response.articles){article ->
            NormalTextComponent(textValue = article.title ?: "NA" )
        }
    }

}

@Composable
fun NormalTextComponent(textValue:String) {
    Text(text = textValue,
        style = TextStyle(fontSize = 18.sp,
            fontWeight = FontWeight.Normal
        ),
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(8.dp)
    )
}

