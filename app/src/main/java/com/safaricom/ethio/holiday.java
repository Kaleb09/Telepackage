package com.kaleb.ethio;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.tabs.TabLayout;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Objects;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link holiday#newInstance} factory method to
 * create an instance of this fragment.
 */
public class holiday extends Fragment implements ClickListner{
    TabLayout tabLayout;
    DatabaseReference holiday,holiday0,holiday1,holiday2,holiday3,holiday4,holiday5,holidayf0,holidayf1,holidayf2,holidayf3,holidayf4,holidayf5,holidayg0,holidayg1,holidayg2,holidayg3,holidayg4,holidayg5
    ,holidayam0,holidayam1,holidayam2,holidayam3,holidayam4,holidayam5;
    String holidayt,holidayt0,holidayt1,holidayt2,holidayt3,holidayt4,holidayt5,holidaytam0,holidaytam1,holidaytam2,holidaytam3,holidaytam4,holidaytam5,holidaytf0,holidaytf1,holidaytf2,holidaytf3,holidaytf4,holidaytf5,holidaytg0,holidaytg1,holidaytg2,holidaytg3,holidaytg4,holidaytg5;
    FirebaseDatabase fd;
    LoginDataBaseAdapter loginDataBaseAdapter;
    ArrayList<MyListData> myList;
    private RecyclerView mRecyclerView;
    private RecyclerAdapter mRecyclerAdapter;
    int total=0;
    @Override
    public void toast() {
        //Toast.makeText(getApplicationContext(),String.valueOf(t), Toast.LENGTH_SHORT).show();
        ((MainActivity)getActivity()).toast();
    }

    @Override
    public void data(String data,String check) {
        ((MainActivity)getActivity()).foryou(data,check);
    }

    @Override
    public void dialog(String ste,String check) {
        ((MainActivity)getActivity()).dialog(ste,check);
    }

