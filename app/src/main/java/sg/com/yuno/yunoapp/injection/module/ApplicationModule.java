package sg.com.yuno.yunoapp.injection.module;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import sg.com.yuno.yunoapp.data.remote.BackendService;
import sg.com.yuno.yunoapp.data.remote.RibotsService;
import sg.com.yuno.yunoapp.injection.ApplicationContext;
import sg.com.yuno.yunoapp.injection.DatabaseInfo;

/**
 * Provide application-level dependencies.
 */
@Module
public class ApplicationModule {
    protected final Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

    @Provides
    @Singleton
    RibotsService provideRibotsService() {
        return RibotsService.Creator.newRibotsService();
    }

    @Provides
    @Singleton
    BackendService provideBackendService() {
        return BackendService.Creator.newBackendService();
    }

    @Provides
    @DatabaseInfo
    Integer provideDatabaseVersion() { return 2; }

    @Provides
    @DatabaseInfo
    String provideDatabaseName() { return "yuno-students.db"; }

}
