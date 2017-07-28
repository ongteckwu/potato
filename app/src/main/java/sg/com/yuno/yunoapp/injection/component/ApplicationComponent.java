package sg.com.yuno.yunoapp.injection.component;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import sg.com.yuno.yunoapp.data.DataManager;
import sg.com.yuno.yunoapp.data.SyncService;
import sg.com.yuno.yunoapp.data.local.DatabaseHelper;
import sg.com.yuno.yunoapp.data.local.PreferencesHelper;
import sg.com.yuno.yunoapp.data.remote.RibotsService;
import sg.com.yuno.yunoapp.injection.ApplicationContext;
import sg.com.yuno.yunoapp.injection.module.ApplicationModule;
import sg.com.yuno.yunoapp.util.RxEventBus;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(SyncService syncService);

    @ApplicationContext Context context();
    Application application();
    RibotsService ribotsService();
    PreferencesHelper preferencesHelper();
    DatabaseHelper databaseHelper();
    DataManager dataManager();
    RxEventBus eventBus();

}
