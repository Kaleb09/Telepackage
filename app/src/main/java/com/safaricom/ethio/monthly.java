package com.kaleb.ethio;

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
 * Use the {@link monthly#newInstance} factory method to
 * create an instance of this fragment.
 */
public class monthly extends Fragment implements ClickListner {
    TextView t;
    Button b; //FirebaseDatabase f;
  private RecyclerView mRecyclerView;
    private RecyclerAdapter mRecyclerAdapter;
    private RecyclerView.LayoutManager mLayoutManager;String s;//MainActivity1 n;
    Button btnAddItem,but;
    ArrayList<MyListData> myList = new ArrayList<>();
    EditText etTitle, etDescription;
    String title = "",description = "";
    ImageView crossImage;  public static List<String> list=new ArrayList<String>();
    // RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;RecyclerView.Adapter adapter;

    /* @Override
    public void OnRemoveClick(int index) {
        d=f.getReference("digtal/"+s+"/Transaction/Sent/"+list.get(index));
        d.removeValue();
        list.remove(index);
        myList.remove(index);
        mRecyclerAdapter.notifyData(myList);
    }*/
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

    public monthly() {
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
    public static monthly newInstance(String param1, String param2) {
        monthly fragment = new monthly();
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
        mRecyclerView = (RecyclerView)root.findViewById(R.id.recycle);
        mRecyclerAdapter = new RecyclerAdapter(myList,this);
        final LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(mRecyclerAdapter);
       myList.clear();
        MyListData mLog = new MyListData();
         mLog.setDescription("kaleb");
        mLog.setImgId(R.drawable.night);
        myList.add(mLog);
        mRecyclerAdapter.notifyData(myList);
        mLog.setDescription("Adamu");
        mLog.setImgId(R.drawable.night);
        myList.add(mLog);
        mRecyclerAdapter.notifyData(myList);
        mLog.setDescription("Biyadglign");
        mLog.setImgId(R.drawable.night);
        myList.add(mLog);
        mRecyclerAdapter.notifyData(myList);
        mLog.setDescription("Abebaw");
        mLog.setImgId(R.drawable.night);
        myList.add(mLog);
        mRecyclerAdapter.notifyData(myList);
        return root;
    }
    public static void lista(String k){
        list.add(k);
    }


}