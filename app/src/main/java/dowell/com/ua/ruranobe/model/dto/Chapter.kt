package dowell.com.ua.ruranobe.model.dto

import com.google.gson.annotations.SerializedName

data class Chapter(
        @SerializedName("chapterId") val chapterId: Int,
        @SerializedName("volumeId") val volumeId: Int,
        @SerializedName("textId") val textId: Int,
        @SerializedName("url") val url: String,
        @SerializedName("title") val title: String,
        @SerializedName("orderNumber") val orderNumber: Int,
        @SerializedName("publishDate") val publishDate: String,
        @SerializedName("nested") val nested: Boolean,
        @SerializedName("urlPart") val urlPart: String,
        @SerializedName("published") val published: Boolean,
        @SerializedName("leveledTitle") val leveledTitle: String
)