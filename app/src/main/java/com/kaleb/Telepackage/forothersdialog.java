package com.kaleb.Telepackage;

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


public class forothersdialog extends Dialog implements View.OnClickListener {
    public Activity c;public TextView yes,no;internetdaily in;
    EditText phone;
    MainActivity mainActivity;confirmlistner listner;String ste="",check="";
    public forothersdialog(Activity a,confirmlistner l, String step, String che) {
        super(a);
        this.c=a;ste=step;check=che;listner=l;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.forothersdialog);
        SharedPreferences sharedPreferences = getContext().getSharedPreferences("but", Context.MODE_PRIVATE);
        String s = sharedPreferences.getString("language", "Am");
        mainActivity=new MainActivity();
       phone=findViewById(R.id.phonenumconfirm);
        //tt.setText(t2.d);
        yes=findViewById(R.id.buy);
        no=findViewById(R.id.cancel);
        if(Objects.equals(s, "Am")){
            phone.setHint("ስልክ ያስገቡ");
            yes.setText("እሺ");
            yes.setTextSize(20);
            no.setTextSize(20);
            no.setText("ይቅር");
        }if(Objects.equals(s, "En")){
            yes.setText("Ok");
            no.setText("Cancel");
        } yes.setOnClickListener(this);
        no.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
switch (v.getId()){
    case R.id.buy:
    // mainActivity.foryou("szgxvcnb");
       /*if(!phone.getText().toString().3equals("")){
           Context c=v.getContext();
           Intent intent = new Intent("confirm");
           intent.putExtra("datastep",ste+";"+phone.getText().toString()+";1");
           intent.putExtra("check",check);
           c.sendBroadcast(intent);
        }else{
            Toast.makeText(getContext(),"enter phone", Toast.LENGTH_SHORT).show();
        }*/
        if(Objects.equals(phone.getText().toString(),"")||Objects.equals(phone.getText().toString(),null)){
            Toast.makeText(getContext(),"enter phone", Toast.LENGTH_SHORT).show();
            }else{
            listner.confirm(ste+";"+phone.getText().toString()+";1",check);
            dismiss();
        }
        break;
    case R.id.cancel:
        dismiss();
        break;
    default:
        break;
}

    }

}
