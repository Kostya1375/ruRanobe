package dowell.com.ua.ruranobe.model

import dowell.com.ua.ruranobe.model.api.RuRanobeApi
import dowell.com.ua.ruranobe.model.dto.Project
import io.reactivex.Observable
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by kosty on 7/21/2017.
 */
@Singleton class DtoModule @Inject constructor() {

    @Inject lateinit var api: RuRanobeApi

    fun getProject(projectId: Int): Observable<Project> = api.getProject(projectId)

}