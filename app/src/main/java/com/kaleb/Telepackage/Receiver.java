package com.kaleb.Telepackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class Receiver extends BroadcastReceiver {
    MainActivity mainActivity;
     @Override
    public void onReceive(final Context context, Intent intent) {
         Toast.makeText(context.getApplicationContext(), "Permission denied", Toast.LENGTH_SHORT).show();


     }
    }