    @Override
    public void foryou(String phone, String check) {

    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public holiday() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Tab1Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static holiday newInstance(String param1, String param2) {
        holiday fragment = new holiday();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root=inflater.inflate(R.layout.fragment_tab2, container, false);
        loginDataBaseAdapter = new LoginDataBaseAdapter(root.getContext());
        loginDataBaseAdapter = loginDataBaseAdapter.open();
        myList = new ArrayList<>();
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("but", Context.MODE_PRIVATE);
        String s = sharedPreferences.getString("language", "Am");
        mRecyclerView = (RecyclerView)root.findViewById(R.id.recycle);
        mRecyclerAdapter = new RecyclerAdapter(myList,this);
        final LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(mRecyclerAdapter);
        myList.clear();
        MyListData mLog = new MyListData();

        fd=FirebaseDatabase.getInstance();
        holiday=fd.getReference("Telepackage/holiday");
        holiday0=fd.getReference("Telepackage/holiday/0");
        holiday1=fd.getReference("Telepackage/holiday/1");
        holiday2=fd.getReference("Telepackage/holiday/2");
        holiday3=fd.getReference("Telepackage/holiday/3");
        holiday4=fd.getReference("Telepackage/holiday/4");
        holiday5=fd.getReference("Telepackage/holiday/5");

        holidayf0=fd.getReference("Telepackage/holiday/f0");
        holidayf1=fd.getReference("Telepackage/holiday/f1");
        holidayf2=fd.getReference("Telepackage/holiday/f2");
        holidayf3=fd.getReference("Telepackage/holiday/f3");
        holidayf4=fd.getReference("Telepackage/holiday/f4");
        holidayf5=fd.getReference("Telepackage/holiday/f5");

        holidayg0=fd.getReference("Telepackage/holiday/g0");
        holidayg1=fd.getReference("Telepackage/holiday/g1");
        holidayg2=fd.getReference("Telepackage/holiday/g2");
        holidayg3=fd.getReference("Telepackage/holiday/g3");
        holidayg4=fd.getReference("Telepackage/holiday/g4");
        holidayg5=fd.getReference("Telepackage/holiday/g5");

        holiday=fd.getReference("Telepackage/holiday");
        holidayam0=fd.getReference("Telepackage/holiday/0");
        holidayam1=fd.getReference("Telepackage/holiday/1");
        holidayam2=fd.getReference("Telepackage/holiday/2");
        holidayam3=fd.getReference("Telepackage/holiday/3");
        holidayam4=fd.getReference("Telepackage/holiday/4");
        holidayam5=fd.getReference("Telepackage/holiday/5");

   holiday0.addListenerForSingleValueEvent(new ValueEventListener() {
    @Override
    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
        if(dataSnapshot.exists()){
            holidayt0=dataSnapshot.getValue(String.class);check();

        }
    }

    @Override
    public void onCancelled(@NonNull DatabaseError databaseError) {

    }
    });
        holiday1.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){
                    holidayt1=dataSnapshot.getValue(String.class);check();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });holiday2.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){
                    holidayt2=dataSnapshot.getValue(String.class);check();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });holiday3.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){
                    holidayt3=dataSnapshot.getValue(String.class);check();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });holiday4.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){
                    holidayt4=dataSnapshot.getValue(String.class);check();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });holiday5.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){
                    holidayt5=dataSnapshot.getValue(String.class);check();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        holidayam0.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){
                    holidaytam0=dataSnapshot.getValue(String.class);check();
                   // loginDataBaseAdapter.insertholiday();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        holidayam1.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){
                    holidaytam1=dataSnapshot.getValue(String.class);check();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });holidayam2.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){
                    holidaytam2=dataSnapshot.getValue(String.class);check();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });holidayam3.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){
                    holidaytam3=dataSnapshot.getValue(String.class);check();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });holidayam4.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){
                    holidaytam4=dataSnapshot.getValue(String.class);check();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });holidayam5.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){
                    holidaytam5=dataSnapshot.getValue(String.class);
                    check();                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        holidayf0.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){
                    holidaytf0=dataSnapshot.getValue(String.class);check();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        holidayf1.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){
                    holidaytf1=dataSnapshot.getValue(String.class);check();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });holidayf2.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){
                    holidaytf2=dataSnapshot.getValue(String.class);check();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });holidayf3.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){
                    holidaytf3=dataSnapshot.getValue(String.class);check();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });holidayf4.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){
                    holidaytf4=dataSnapshot.getValue(String.class);check();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });holidayf5.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){
                    holidaytf5=dataSnapshot.getValue(String.class);check();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        holidayg0.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){
                    holidaytg0=dataSnapshot.getValue(String.class);check();
                   // loginDataBaseAdapter.insertholiday();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        holidayg1.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){
                    holidayt1=dataSnapshot.getValue(String.class);check();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });holidayg2.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){
                    holidaytg2=dataSnapshot.getValue(String.class);check();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });holidayg3.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){
                    holidaytg3=dataSnapshot.getValue(String.class);check();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });holidayg4.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){
                    holidaytg4=dataSnapshot.getValue(String.class);check();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        holidayg5.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){
                    holidaytg5=dataSnapshot.getValue(String.class);check();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
         if(Objects.equals(s, "Am")){
            mLog.setDescription(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledailyam).get(0).getTab7());
        }if(Objects.equals(s, "En")){
            mLog.setDescription(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledaily).get(0).getTab7());
        }
        mLog.setStep(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledaily).get(0).getForyou7());
        mLog.setStepgift(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledaily).get(0).getGift7());
        mLog.setCheck(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledaily).get(0).getTag7());
        //Toast.makeText(getContext(), loginDataBaseAdapter.get(loginDataBaseAdapter.tabledaily).get(0).getTag7(), Toast.LENGTH_SHORT).show();
        mLog.setImgId(R.drawable.daily);
        myList.add(0,mLog);
        mRecyclerAdapter.notifyData(myList);
        MyListData mLog1 = new MyListData();
        mLog1.setStep(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledaily).get(1).getForyou7());
        mLog1.setStepgift(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledaily).get(1).getGift7());
        mLog1.setCheck(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledaily).get(1).getTag7());
        if(Objects.equals(s, "Am")){
            mLog1.setDescription(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledailyam).get(1).getTab7());
        }if(Objects.equals(s, "En")){
            mLog1.setDescription(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledaily).get(1).getTab7());
            // Toast.makeText(getContext(),  loginDataBaseAdapter.get(loginDataBaseAdapter.tabledaily).get(1).getTab7(), Toast.LENGTH_SHORT).show();

        }
        mLog1.setImgId(R.drawable.daily);
        myList.add(1,mLog1);
        mRecyclerAdapter.notifyData(myList);


        return root;
    }
    public void assigndatabase(){
        loginDataBaseAdapter.insertholiday(holidayt0,holidaytf0,holidaytg0,holidaytam0);
        loginDataBaseAdapter.insertholiday(holidayt1,holidaytf1,holidaytg1,holidaytam1);
        loginDataBaseAdapter.insertholiday(holidayt2,holidaytf2,holidaytg2,holidaytam2);
        loginDataBaseAdapter.insertholiday(holidayt3,holidaytf3,holidaytg3,holidaytam3);
        loginDataBaseAdapter.insertholiday(holidayt4,holidaytf4,holidaytg4,holidaytam4);
        loginDataBaseAdapter.insertholiday(holidayt5,holidaytf5,holidaytg5,holidaytam5);

    }
    public void check(){
      int i=0;i=i+1;
      total=total+1;
        if(total==24||total>24){
            if(loginDataBaseAdapter.getholiday().size()>0){
                loginDataBaseAdapter.deletejob(loginDataBaseAdapter.tableholiday);
                assigndatabase();
            }{

            }
            Toast.makeText(getContext(),"Updated successfully", Toast.LENGTH_SHORT).show();
            total=0;
        }

    }

}