package xyz.amrro.android.broadcast.di;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import xyz.amrro.android.broadcast.ReceiverApp;


@Singleton
@Component(modules = {
        AndroidInjectionModule.class,
        AppModule.class,
        ActivitiesModule.class,
        BroadcastModule.class
})
public interface AppComponent {
    void inject(ReceiverApp app);
}
