package com.example.rmaproject2.data.models.course

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CourseResponse(
    val id: String,
    val subject: String,
    val type: String,
    val professor: String,
    val classroom: String,
    val group: String,
    val day: String,
    val time: String
)
