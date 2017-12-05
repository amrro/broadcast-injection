package xyz.amrro.android.broadcast.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import xyz.amrro.android.broadcast.MainActivity;

/**
 * Created by amrro <amr.elghobary@gmail.com> on 7/22/17.
 * <p>
 * Injects {@link android.app.Activity}s
 */

@Module
abstract class ActivitiesModule {

    @ContributesAndroidInjector
    abstract MainActivity contributesMainActivity();

}
