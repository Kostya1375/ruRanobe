package dowell.com.ua.ruranobe.model.dto

import com.google.gson.annotations.SerializedName


data class Volume(
        @SerializedName("volumeId") val id: Int,
        @SerializedName("projectId") val projectId: Int,
        @SerializedName("imageOne") val imageOne: Int,
        @SerializedName("title") val title: String,
        @SerializedName("sequenceNumber") val sequenceNumber: Float = 0.toFloat(),
        @SerializedName("volumeType") val type: String,
        @SerializedName("volumeStatus") val status: String,
        @SerializedName("nameRu") val nameRu: String,
        @SerializedName("url") val url: String,
        @SerializedName("nameFile") val fileName: String
)


enum class VolumeStatus {
    HIDDEN, AUTO, EXTERNAL_DROPPED, EXTERNAL_ACTIVE, EXTERNAL_DONE, NO_ENG, FREEZE, ON_HOLD, QUEUE, ONGOING, TRANSLATING, PROOFREAD, DECOR, DONE, LICENSE
}

@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FIELD, AnnotationTarget.TYPE)
internal annotation class StatusAnnotation(vararg val value: VolumeStatus)