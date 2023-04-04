package com.kaleb.Telepackage;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;


public class customdialog extends Dialog implements View.OnClickListener {
    public Activity c;public Dialog d;public Button yes,no;internetdaily in;
    EditText phone;
    MainActivity mainActivity;ClickListner listner;String ste="";
    public customdialog(Activity a,ClickListner clickListner,String step) {
        super(a);this.listner=clickListner;
        this.c=a;ste=step;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.customdialog);
     mainActivity=new MainActivity();
       phone=findViewById(R.id.phonenum);
        //tt.setText(t2.d);
        yes=findViewById(R.id.buy);
        no=findViewById(R.id.cancel);
        yes.setOnClickListener(this);
        no.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
switch (v.getId()){
    case R.id.buy:
    // mainActivity.foryou("szgxvcnb");
      listner.foryou(ste+phone.getText().toString());
        break;
    case R.id.cancel:
        dismiss();
        break;
    default:
        break;
}
dismiss();
    }

}
