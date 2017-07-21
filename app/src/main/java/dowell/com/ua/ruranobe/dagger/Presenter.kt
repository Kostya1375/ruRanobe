package dowell.com.ua.ruranobe.dagger

import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Singleton

/**
 * Created by kosty on 7/21/2017.
 */
@Module class Presenter {
    @Provides fun provideSubscription(): CompositeDisposable = CompositeDisposable()
}