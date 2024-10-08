package com.example.food.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.food.R

@Composable
fun ButtonFavorite(onClick: () -> Unit = {}, modifier: Modifier = Modifier,
                   background: Color = MaterialTheme.colorScheme.background,
                   tintColor: Color = MaterialTheme.colorScheme.surfaceDim,
                   tintColorChoose: Color = MaterialTheme.colorScheme.surfaceTint) {

    var isSelected by remember { mutableStateOf(false) }
    val tint = if (isSelected) tintColorChoose else tintColor

    IconButton(onClick = { onClick()
            isSelected = !isSelected },
        modifier = modifier
            .padding(top = 25.dp, end = 20.dp)
            .size(45.dp)
            .clip(CircleShape)
            .background(background)) {
        Icon(painter = painterResource(R.drawable.icon_favorite),
            contentDescription = null, tint = tint)
    }
}