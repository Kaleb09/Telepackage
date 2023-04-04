package com.kaleb.Telepackage;

import android.Manifest;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.PixelFormat;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Collections;
public class MainActivity extends AppCompatActivity implements
        internet.OnFragmentInteractionListener,
        Tab2Fragment.OnFragmentInteractionListener,
        Tab3Fragment.OnFragmentInteractionListener,
        Tab4Fragment.OnFragmentInteractionListener,ClickListner{
    WindowManager.LayoutParams params;
    FirebaseDatabase fd;
    DatabaseReference dr;
    WindowManager wm;
  TextView textView;public static int t=0;
    ProgressBar p;public static String data="";
    LayoutInflater in;customdialog cd;
    View view1;LoginDataBaseAdapter loginDataBaseAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        fd=FirebaseDatabase.getInstance();
        dr=fd.getReference("kaleb");
       textView=findViewById(R.id.language);
        loginDataBaseAdapter = new LoginDataBaseAdapter(this);
        loginDataBaseAdapter = loginDataBaseAdapter.open();
        MyListData m=new MyListData();
        m.setDescription("kaleb"); m.setStep("adamu");m.setStepgift("biyad");
        loginDataBaseAdapter.inserttotable(m);
        FloatingActionButton fab = findViewById(R.id.fab);
        SharedPreferences sharedPreferences=getSharedPreferences("but", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putInt("step",6);
        String tl=sharedPreferences.getString("language","Am");
        editor.putString("language",tl);
        if(tl=="Am"){
        textView.setText("En");}else{
            textView.setText("Am");
        }
        // editor.putBoolean("islogin",true);
        editor.commit();
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences=getSharedPreferences("but", Context.MODE_PRIVATE);
               if(sharedPreferences.getString("language","Am")=="Am"){
                   textView.setText("Am");
                    SharedPreferences.Editor editor=sharedPreferences.edit();
                    editor.putString("language","En");
                    editor.commit();
                }else{
                   textView.setText("En");
                    SharedPreferences.Editor editor=sharedPreferences.edit();
                    editor.putString("language","Am");
                    editor.commit();
                }
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                finish();
                overridePendingTransition(0,0);
                startActivity(intent);
                overridePendingTransition(0,0);
            }
        });
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ussd = "*" + "804" + Uri.encode("#");
                Intent i=new Intent(Intent.ACTION_CALL,Uri.parse("tel:"+ussd));
                startActivity(i);       }
        });
        confiureTabLayout();
        confiureTabLayout1();
        if(!checkAccessibilityPermission()){
            Toast.makeText(MainActivity.this, "Permission denied", Toast.LENGTH_SHORT).show();
        }
        //USSDApi ussd= USSDController.getInstance(cont);
       // p=findViewById(R.id.progressBar);
        params=new WindowManager.LayoutParams(WindowManager.LayoutParams.MATCH_PARENT,WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.TYPE_SYSTEM_ALERT,WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE|WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL
                |WindowManager.LayoutParams.FLAG_WATCH_OUTSIDE_TOUCH  , PixelFormat.TRANSLUCENT);
        wm=(WindowManager) getSystemService(WINDOW_SERVICE);
        in=(LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        view1=in.inflate(R.layout.about,null);
        BroadcastReceiver broadcastReceiver=new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
              //  wm.removeView(view1);
            }
        };
        registerReceiver(broadcastReceiver,new IntentFilter("kaleb"));
        BroadcastReceiver broadcastReceiver1=new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
     // data=intent.getStringExtra("datastep");
                //  Toast.makeText(getApplicationContext(),data, Toast.LENGTH_SHORT).show();
