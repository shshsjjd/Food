package com.example.food.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.food.R

@Composable
fun OvalCounter(
    count: Int = 0,
    onIncrement: () -> Unit,
    onDeIncrement: ()-> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .size(130.dp, 55.dp)
            .clip(RoundedCornerShape(30.dp))
            .background(MaterialTheme.colorScheme.onBackground)
            .padding(horizontal = 10.dp),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween // Располагаем элементы слева
        ) {
            IconButton(onClick = onDeIncrement) {
                Row(Modifier.size(28.dp).clip(CircleShape)
                    .background(MaterialTheme.colorScheme.secondary),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center){
                    Icon(
                        painter = painterResource(id = R.drawable.icon_simple_minus), // Замените на вашу иконку
                        contentDescription = "Increment",
                        tint = MaterialTheme.colorScheme.background )
                }
            }

            // Число по центру
            Text(
                text = count.toString(),
                style = MaterialTheme.typography.headlineMedium,
                color = MaterialTheme.colorScheme.background,
                modifier = Modifier
                    .weight(1f)
                    .wrapContentSize(Alignment.Center)
            )

            IconButton(onClick = onIncrement) {
                Row(Modifier.size(28.dp).clip(CircleShape)
                    .background(MaterialTheme.colorScheme.secondary),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center){
                    Icon(
                        painter = painterResource(id = R.drawable.icon_simple_plus), // Замените на вашу иконку
                        contentDescription = "Increment",
                        tint = MaterialTheme.colorScheme.background // Цвет иконки
                    )
                }

            }
        }
    }
}