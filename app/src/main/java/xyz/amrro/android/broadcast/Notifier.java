package xyz.amrro.android.broadcast;

import android.content.Context;
import android.widget.Toast;

import javax.inject.Inject;


/**
 * Dump Class only for Injection's sake.
 */
public final class Notifier {

    private Context context;

    @Inject
    public Notifier(Context context) {
        this.context = context;
    }

    public void notify(String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
