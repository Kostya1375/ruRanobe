package dowell.com.ua.ruranobe.model.dto

import com.google.gson.annotations.SerializedName

data class Image(
        @SerializedName("resourceId") val resourceId: Int,
        @SerializedName("userId") val userId: Int,
        @SerializedName("historyId") val historyId: Int,
        @SerializedName("width") val width: Int,
        @SerializedName("height") val height: Int,
        @SerializedName("mimeType") val mimeType: String,
        @SerializedName("url") val url: String,
        @SerializedName("thumbnail") val thumbnail: String,
        @SerializedName("title") val title: String,
        @SerializedName("uploadedWhen") val uploadedWhen: String,
        @SerializedName("nonColored") val nonColored: Any
)
