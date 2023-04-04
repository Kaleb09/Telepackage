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
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link internetdaily#newInstance} factory method to
 * create an instance of this fragment.
 */
public class internetdaily extends Fragment implements ClickListner /*implements RemoveClickListner*/ {
    TextView t;customdialog cd;
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
    public void data(String data) {
        ((MainActivity)getActivity()).data(data);
    }

    @Override
    public void dialog(String ste) {
        ((MainActivity)getActivity()).dialog(ste);
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

    public internetdaily() {
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
    public static internetdaily newInstance(String param1, String param2) {
        internetdaily fragment = new internetdaily();
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
       if(s=="Am"){
           mLog.setDescription(getString(R.string.interdailyam));
       }else{
           mLog.setDescription(getString(R.string.interdailyen));
       }
         mLog.setStep("2;1;2;1;1");
        mLog.setStepgift("2;2;2;1;1;");
        mLog.setImgId(R.drawable.daily);
        myList.add(0,mLog);
        mRecyclerAdapter.notifyData(myList);
        MyListData mLog1 = new MyListData();
        mLog1.setStep("1;1;1;1");
        if(s=="Am"){
            mLog1.setDescription(getString(R.string.interdailyam1));
        }else{
            mLog1.setDescription(getString(R.string.interdailyen1));
        }
        mLog1.setImgId(R.drawable.daily);
        myList.add(1,mLog1);
        mRecyclerAdapter.notifyData(myList);
        MyListData mLog2 = new MyListData();
        mLog2.setStep("1;2;1;1");
        if(s=="Am"){
            mLog2.setDescription(getString(R.string.interdailyam2));
        }else{
            mLog2.setDescription(getString(R.string.interdailyen2));
        }        mLog2.setImgId(R.drawable.daily);
        myList.add(2,mLog2);
        mRecyclerAdapter.notifyData(myList);
        MyListData mLog3 = new MyListData();
        mLog3.setStep("1;2;1;2;1");
        if(s=="Am"){
            mLog3.setDescription(getString(R.string.interdailyam3));
        }else{
            mLog3.setDescription(getString(R.string.interdailyen3));
        }        mLog3.setImgId(R.drawable.daily);
        myList.add(3,mLog3);
        mRecyclerAdapter.notifyData(myList);
        return root;
    }
    public static void lista(String k){
        list.add(k);
    } public void foryou(String data){
        Toast.makeText(getContext(),"foryou "+data, Toast.LENGTH_SHORT).show();
    }
}