package com.kaleb.Telepackage;

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

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link internetnight#newInstance} factory method to
 * create an instance of this fragment.
 */
public class internetnight extends Fragment implements ClickListner {
    TextView t;
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

    }

    @Override
    public void data(String data) {

    }

    @Override
    public void dialog(String step) {

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

    public internetnight() {
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
    public static internetnight newInstance(String param1, String param2) {
        internetnight fragment = new internetnight();
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
        mRecyclerView = (RecyclerView)root.findViewById(R.id.recycle);
        mRecyclerAdapter = new RecyclerAdapter(myList,this);
        final LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(mRecyclerAdapter);
       myList.clear();
        MyListData mLog = new MyListData();
         mLog.setDescription("kaleb");
         mLog.setStep("1;1;1;1;1");
        mLog.setImgId(R.drawable.night);
        myList.add(0,mLog);
        mRecyclerAdapter.notifyData(myList);
        MyListData mLog1 = new MyListData();
        mLog1.setStep("1;1;1;1");
        mLog1.setDescription("Adamu");
        mLog1.setImgId(R.drawable.night);
        myList.add(1,mLog1);
        mRecyclerAdapter.notifyData(myList);
        MyListData mLog2 = new MyListData();
        mLog2.setStep("1;2;1;1");
        mLog2.setDescription("Biyadglign");
        mLog2.setImgId(R.drawable.night);
        myList.add(2,mLog2);
        mRecyclerAdapter.notifyData(myList);
        MyListData mLog3 = new MyListData();
        mLog3.setStep("1;2;1;2;1");
        mLog3.setDescription("Abebaw");
        mLog3.setImgId(R.drawable.night);
        myList.add(3,mLog3);
        mRecyclerAdapter.notifyData(myList);
        return root;
    }
    public static void lista(String k){
        list.add(k);
    }

    @Override
    public void foryou(String phone) {

    }
}