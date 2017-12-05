package xyz.amrro.android.broadcast.di;

import android.content.BroadcastReceiver;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import xyz.amrro.android.broadcast.receiver.NotificationsReceiver;

/**
 * To inject the app {@link BroadcastReceiver}.
 */
@Module
abstract class BroadcastModule {

    @ContributesAndroidInjector
    abstract NotificationsReceiver contributesPowerConnectionReceiver();
}
