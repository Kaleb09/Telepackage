package com.kaleb.Telepackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link longtermquarterpackage#newInstance} factory method to
 * create an instance of this fragment.
 */
public class add extends Fragment implements ClickListner {
    TextView t;LoginDataBaseAdapter loginDataBaseAdapter;
    Button b; //FirebaseDatabase f;
    private RecyclerView mRecyclerView;
    private RecyclerAdapter mRecyclerAdapter;
    // private RecyclerView.LayoutManager mLayoutManager;String s;//MainActivity1 n;
    Button btnAddItem,but;
    ArrayList<MyListData> myList;
    EditText etTitle, etDescription;
    String title = "",description = "";
    ImageView crossImage;  public static List<String> list=new ArrayList<String>();
    // RecyclerView recyclerView;
    //RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;

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
   /* @Override
    public void OnRemoveClick(int index) {
        d=f.getReference("digtal/"+s+"/Transaction/Sent/"+list.get(index));
        d.removeValue();
        list.remove(index);
        myList.remove(index);
        mRecyclerAdapter.notifyData(myList);
    }*/


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

    public add() {
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
    public static longtermquarterpackage newInstance(String param1, String param2) {
        longtermquarterpackage fragment = new longtermquarterpackage(0);
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
        if(Objects.equals(s, "Am")){
            mLog.setDescription(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledailyam).get(0).getTab10());
        }if(Objects.equals(s, "En")){
            mLog.setDescription(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledaily).get(0).getTab10());
        }
        mLog.setStep(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledaily).get(0).getForyou10());
        mLog.setStepgift(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledaily).get(0).getGift10());
        mLog.setCheck(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledaily).get(0).getTag10());
        mLog.setImgId(R.drawable.daily);
        myList.add(0,mLog);
        mRecyclerAdapter.notifyData(myList);
        MyListData mLog1 = new MyListData();
        mLog1.setStep(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledaily).get(1).getForyou10());
        mLog1.setStepgift(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledaily).get(1).getGift10());
        mLog1.setCheck(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledaily).get(1).getTag10());
        if(Objects.equals(s, "Am")){
            mLog1.setDescription(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledailyam).get(1).getTab10());
        }if(Objects.equals(s, "En")){
            mLog1.setDescription(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledaily).get(1).getTab10());
           // Toast.makeText(getContext(),  loginDataBaseAdapter.get(loginDataBaseAdapter.tabledaily).get(1).getTab10(), Toast.LENGTH_SHORT).show();
        }
        mLog1.setImgId(R.drawable.daily);
        myList.add(1,mLog1);
        mRecyclerAdapter.notifyData(myList);

        MyListData mLog2 = new MyListData();
        mLog2.setStep(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledaily).get(2).getForyou10());
        mLog2.setStepgift(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledaily).get(2).getGift10());
        mLog2.setCheck(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledaily).get(2).getTag10());

        if(Objects.equals(s, "Am")){
            mLog2.setDescription(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledailyam).get(2).getTab10());
        }if(Objects.equals(s, "En")){
            mLog2.setDescription(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledaily).get(2).getTab10());
        }        mLog2.setImgId(R.drawable.daily);
        myList.add(2,mLog2);
        mRecyclerAdapter.notifyData(myList);
        MyListData mLog3 = new MyListData();
        mLog3.setStep(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledaily).get(3).getForyou10());
        mLog3.setStepgift(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledaily).get(3).getGift10());
        mLog3.setCheck(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledaily).get(3).getTag10());
        if(Objects.equals(s, "Am")){
            mLog3.setDescription(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledailyam).get(3).getTab10());
        }if(Objects.equals(s, "En")){
            mLog3.setDescription(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledaily).get(3).getTab10());
        }        mLog3.setImgId(R.drawable.daily);
        myList.add(3,mLog3);
        mRecyclerAdapter.notifyData(myList);

        MyListData mLog4 = new MyListData();
        mLog4.setStep(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledaily).get(4).getForyou10());
        mLog4.setStepgift(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledaily).get(4).getGift10());
        mLog4.setCheck(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledaily).get(4).getTag10());
        if(Objects.equals(s, "Am")){
            mLog4.setDescription(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledailyam).get(4).getTab10());
        }if(Objects.equals(s, "En")){
            mLog4.setDescription(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledaily).get(4).getTab10());
        }        mLog4.setImgId(R.drawable.daily);
        myList.add(4,mLog4);
        mRecyclerAdapter.notifyData(myList);

        MyListData mLog5 = new MyListData();
        mLog5.setStep(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledaily).get(5).getForyou10());
        mLog5.setStepgift(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledaily).get(5).getGift10());
        mLog5.setCheck(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledaily).get(5).getTag10());
        if(Objects.equals(s, "Am")){
            mLog5.setDescription(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledailyam).get(5).getTab10());
        }if(Objects.equals(s, "En")){
            mLog5.setDescription(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledaily).get(5).getTab10());
        }        mLog5.setImgId(R.drawable.daily);
        myList.add(5,mLog5);
        mRecyclerAdapter.notifyData(myList);

        return root;
    }
    public static void lista(String k){
        list.add(k);
    }

}