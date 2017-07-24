package dowell.com.ua.ruranobe.model.api

import dowell.com.ua.ruranobe.model.dto.Chapter
import dowell.com.ua.ruranobe.model.dto.Image
import dowell.com.ua.ruranobe.model.dto.Project
import dowell.com.ua.ruranobe.model.dto.Volume
import io.reactivex.Observable
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by kosty on 7/21/2017.
 */
interface RuRanobeApi {

    @GET("projects")
    fun getProjects(): Observable<List<Project>>

    @GET("projects/{projectId}")
    fun getProject(@Path("projectId") ProjectId: Int): Observable<Project>

    @GET("projects/{projectId}/volumes")
    fun getVolumes(@Path("projectId") projectId: Int): Observable<List<Volume>>

    @GET("volumes/{volumeId}/chapters")
    fun getChapters(@Path("volumeId") volumeId: Int): Observable<List<Chapter>>

    @GET("chapters/{chapterId}/illustration")
    fun getIllustration(@Path("chapterId") chapterId: Int): Observable<List<Image>>

    @GET("images/{imageId}")
    fun getImage(@Path("imageId") imageId: Int): Observable<Image>

    @GET("http://ruranobe.ru/d/epub/{projectUrl}/{volumeUrl}")
    fun getVolumeEpub(@Path("projectUrl") projectUrl: String,
                      @Path("volumeUrl") volumeUrl: String): Observable<Response<ResponseBody>>
}