package xyz.amrro.android.broadcast.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import xyz.amrro.android.broadcast.MainActivity;
import xyz.amrro.android.broadcast.Notifier;

public class NotificationsReceiver extends BroadcastReceiver {

    @Inject
    Notifier notifier;

    @Override
    public void onReceive(final Context context, Intent intent) {
        AndroidInjection.inject(this, context);

        final String action = intent.getAction();
        if (action.equals(MainActivity.ACTION_SEND_NOTIFICATION)) {
            notifier.notify(intent.getStringExtra(MainActivity.EXTRA_DATA));
        }
    }
}
