package xyz.amrro.android.broadcast;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public final class MainActivity extends AppCompatActivity {

    public static final String ACTION_SEND_NOTIFICATION = "xyz.amrro.android.broadcast.NOTIFICATION";
    public static final String EXTRA_DATA = "data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button sendButton = findViewById(R.id.send);
        final AutoCompleteTextView message = findViewById(R.id.message);

        sendButton.setOnClickListener(view -> {
            final String text = message.getText().toString();
            if (! TextUtils.isEmpty(text)) {
                broadcastMessage(text);
            }
        });
    }

    private void broadcastMessage(final String message) {
        Intent intent = new Intent();
        intent.setAction(ACTION_SEND_NOTIFICATION)
                .putExtra(EXTRA_DATA, message);
        sendBroadcast(intent);
    }
}
