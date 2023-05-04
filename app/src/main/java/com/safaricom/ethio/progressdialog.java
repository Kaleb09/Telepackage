package com.kaleb.ethio;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import com.google.android.material.progressindicator.LinearProgressIndicator;


public class progressdialog extends Dialog implements View.OnClickListener,confirmlistner {
    public Activity c;public Dialog d;internetdaily in;
     SharedPreferences sharedPreferences;
    MainActivity mainActivity;confirmlistner listner;String ste="",check="";
   int progress;
    LinearProgressIndicator progressIndicator;
    TextView prog;
public static confirmlistner conf;
    public progressdialog(Activity a, int progr) {
        super(a);
        this.c=a;
        progress=progr;
        conf=this;

    }
    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
         setContentView(R.layout.progress);
            progressIndicator = findViewById(R.id.linearProgressIndicator);
            prog = findViewById(R.id.prgtext);

    }
    @Override
    public void onClick(View v) {
switch (v.getId()){

    case R.id.no:
        dismiss();
        break;
    default:
        break;
}
dismiss();
    }


    @Override
    public void confirm(String phone, String check) {
        progressIndicator.setProgress(Integer.parseInt(phone));
        prog.setText(""+phone+"%");
    }

    @Override
    public void recharge(String phone, String check) {

    }
}
