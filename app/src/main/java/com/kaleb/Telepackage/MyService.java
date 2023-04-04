package com.kaleb.Telepackage;

import android.accessibilityservice.AccessibilityService;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyService extends AccessibilityService {
//MainActivity1 ma=new MainActivity1();
 /*  RemoveClickListner r;
    MyService(RemoveClickListner r){
        this.r=r;
    }*/
    @Override
    public void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
     //   Toast.makeText(getApplicationContext(), "ussd", Toast.LENGTH_SHORT).show();

         SharedPreferences sharedPreferences = getSharedPreferences("but", Context.MODE_PRIVATE);
        int s = sharedPreferences.getInt("step", 6);
        //Toast.makeText(getApplicationContext(), st.get(s), Toast.LENGTH_SHORT).show();
      final String countriesString = sharedPreferences.getString("data", "");
        List<String> data = new ArrayList<>();
        if (!countriesString.isEmpty()){
            data = new ArrayList<>(Arrays.asList(countriesString.split(";")));
        }
       // Toast.makeText(getApplicationContext(),countries.get(s), Toast.LENGTH_SHORT).show();
       // Toast.makeText(getApplicationContext(), "ussd", Toast.LENGTH_SHORT).show();
        //Toast.makeText(getApplicationContext(), String.valueOf(data.size()), Toast.LENGTH_SHORT).show();
      //  Toast.makeText(getApplicationContext(), data, Toast.LENGTH_SHORT).show();
        boolean b = sharedPreferences.getBoolean("isapp", false);
       if (b){
            if (accessibilityEvent.getText().toString().contains("[USSD") ||
                    accessibilityEvent.getText().toString().contains("[Phone")) {
                //Toast.makeText(getApplicationContext(), "ussd", Toast.LENGTH_SHORT).show();
            } else if (accessibilityEvent.getText().toString().contains("[Connection")) {
                Intent intent = new Intent("kaleb");
                sendBroadcast(intent);
                SharedPreferences shared = getSharedPreferences("but", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = shared.edit();
                editor.putBoolean("isapp", false);
                editor.commit();
            }else if (accessibilityEvent.getText().toString().contains("system")) {
                Intent intent = new Intent("kaleb");
                sendBroadcast(intent);
                SharedPreferences shared = getSharedPreferences("but", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = shared.edit();
                editor.putBoolean("isapp", false);
                editor.commit();
            }        
          else {
                if (s <data.size()) {
                    Toast.makeText(getApplicationContext(), String.valueOf(data.size()), Toast.LENGTH_SHORT).show();
                      AccessibilityNodeInfo info = accessibilityEvent.getSource();
                    AccessibilityNodeInfo node = info.findFocus(AccessibilityNodeInfo.FOCUS_INPUT);
                    Bundle bundle = new Bundle();
                    bundle.putCharSequence(AccessibilityNodeInfo.ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE, data.get(s));
                    node.performAction(AccessibilityNodeInfo.ACTION_SET_TEXT, bundle);
                    node.refresh();
                    List<AccessibilityNodeInfo> list = info.findAccessibilityNodeInfosByText("send");
                    for (AccessibilityNodeInfo nodee : list) {
                        nodee.performAction(AccessibilityNodeInfo.ACTION_CLICK);
                    }
                    s++;
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putInt("step", s);
                    editor.commit();
                } else {
                    Intent intent = new Intent("kaleb");
                    sendBroadcast(intent);
                    SharedPreferences shared = getSharedPreferences("but", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = shared.edit();
                    editor.putBoolean("isapp", false);
                    editor.commit();
                    Toast.makeText(getApplicationContext(), String.valueOf(data.size()), Toast.LENGTH_SHORT).show();
                }
            }
    }
    }
    @Override
    public void onInterrupt() {

    }

    @Override
    public void startActivity(Intent intent, Bundle options) {
        super.startActivity(intent, options);
    }

    @Override
    protected void onServiceConnected() {
        super.onServiceConnected();

    }

    @Override
    protected boolean onKeyEvent(KeyEvent event) {

        int action = event.getAction();
        int keyCode = event.getKeyCode();
        // the service listens for both pressing and releasing the key
        // so the below code executes twice, i.e. you would encounter two Toasts
        // in order to avoid this, we wrap the code inside an if statement
        // which executes only when the key is released
        if (action == KeyEvent.ACTION_UP) {
            if (keyCode == KeyEvent.KEYCODE_VOLUME_UP) {
                Log.d("Check", "KeyUp");
                Toast.makeText(this, "KeyUp", Toast.LENGTH_SHORT).show();
            } else if (keyCode == KeyEvent.KEYCODE_VOLUME_DOWN) {
                Log.d("Check", "KeyDown");
                Toast.makeText(this, "KeyDown", Toast.LENGTH_SHORT).show();
            }
        }
        return super.onKeyEvent(event);
    }
}