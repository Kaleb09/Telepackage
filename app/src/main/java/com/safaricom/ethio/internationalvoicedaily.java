package com.kaleb.ethio;

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
 * Use the {@link flexidaily#newInstance} factory method to
 * create an instance of this fragment.
 */
public class internationalvoicedaily extends Fragment implements ClickListner {
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
int subtab=0;
    public internationalvoicedaily(int i) {
        subtab=i;
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
    public static flexidaily newInstance(String param1, String param2) {
        flexidaily fragment = new flexidaily(0);
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
        if(subtab==0) {
            if (sharedPreferences.getBoolean("issafaricom", false) && loginDataBaseAdapter.get(loginDataBaseAdapter.tabledailysaf).size() > 0) {

                for (int i = 0; i < loginDataBaseAdapter.get(loginDataBaseAdapter.tabledailysaf).size(); i++) {
                    MyListData mLog = new MyListData();
                    if (Objects.equals(s, "Am")) {
                        mLog.setDescription(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledailyamsaf).get(i).getTab6());
                    }
                    if (Objects.equals(s, "En")) {
                        mLog.setDescription(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledailysaf).get(i).getTab6());
                    }
                    mLog.setStep(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledailysaf).get(i).getForyou6());
                    mLog.setStepgift(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledailysaf).get(i).getGift6());
                    mLog.setImgId(R.drawable.daily);
                    mLog.setCheck(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledailysaf).get(i).getTag6());
                    myList.add(i, mLog);
                    mRecyclerAdapter.notifyData(myList);
                }

            } else if (loginDataBaseAdapter.get(loginDataBaseAdapter.tabledaily).size() > 0) {
                for (int i = 0; i < loginDataBaseAdapter.get(loginDataBaseAdapter.tabledaily).size(); i++) {
                    MyListData mLog = new MyListData();
                    if (Objects.equals(s, "Am")) {
                        mLog.setDescription(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledailyam).get(i).getTab6());
                    }
                    if (Objects.equals(s, "En")) {
                        mLog.setDescription(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledaily).get(i).getTab6());
                    }
                    mLog.setStep(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledaily).get(i).getForyou6());
                    mLog.setStepgift(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledaily).get(i).getGift6());
                    mLog.setImgId(R.drawable.daily);
                    mLog.setCheck(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledaily).get(i).getTag6());
                    myList.add(i, mLog);
                    mRecyclerAdapter.notifyData(myList);
                }
            }
        }else if(subtab==1){
            if(sharedPreferences.getBoolean("issafaricom",false)&&loginDataBaseAdapter.get(loginDataBaseAdapter.tableweeklysaf).size()>0) {

                for(int i=0;i<loginDataBaseAdapter.get(loginDataBaseAdapter.tableweeklysaf).size();i++){
                    MyListData mLog = new MyListData();
                    if (Objects.equals(s, "Am")) {
                        mLog.setDescription(loginDataBaseAdapter.get(loginDataBaseAdapter.tableweeklyamsaf).get(i).getTab6());
                    }
                    if (Objects.equals(s, "En")) {
                        mLog.setDescription(loginDataBaseAdapter.get(loginDataBaseAdapter.tableweeklysaf).get(i).getTab6());
                    }
                    mLog.setStep(loginDataBaseAdapter.get(loginDataBaseAdapter.tableweeklysaf).get(i).getForyou6());
                    mLog.setStepgift(loginDataBaseAdapter.get(loginDataBaseAdapter.tableweeklysaf).get(i).getGift6());
                    mLog.setImgId(R.drawable.weekly);
                    mLog.setCheck(loginDataBaseAdapter.get(loginDataBaseAdapter.tableweeklysaf).get(i).getTag6());
                    myList.add(i, mLog);
                    mRecyclerAdapter.notifyData(myList);
                }

            }else  if(loginDataBaseAdapter.get(loginDataBaseAdapter.tableweekly).size()>0) {
                for(int i=0;i<loginDataBaseAdapter.get(loginDataBaseAdapter.tableweekly).size();i++){
                    MyListData mLog = new MyListData();
                    if (Objects.equals(s, "Am")) {
                        mLog.setDescription(loginDataBaseAdapter.get(loginDataBaseAdapter.tableweeklyam).get(i).getTab6());
                    }
                    if (Objects.equals(s, "En")) {
                        mLog.setDescription(loginDataBaseAdapter.get(loginDataBaseAdapter.tableweekly).get(i).getTab6());
                    }
                    mLog.setStep(loginDataBaseAdapter.get(loginDataBaseAdapter.tableweekly).get(i).getForyou6());
                    mLog.setStepgift(loginDataBaseAdapter.get(loginDataBaseAdapter.tableweekly).get(i).getGift6());
                    mLog.setImgId(R.drawable.weekly);
                    mLog.setCheck(loginDataBaseAdapter.get(loginDataBaseAdapter.tableweekly).get(i).getTag6());
                    myList.add(i, mLog);
                    mRecyclerAdapter.notifyData(myList);
                }
            }
        }else if(subtab==2){
            if(sharedPreferences.getBoolean("issafaricom",false)&&loginDataBaseAdapter.get(loginDataBaseAdapter.tablemonthlysaf).size()>0) {

                for(int i=0;i<loginDataBaseAdapter.get(loginDataBaseAdapter.tablemonthlysaf).size();i++){
                    MyListData mLog = new MyListData();
                    if (Objects.equals(s, "Am")) {
                        mLog.setDescription(loginDataBaseAdapter.get(loginDataBaseAdapter.tablemonthlyamsaf).get(i).getTab6());
                    }
                    if (Objects.equals(s, "En")) {
                        mLog.setDescription(loginDataBaseAdapter.get(loginDataBaseAdapter.tablemonthlysaf).get(i).getTab6());
                    }
                    mLog.setStep(loginDataBaseAdapter.get(loginDataBaseAdapter.tablemonthlysaf).get(i).getForyou6());
                    mLog.setStepgift(loginDataBaseAdapter.get(loginDataBaseAdapter.tablemonthlysaf).get(i).getGift6());
                    mLog.setImgId(R.drawable.monthly);
                    mLog.setCheck(loginDataBaseAdapter.get(loginDataBaseAdapter.tablemonthlysaf).get(i).getTag6());
                    myList.add(i, mLog);
                    mRecyclerAdapter.notifyData(myList);
                }

            }else  if(loginDataBaseAdapter.get(loginDataBaseAdapter.tablemonthly).size()>0) {
                for(int i=0;i<loginDataBaseAdapter.get(loginDataBaseAdapter.tablemonthly).size();i++){
                    MyListData mLog = new MyListData();
                    if (Objects.equals(s, "Am")) {
                        mLog.setDescription(loginDataBaseAdapter.get(loginDataBaseAdapter.tablemonthlyam).get(i).getTab6());
                    }
                    if (Objects.equals(s, "En")) {
                        mLog.setDescription(loginDataBaseAdapter.get(loginDataBaseAdapter.tablemonthly).get(i).getTab6());
                    }
                    mLog.setStep(loginDataBaseAdapter.get(loginDataBaseAdapter.tablemonthly).get(i).getForyou6());
                    mLog.setStepgift(loginDataBaseAdapter.get(loginDataBaseAdapter.tablemonthly).get(i).getGift6());
                    mLog.setImgId(R.drawable.monthly);
                    mLog.setCheck(loginDataBaseAdapter.get(loginDataBaseAdapter.tablemonthly).get(i).getTag6());
                    myList.add(i, mLog);
                    mRecyclerAdapter.notifyData(myList);
                }
            }
        }else if(subtab==3){
            if(sharedPreferences.getBoolean("issafaricom",false)&&loginDataBaseAdapter.get(loginDataBaseAdapter.tablenightsaf).size()>0) {

                for(int i=0;i<loginDataBaseAdapter.get(loginDataBaseAdapter.tablenightsaf).size();i++){
                    MyListData mLog = new MyListData();
                    if (Objects.equals(s, "Am")) {
                        mLog.setDescription(loginDataBaseAdapter.get(loginDataBaseAdapter.tablenightamsaf).get(i).getTab6());
                    }
                    if (Objects.equals(s, "En")) {
                        mLog.setDescription(loginDataBaseAdapter.get(loginDataBaseAdapter.tablenightsaf).get(i).getTab6());
                    }
                    mLog.setStep(loginDataBaseAdapter.get(loginDataBaseAdapter.tablenightsaf).get(i).getForyou6());
                    mLog.setStepgift(loginDataBaseAdapter.get(loginDataBaseAdapter.tablenightsaf).get(i).getGift6());
                    mLog.setImgId(R.drawable.night);
                    mLog.setCheck(loginDataBaseAdapter.get(loginDataBaseAdapter.tablenightsaf).get(i).getTag6());
                    myList.add(i, mLog);
                    mRecyclerAdapter.notifyData(myList);
                }

            }else  if(loginDataBaseAdapter.get(loginDataBaseAdapter.tablenight).size()>0) {
                for(int i=0;i<loginDataBaseAdapter.get(loginDataBaseAdapter.tablenight).size();i++){
                    MyListData mLog = new MyListData();
                    if (Objects.equals(s, "Am")) {
                        mLog.setDescription(loginDataBaseAdapter.get(loginDataBaseAdapter.tablenightam).get(i).getTab6());
                    }
                    if (Objects.equals(s, "En")) {
                        mLog.setDescription(loginDataBaseAdapter.get(loginDataBaseAdapter.tablenight).get(i).getTab6());
                    }
                    mLog.setStep(loginDataBaseAdapter.get(loginDataBaseAdapter.tablenight).get(i).getForyou6());
                    mLog.setStepgift(loginDataBaseAdapter.get(loginDataBaseAdapter.tablenight).get(i).getGift6());
                    mLog.setImgId(R.drawable.night);
                    mLog.setCheck(loginDataBaseAdapter.get(loginDataBaseAdapter.tablenight).get(i).getTag6());
                    myList.add(i, mLog);
                    mRecyclerAdapter.notifyData(myList);
                }
            }
        }
        return root;
    }
    public static void lista(String k){
        list.add(k);
    }

}