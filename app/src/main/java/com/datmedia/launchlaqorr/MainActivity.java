package com.datmedia.launchlaqorr;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchButtonClick(View view) {
        final Intent msg = new Intent();
        final String action = "com.datmedia.laqorr.mediaplayer";
        msg.setAction(action);
        Context context = this;
        context.sendBroadcast(msg);
    }
}
