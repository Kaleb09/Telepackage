package com.kaleb.Telepackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;


public class confirm_dialog extends Dialog implements View.OnClickListener {
    public Activity c;public Dialog d;public TextView yes,no;internetdaily in;
    TextView phone; SharedPreferences sharedPreferences;
    MainActivity mainActivity;confirmlistner listner;String ste="",check="";
    public confirm_dialog(Activity a,confirmlistner l, String step, String che) {
        super(a);listner=l;
        this.c=a;ste=step;check=che;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.confirmdialog);
       sharedPreferences = getContext().getSharedPreferences("but", Context.MODE_PRIVATE);
        String s = sharedPreferences.getString("language", "Am");
        mainActivity=new MainActivity();
       phone=findViewById(R.id.datap);

        //tt.setText(t2.d);
        yes=findViewById(R.id.okay);
        no=findViewById(R.id.no);
        if(Objects.equals(s, "Am")){
            phone.setText("ፖኬጁን ለመግዛት እርግጠኛ ኖት");
            yes.setTextSize(20);
            no.setTextSize(20);
            yes.setText("እሺ");
           no.setText("ይቅር");
        }if(Objects.equals(s, "En")){
            phone.setText("Are you sure to buy the package");
            yes.setText("Ok");
            no.setText("Cancel");
        } yes.setOnClickListener(this);
        no.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
switch (v.getId()){
    case R.id.okay:
       /* Context c=v.getContext();
        Intent intent = new Intent("confirm");
        intent.putExtra("datastep",ste);
        intent.putExtra("check",check);
        c.sendBroadcast(intent);*/
        // mainActivity.foryou("szgxvcnb");
        if(phone.getText().toString()!=""){
      listner.confirm(ste,check);}else{
            Toast.makeText(getContext(),"enter phone", Toast.LENGTH_SHORT).show();
        }
        break;
    case R.id.no:
        dismiss();
        break;
    default:
        break;
}
dismiss();
    }

}
