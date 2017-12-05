package xyz.amrro.android.broadcast.di;

import android.app.Application;
import android.content.Context;
import android.support.annotation.NonNull;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Needed dependencies for some android components.
 */
@SuppressWarnings("WeakerAccess")
@Module
public class AppModule {

    @NonNull
    private Application application;

    public AppModule(@NonNull Application app) {
        this.application = app;
    }

    @Singleton
    @Provides
    public Context provideApplication() {
        return application;
    }


}
