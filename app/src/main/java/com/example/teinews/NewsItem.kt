package com.example.teinews

import java.io.Serializable

data class NewsItem(
    val id: Int,
    val title: String,
    val content: String,
<<<<<<< HEAD
    val source: String,
=======
    val detailedContent: String = "",
    val source: String,
    val sourceLink: String = "",
>>>>>>> fd539a0 (Version Final)
    val publishTime: String,
    val category: String,
    val isFavorite: Boolean = false,
    val isSaved: Boolean = false,
    val isReadLater: Boolean = false
) : Serializable
