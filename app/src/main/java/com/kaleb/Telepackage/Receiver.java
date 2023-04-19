package com.kaleb.Telepackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

public class Receiver extends BroadcastReceiver {
    MainActivity mainActivity;
     @Override
    public void onReceive(final Context context, Intent intent) {
             ConnectivityManager connMgr = (ConnectivityManager) context.getSystemService(context.CONNECTIVITY_SERVICE);
             NetworkInfo netin = connMgr.getActiveNetworkInfo();
             if(netin != null && netin.isConnected()){
                 Toast.makeText(context.getApplicationContext(),"connection", Toast.LENGTH_SHORT).show();
             }else{
                 Toast.makeText(context.getApplicationContext(),"no connection", Toast.LENGTH_SHORT).show();
             }

     }
    }