if(t<1){
    ussd();
    t++;
}if(t==1){
    t=0;
}
                 Toast.makeText(getApplicationContext(),String.valueOf(t), Toast.LENGTH_SHORT).show();

                  //ussd();
            }
        };
        registerReceiver(broadcastReceiver1,new IntentFilter("kaleb1"));

    }private void confiureTabLayout() {
        TabLayout tabLayout = findViewById(R.id.tab_layout);
       /* tabLayout.addTab(tabLayout.newTab().setText("internet").setIcon(R.drawable.morning));
        tabLayout.addTab(tabLayout.newTab().setText("voice"));
        tabLayout.addTab(tabLayout.newTab().setText("sms package"));
        tabLayout.addTab(tabLayout.newTab().setText("internet & voice"));
        tabLayout.addTab(tabLayout.newTab().setText("flexi"));
        tabLayout.addTab(tabLayout.newTab().setText("international voice"));
        tabLayout.addTab(tabLayout.newTab().setText("morning package"));
        tabLayout.addTab(tabLayout.newTab().setText("long term package"));
        tabLayout.addTab(tabLayout.newTab().setText("unlimited premium service"));*/

        tabLayout.addTab(tabLayout.newTab().setText("internet").setIcon(R.drawable.internet));
        tabLayout.addTab(tabLayout.newTab().setText("voice").setIcon(R.drawable.voicepackage));
        tabLayout.addTab(tabLayout.newTab().setText("sms package").setIcon(R.drawable.sms));
        tabLayout.addTab(tabLayout.newTab().setText("internet & voice").setIcon(R.drawable.internetandvoice));
        tabLayout.addTab(tabLayout.newTab().setText("flexi").setIcon(R.drawable.interchangepackage));
        tabLayout.addTab(tabLayout.newTab().setText("international voice").setIcon(R.drawable.internationalcall));
        tabLayout.addTab(tabLayout.newTab().setText("morning package").setIcon(R.drawable.morning));
        tabLayout.addTab(tabLayout.newTab().setText("long term package").setIcon(R.drawable.longterm));
        tabLayout.addTab(tabLayout.newTab().setText("unlimited premium service").setIcon(R.drawable.unlimitedinternet));
        tabLayout.addTab(tabLayout.newTab().setText("1 Birr Package").setIcon(R.drawable.onebirr));
        tabLayout.addTab(tabLayout.newTab().setText("Convert Package").setIcon(R.drawable.convert));
        tabLayout.addTab(tabLayout.newTab().setText("Transfer Package").setIcon(R.drawable.transferpackage));
        if (tabLayout.getTabAt(0).isSelected()) {
            int tabi = ContextCompat.getColor(getBaseContext(), R.color.tab1);
            tabLayout.getTabAt(0).getIcon().setColorFilter(tabi, PorterDuff.Mode.SRC_IN);
        }else{
            int tabi = ContextCompat.getColor(getBaseContext(), R.color.white);
            tabLayout.getTabAt(0).getIcon().setColorFilter(tabi, PorterDuff.Mode.SRC_IN);
        }
        if (tabLayout.getTabAt(1).isSelected()) {
            int tabi = ContextCompat.getColor(getBaseContext(), R.color.tab1);
            tabLayout.getTabAt(1).getIcon().setColorFilter(tabi, PorterDuff.Mode.SRC_IN);
        }else{
            int tabi = ContextCompat.getColor(getBaseContext(), R.color.white);
            tabLayout.getTabAt(1).getIcon().setColorFilter(tabi, PorterDuff.Mode.SRC_IN);
        } if (tabLayout.getTabAt(2).isSelected()) {
            int tabi = ContextCompat.getColor(getBaseContext(), R.color.tab1);
            tabLayout.getTabAt(2).getIcon().setColorFilter(tabi, PorterDuff.Mode.SRC_IN);
        }else{
            int tabi = ContextCompat.getColor(getBaseContext(), R.color.white);
            tabLayout.getTabAt(2).getIcon().setColorFilter(tabi, PorterDuff.Mode.SRC_IN);
        } if (tabLayout.getTabAt(3).isSelected()) {
            int tabi = ContextCompat.getColor(getBaseContext(), R.color.tab1);
            tabLayout.getTabAt(3).getIcon().setColorFilter(tabi, PorterDuff.Mode.SRC_IN);
        }else{
            int tabi = ContextCompat.getColor(getBaseContext(), R.color.white);
            tabLayout.getTabAt(3).getIcon().setColorFilter(tabi, PorterDuff.Mode.SRC_IN);
        } if (tabLayout.getTabAt(4).isSelected()) {
            int tabi = ContextCompat.getColor(getBaseContext(), R.color.tab1);
            tabLayout.getTabAt(4).getIcon().setColorFilter(tabi, PorterDuff.Mode.SRC_IN);
        }else{
            int tabi = ContextCompat.getColor(getBaseContext(), R.color.white);
            tabLayout.getTabAt(4).getIcon().setColorFilter(tabi, PorterDuff.Mode.SRC_IN);
        } if (tabLayout.getTabAt(5).isSelected()) {
            int tabi = ContextCompat.getColor(getBaseContext(), R.color.tab1);
            tabLayout.getTabAt(5).getIcon().setColorFilter(tabi, PorterDuff.Mode.SRC_IN);
        }else{
            int tabi = ContextCompat.getColor(getBaseContext(), R.color.white);
            tabLayout.getTabAt(5).getIcon().setColorFilter(tabi, PorterDuff.Mode.SRC_IN);
        } if (tabLayout.getTabAt(6).isSelected()) {
            int tabi = ContextCompat.getColor(getBaseContext(), R.color.tab1);
            tabLayout.getTabAt(6).getIcon().setColorFilter(tabi, PorterDuff.Mode.SRC_IN);
        }else{
            int tabi = ContextCompat.getColor(getBaseContext(), R.color.white);
            tabLayout.getTabAt(6).getIcon().setColorFilter(tabi, PorterDuff.Mode.SRC_IN);
        }if (tabLayout.getTabAt(7).isSelected()) {
            int tabi = ContextCompat.getColor(getBaseContext(), R.color.tab1);
            tabLayout.getTabAt(7).getIcon().setColorFilter(tabi, PorterDuff.Mode.SRC_IN);
        }else{
            int tabi = ContextCompat.getColor(getBaseContext(), R.color.white);
            tabLayout.getTabAt(7).getIcon().setColorFilter(tabi, PorterDuff.Mode.SRC_IN);
        }
        if (tabLayout.getTabAt(8).isSelected()) {
            int tabi = ContextCompat.getColor(getBaseContext(), R.color.tab1);
            tabLayout.getTabAt(8).getIcon().setColorFilter(tabi, PorterDuff.Mode.SRC_IN);
        }else{
            int tabi = ContextCompat.getColor(getBaseContext(), R.color.white);
            tabLayout.getTabAt(8).getIcon().setColorFilter(tabi, PorterDuff.Mode.SRC_IN);
        }
        if (tabLayout.getTabAt(9).isSelected()) {
            int tabi = ContextCompat.getColor(getBaseContext(), R.color.tab1);
            tabLayout.getTabAt(9).getIcon().setColorFilter(tabi, PorterDuff.Mode.SRC_IN);
        }else{
            int tabi = ContextCompat.getColor(getBaseContext(), R.color.white);
            tabLayout.getTabAt(9).getIcon().setColorFilter(tabi, PorterDuff.Mode.SRC_IN);
        }
        if (tabLayout.getTabAt(10).isSelected()) {
            int tabi = ContextCompat.getColor(getBaseContext(), R.color.tab1);
            tabLayout.getTabAt(10).getIcon().setColorFilter(tabi, PorterDuff.Mode.SRC_IN);
        }else{
            int tabi = ContextCompat.getColor(getBaseContext(), R.color.white);
            tabLayout.getTabAt(10).getIcon().setColorFilter(tabi, PorterDuff.Mode.SRC_IN);
        }
        if (tabLayout.getTabAt(11).isSelected()) {
            int tabi = ContextCompat.getColor(getBaseContext(), R.color.tab1);
            tabLayout.getTabAt(11).getIcon().setColorFilter(tabi, PorterDuff.Mode.SRC_IN);
        }else{
            int tabi = ContextCompat.getColor(getBaseContext(), R.color.white);
            tabLayout.getTabAt(11).getIcon().setColorFilter(tabi, PorterDuff.Mode.SRC_IN);
        }

        final ViewPager viewPager = findViewById(R.id.pager);
        final PagerAdapter adapter = new TabPagerAdapter
                (getSupportFragmentManager(),
                        tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new
                TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new
                                                   TabLayout.OnTabSelectedListener() {
                                                       @Override
                                                       public void onTabSelected(TabLayout.Tab tab) {
                                                           int tabi = ContextCompat.getColor(getBaseContext(), R.color.tab1);
                                                           viewPager.setCurrentItem(tab.getPosition());
                                                           tab.getIcon().setColorFilter(tabi, PorterDuff.Mode.SRC_IN);

                                                       }
                                                       @Override
                                                       public void onTabUnselected(TabLayout.Tab tab) {
                                                           int tabi = ContextCompat.getColor(getBaseContext(), R.color.white);
                                                           tab.getIcon().setColorFilter(tabi, PorterDuff.Mode.SRC_IN);
                                                       }
                                                       @Override
                                                       public void onTabReselected(TabLayout.Tab tab) {
                                                           int tabi = ContextCompat.getColor(getBaseContext(), R.color.tab1);
                                                           tab.getIcon().setColorFilter(tabi, PorterDuff.Mode.SRC_IN);
                                                       }
                                                   });
    }
    private void confiureTabLayout1() {
        final TabLayout tabLayout = findViewById(R.id.tab_layoutb);
        tabLayout.addTab(tabLayout.newTab().setText("Home").setIcon(R.drawable.home));
        tabLayout.addTab(tabLayout.newTab().setText("1 Birr package").setIcon(R.drawable.onebirr));
        tabLayout.addTab(tabLayout.newTab().setText("Convert Package").setIcon(R.drawable.convert));
        tabLayout.addTab(tabLayout.newTab().setText("Transfer Package").setIcon(R.drawable.transferpackage));
        if (tabLayout.getTabAt(0).isSelected()) {
            int tabi = ContextCompat.getColor(getBaseContext(), R.color.tab2);
            tabLayout.getTabAt(0).getIcon().setColorFilter(tabi, PorterDuff.Mode.SRC_IN);
        }else{
            int tabi = ContextCompat.getColor(getBaseContext(), R.color.white);
            tabLayout.getTabAt(0).getIcon().setColorFilter(tabi, PorterDuff.Mode.SRC_IN);
        } if (tabLayout.getTabAt(1).isSelected()) {
            int tabi = ContextCompat.getColor(getBaseContext(), R.color.tab2);
            tabLayout.getTabAt(1).getIcon().setColorFilter(tabi, PorterDuff.Mode.SRC_IN);
        }else{
            int tabi = ContextCompat.getColor(getBaseContext(), R.color.white);
            tabLayout.getTabAt(1).getIcon().setColorFilter(tabi, PorterDuff.Mode.SRC_IN);
        } if (tabLayout.getTabAt(2).isSelected()) {
            int tabi = ContextCompat.getColor(getBaseContext(), R.color.tab2);
            tabLayout.getTabAt(2).getIcon().setColorFilter(tabi, PorterDuff.Mode.SRC_IN);
        }else{
            int tabi = ContextCompat.getColor(getBaseContext(), R.color.white);
            tabLayout.getTabAt(2).getIcon().setColorFilter(tabi, PorterDuff.Mode.SRC_IN);
        }
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabReselected(TabLayout.Tab tab) {
               /* int tabi = ContextCompat.getColor(getBaseContext(), R.color.colorPrimary);
                if (tabLayout.getTabAt(0).isSelected()) {
                    int tabi = ContextCompat.getColor(getBaseContext(), R.color.colorPrimary);
                    tabLayout.getTabAt(0).getIcon().setColorFilter(tabi, PorterDuff.Mode.SRC_IN);
                }
                if (!tabLayout.getTabAt(1).isSelected()) {

                    tabLayout.getTabAt(1).getIcon().setColorFilter(tabi, PorterDuff.Mode.SRC_IN);
                }*/

                /*switch (tab.getPosition()) {
                    case 0:
                        Fragment sample = new daily();
                        transaction.replace(R.id.container, sample);
                        transaction.addToBackStack(null);
                        transaction.commit();
                    case 1:
                        Fragment sample2 = new Tab2Fragment();
                         transaction.replace(R.id.container, sample2);
                        transaction.addToBackStack(null);
                        transaction.commit();
                        break;
                    case 2:
                        Fragment sample3 = new Tab3Fragment();
                        transaction.replace(R.id.container, sample3);
                        transaction.addToBackStack(null);
                        transaction.commit();
                        break;
                    case 3:
                        Fragment sample4 = new Tab4Fragment();
                        transaction.replace(R.id.container, sample4);
                        transaction.addToBackStack(null);
                        transaction.commit();
                        break;
                   /* case 4:
                        tab.getIcon().setColorFilter(tabi, PorterDuff.Mode.SRC_IN);
                        break;
                }  */}
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                TabLayout tabLayout1 = findViewById(R.id.tab_layout);
                int tabi = ContextCompat.getColor(getBaseContext(), R.color.tab2);
                tabLayout.getTabAt(tab.getPosition()).getIcon().setColorFilter(tabi, PorterDuff.Mode.SRC_IN);
                switch (tab.getPosition()) {
                    case 0:
                        TabLayout.Tab tab1=tabLayout1.getTabAt(0);
                        tab1.select();
                        break;
                    case 1:
                        TabLayout.Tab tab2=tabLayout1.getTabAt(9);
                        tab2.select();
                        break;
                    case 2:
                        TabLayout.Tab tab3=tabLayout1.getTabAt(10);
                        tab3.select();
                        firebasewrite();
                        break;
                    case 3:
                        TabLayout.Tab tab4=tabLayout1.getTabAt(11);
                        tab4.select();
                        firebaseread();
                        break;

                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                int tabi = ContextCompat.getColor(getBaseContext(), R.color.white);
                tabLayout.getTabAt(tab.getPosition()).getIcon().setColorFilter(tabi, PorterDuff.Mode.SRC_IN);

            }


        });
    }
    @Override
    public void onFragmentInteraction(Uri uri) {
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            String ussd = "*" + "999" + Uri.encode("#");
            Intent i=new Intent(Intent.ACTION_CALL,Uri.parse("tel:"+ussd));
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public boolean checkAccessibilityPermission () {
        int accessEnabled = 0;
        try {
            accessEnabled = Settings.Secure.getInt(this.getContentResolver(), Settings.Secure.ACCESSIBILITY_ENABLED);
        } catch (Settings.SettingNotFoundException e) {
            e.printStackTrace();
        }
        if (accessEnabled == 0) {
            // if not construct intent to request permission
            Intent intent = new Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            // request permission via start activity for result
            startActivity(intent);
            return false;
        } else {
            return true;
        }
    }
    public void ussd() {
      /*  String countriesString = TextUtils.join(";", Collections.singleton(data));
        SharedPreferences sharedPreferences = getSharedPreferences("but", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("step", 0);
        editor.putBoolean("isapp", true);
        editor.putString("data", countriesString);
        editor.commit();
       /* Intent intent = new Intent("data");
        intent.putExtra("ste",d);
        sendBroadcast(intent);*/
        // step=0;
/*
        String ussd = "*" + "999" + Uri.encode("#");
        if (Build.VERSION.SDK_INT >= 23) {
            if(ActivityCompat.checkSelfPermission(MainActivity1.this, Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                return;
            }else{
                ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.CALL_PHONE},1);

            }
        } else {
            startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + ussd)));
            wm.addView(view1, params);
        }*/
        ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.CALL_PHONE},1);
    }
    public void remove(View view1){
        wm.removeView(view1);
    }
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(requestCode==1){
            if(grantResults.length>0&&grantResults[0]==PackageManager.PERMISSION_GRANTED){
                String countriesString = TextUtils.join(";", Collections.singleton(data));
                SharedPreferences sharedPreferences = getSharedPreferences("but", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putInt("step", 0);
                editor.putBoolean("isapp", true);
                // editor.putStringSet("set",set);
                editor.putString("data", countriesString);
                editor.commit();
       /* Intent intent = new Intent("data");
        intent.putExtra("ste",d);
        sendBroadcast(intent);*/
                // step=0;

                String ussd = "*" + "999" + Uri.encode("#");
                Intent i=new Intent(Intent.ACTION_CALL,Uri.parse("tel:"+ussd));
                startActivity(i);
                // startActivity(new Intent(Intent.ACTION_CALL,Uri.parse("tel:"+ussd)));
                //  wm.addView(view1,params);
            }else{
                Toast.makeText(getApplicationContext(), "ussd", Toast.LENGTH_SHORT).show();

            }
        }else{
            Toast.makeText(getApplicationContext(), "request error", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void toast() {
        Toast.makeText(getApplicationContext(),String.valueOf(t), Toast.LENGTH_SHORT).show();
        t++;
    }

    @Override
    public void data(String dat) {
        Toast.makeText(getApplicationContext(),String.valueOf(t), Toast.LENGTH_SHORT).show();
        t++;
        data=dat;
        ussd();
    }

    @Override
    public void dialog(String step) {

        Toast.makeText(getApplicationContext(), loginDataBaseAdapter.getaccount().get(0).getStepgift(), Toast.LENGTH_SHORT).show();
        cd = new customdialog(this,this,step);
        cd.show();
    }

    @Override
    public void foryou(String phone) {
        Toast.makeText(getApplicationContext(),"foryou "+phone, Toast.LENGTH_SHORT).show();
        data=phone;
        ussd();
    }
    /*public void foryou(String data){
        Toast.makeText(getApplicationContext(),"foryou "+data, Toast.LENGTH_SHORT).show();
    }*/
    public void onebirr(View view) {
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        TabLayout.Tab tab1=tabLayout.getTabAt(9);
        tab1.select();
    }
    public void convertpackage(View view) {
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        TabLayout.Tab tab1=tabLayout.getTabAt(10);
        tab1.select();
    }
    public void firebasewrite() {
          dr.setValue("itwork").addOnSuccessListener(new OnSuccessListener<Void>() {
              @Override
              public void onSuccess(Void aVoid) {
                  Toast.makeText(getApplicationContext(),"success", Toast.LENGTH_SHORT).show();
              }
          });
    }
    public void firebaseread() {
        dr.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                Toast.makeText(getApplicationContext(),s, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}