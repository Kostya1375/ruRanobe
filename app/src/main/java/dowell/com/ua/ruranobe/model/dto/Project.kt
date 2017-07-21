package dowell.com.ua.ruranobe.model.dto

import com.google.gson.annotations.SerializedName
import java.util.Date

/**
 * Created by kosty on 7/21/2017.
 */
data class Project(
        @SerializedName("projectId") val id: Int,
        @SerializedName("imageId") val imageId: Int,
        @SerializedName("Url") val url: String,
        @SerializedName("nameJp") val nameJp: String,
        @SerializedName("nameEn") val nameEn: String,
        @SerializedName("nameRu") val nameRu: String,
        @SerializedName("nameRomaji") val nameRomaji: String,
        @SerializedName("author") val author: String,
        @SerializedName("illustrator") val illustrator: String,
        @SerializedName("originalDesign") val design: String,
        @SerializedName("originalStory") private val story: String,
        @SerializedName("orderNumber") val orderNumber: Int,
        @SerializedName("onevolume") val oneVolume: Boolean,
        @SerializedName("franchiseNovel") val novel: String,
        @SerializedName("franchiseSpinOff") val spinOff: String,
        @SerializedName("franchiseSS") val ss: String,
        @SerializedName("franchiseManga") val manga: String,
        @SerializedName("franchiseAnime") val anime: String,
        @SerializedName("franchiseWeb") val web: String,
        @SerializedName("annotation") val annotation: String,
        @SerializedName("forumId") val forumId: Int,
        @SerializedName("status") val status: String,
        @SerializedName("issueStatus") val issueStatus: String,
        @SerializedName("translationStatus") val translationStatus: String,
        @SerializedName("lastUpdateDate") val lastUpdateDate: Date,
        @SerializedName("lastEditDate") val lastEditDate: Date,
        @SerializedName("annotationParsed") val annotationParsed: String
)