package com.jstevenunez.androidstarter;

import com.jstevenunez.androidstarter.activity.MainActivity;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit.RestAdapter;

/**
 * Created by steven on 2/23/2015.
 */
@Module (
        injects = {
                AndroidStarterApplication.class,
                MainActivity.class
        }
)
public class AndroidStarterModule {
    private AndroidStarterApplication androidStarterApplication;

    public AndroidStarterModule(AndroidStarterApplication androidStarterApplication) {
        this.androidStarterApplication = androidStarterApplication;
    }

    @Provides
    @Singleton
    public RestAdapter provideRestAdapter() {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("http://services.groupkt.com")
                .build();
        return restAdapter;
    }
}
