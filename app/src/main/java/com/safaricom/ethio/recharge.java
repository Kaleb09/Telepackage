package com.kaleb.ethio;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;


public class recharge extends Dialog implements View.OnClickListener {
    public Activity c;public Dialog d;public TextView rechar;internetdaily in;
    EditText card;
    MainActivity mainActivity;confirmlistner listner;String cardno="";
    public recharge(Activity a,confirmlistner l) {
        super(a);listner=l;
        this.c=a;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.recharge);
        SharedPreferences sharedPreferences = getContext().getSharedPreferences("but", Context.MODE_PRIVATE);
        String s = sharedPreferences.getString("language", "Am");
        mainActivity=new MainActivity();
      card=findViewById(R.id.card);
      rechar=findViewById(R.id.recharge);
        if(Objects.equals(s, "Am")){
            card.setHint("ካርድ ያስገቡ");
           rechar.setText("ይሙሉ");
        }if(Objects.equals(s, "En")){
            card.setHint("Enter card no");
            rechar.setText("Recharge");
        } rechar.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
switch (v.getId()){
    case R.id.recharge:
       /* Context c=v.getContext();
        Intent intent = new Intent("recharge");
        intent.putExtra("card",card.getText().toString());
        c.sendBroadcast(intent);*/
        if(Objects.equals(card.getText().toString(),"")||Objects.equals(card.getText().toString(),null)){
            Toast.makeText(getContext(),"enter phone", Toast.LENGTH_SHORT).show();
        }else{
            listner.recharge(card.getText().toString(),"dear");
            dismiss();
        }
        break;
    default:
        break;
}

    }

}
