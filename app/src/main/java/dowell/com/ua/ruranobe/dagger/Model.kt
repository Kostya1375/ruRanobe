package dowell.com.ua.ruranobe.dagger

import dagger.Module
import dagger.Provides
import dowell.com.ua.ruranobe.model.api.RuRanobeApi
import dowell.com.ua.ruranobe.model.api.RuRanobeApiImpl
import javax.inject.Singleton

/**
 * Created by kosty on 7/21/2017.
 */
@Module class Model {
    @Singleton @Provides fun providesApi(): RuRanobeApi = RuRanobeApiImpl.createApi()
}