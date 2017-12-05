package xyz.amrro.android.broadcast;

import android.app.Application;
import android.content.BroadcastReceiver;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasBroadcastReceiverInjector;
import xyz.amrro.android.broadcast.di.AppComponent;
import xyz.amrro.android.broadcast.di.AppModule;
import xyz.amrro.android.broadcast.di.DaggerAppComponent;


public final class ReceiverApp extends Application implements HasBroadcastReceiverInjector {
    @Inject
    DispatchingAndroidInjector<BroadcastReceiver> receiverDispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        component().inject(this);
    }

    protected AppComponent component() {
        return DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    @Override
    public AndroidInjector<BroadcastReceiver> broadcastReceiverInjector() {
        return receiverDispatchingAndroidInjector;
    }
}
