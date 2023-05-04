package com.kaleb.ethio;

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
       // Toast.makeText(getApplicationContext(), "ussd", Toast.LENGTH_SHORT).show();
       // Toast.makeText(getApplicationContext(), accessibilityEvent.getText().toString(), Toast.LENGTH_SHORT).show();
       /* if (accessibilityEvent.getText().toString().contains("በ3 ብር 35 ሜ.ባ")){
            Toast.makeText(getApplicationContext(), "itcontain", Toast.LENGTH_SHORT).show();
        }*/String str="";

        SharedPreferences sharedPreferences = getSharedPreferences("but", Context.MODE_PRIVATE);
        int s = sharedPreferences.getInt("step", 6),ch=sharedPreferences.getInt("ch",0);;
        String text=sharedPreferences.getString("check", "");
      final String countriesString = sharedPreferences.getString("data", "");

        List<String> data = new ArrayList<>();
        if (!countriesString.isEmpty()){
            data = new ArrayList<>(Arrays.asList(countriesString.split(";")));
        }
        /*for(int i=0;i<data.size();i++){
            str= str+data.get(i);

        }
        if(str.length()==data.size()){
            Toast.makeText(getApplicationContext(),str, Toast.LENGTH_SHORT).show();
        }*/
       // Toast.makeText(getApplicationContext(),countries.get(s), Toast.LENGTH_SHORT).show();
       // Toast.makeText(getApplicationContext(), "ussd", Toast.LENGTH_SHORT).show();
        //Toast.makeText(getApplicationContext(), String.valueOf(data.size()), Toast.LENGTH_SHORT).show();
      //  Toast.makeText(getApplicationContext(), data, Toast.LENGTH_SHORT).show();
        boolean b = sharedPreferences.getBoolean("isapp", false);
       if (b){
           //Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();

           if(accessibilityEvent.getText().toString().contains(text)){
               Toast.makeText(getApplicationContext(), "contain", Toast.LENGTH_SHORT).show();
               ch=ch+1;
               SharedPreferences.Editor editor = sharedPreferences.edit();
               editor.putInt("ch",ch);
               editor.commit();

               //Toast.makeText(getApplicationContext(), "contain "+Integer.toString(ch), Toast.LENGTH_SHORT).show();

           }
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
            } else if (accessibilityEvent.getText().toString().contains("system error,")||accessibilityEvent.getText().toString().contains("This offering")||accessibilityEvent.getText().toString().contains("Sorry")) {
                Toast.makeText(getApplicationContext(),"update The app system error", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent("kaleb");
                sendBroadcast(intent);
                SharedPreferences shared = getSharedPreferences("but", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = shared.edit();
                editor.putBoolean("isapp", false);
                editor.putInt("ch",0);
                editor.commit();
            }
            else if(accessibilityEvent.getText().toString().length()>24) {
                if (s <data.size()) {
                   // Toast.makeText(getApplicationContext(), String.valueOf(s), Toast.LENGTH_SHORT).show();
                    if(s==data.size()-2&&ch<1){
                         Toast.makeText(getApplicationContext(),"update The app", Toast.LENGTH_SHORT).show();
                        Toast.makeText(getApplicationContext(), text+"\n"+accessibilityEvent.getText().toString(), Toast.LENGTH_SHORT).show();
                        AccessibilityNodeInfo info = accessibilityEvent.getSource();
                         AccessibilityNodeInfo node = info.findFocus(AccessibilityNodeInfo.FOCUS_INPUT);
                         node.refresh();
                         List<AccessibilityNodeInfo> list = info.findAccessibilityNodeInfosByText("cancel");
                         for (AccessibilityNodeInfo nodee : list) {
                             nodee.performAction(AccessibilityNodeInfo.ACTION_CLICK);
                         }
                         s++;
                        Intent intent = new Intent("kaleb");
                        sendBroadcast(intent);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                         editor.putInt("step", s);
                         editor.commit();
                         SharedPreferences shared = getSharedPreferences("but", Context.MODE_PRIVATE);
                        editor.putInt("ch",0);
                        editor.putBoolean("isapp", false);
                         editor.commit();
                     }else{

                      AccessibilityNodeInfo info = accessibilityEvent.getSource();
                    AccessibilityNodeInfo node = info.findFocus(AccessibilityNodeInfo.FOCUS_INPUT);
                        if(node.isFocusable()){
                            Bundle bundle = new Bundle();
                    bundle.putCharSequence(AccessibilityNodeInfo.ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE, data.get(s));
                    node.performAction(AccessibilityNodeInfo.ACTION_SET_TEXT, bundle);
                    node.refresh();
                    List<AccessibilityNodeInfo> list = info.findAccessibilityNodeInfosByText("send");
                    for (AccessibilityNodeInfo nodee : list) {
                        nodee.performAction(AccessibilityNodeInfo.ACTION_CLICK);
                    }}else {
                            Toast.makeText(getApplicationContext(), "not focusable", Toast.LENGTH_SHORT).show();

                        }
                    s++;
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putInt("step", s);
                    editor.apply();}
                } else {
                    Intent intent = new Intent("kaleb");
                    sendBroadcast(intent);
                    SharedPreferences shared = getSharedPreferences("but", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = shared.edit();
                    editor.putBoolean("isapp", false);
                    editor.putInt("ch",0);
                    editor.commit();
                    //Toast.makeText(getApplicationContext(), String.valueOf(data.size()), Toast.LENGTH_SHORT).show();
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
        SharedPreferences sharedPreferences = getSharedPreferences("but", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        if(sharedPreferences.getBoolean("isservice",false)){
                editor.putBoolean("isservice",false);
                editor.commit();
                Intent myIntent = new Intent(this, MainActivity.class);
                myIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(myIntent);
            Intent intent = new Intent("serviceconnected");
            sendBroadcast(intent);
        }

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