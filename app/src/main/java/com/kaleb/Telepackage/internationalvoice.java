package com.kaleb.Telepackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.tabs.TabLayout;

import java.util.Objects;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link internationalvoice#newInstance} factory method to
 * create an instance of this fragment.
 */
public class internationalvoice extends Fragment {
    TabLayout tabLayout;LoginDataBaseAdapter loginDataBaseAdapter;
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

    public internationalvoice() {
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
    public static internationalvoice newInstance(String param1, String param2) {
        internationalvoice fragment = new internationalvoice();
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
        View root=inflater.inflate(R.layout.fragment_tab1, container, false);
        tabLayout = root.findViewById(R.id.tabLayoutfixed);
        loginDataBaseAdapter = new LoginDataBaseAdapter(root.getContext());
        loginDataBaseAdapter = loginDataBaseAdapter.open();
       confiureTabLayout();
        return root;
    }
    private void confiureTabLayout() {
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("but", Context.MODE_PRIVATE);
        String s = sharedPreferences.getString("language", "Am");
        if(sharedPreferences.getBoolean("issafaricom",false)){
            if(Objects.equals(s, "Am")&&loginDataBaseAdapter.getsubtab(loginDataBaseAdapter.subtabsafam).size()>0){
                if(!loginDataBaseAdapter.getsubtab(loginDataBaseAdapter.subtabsafam).get(0).gettab6Subtab1name().equals("")){
                    tabLayout.addTab(tabLayout.newTab().setText(loginDataBaseAdapter.getsubtab(loginDataBaseAdapter.subtabsafam).get(0).gettab6Subtab1name()));
                }
                if(!loginDataBaseAdapter.getsubtab(loginDataBaseAdapter.subtabsafam).get(0).gettab6Subtab2name().equals("")){
                    tabLayout.addTab(tabLayout.newTab().setText(loginDataBaseAdapter.getsubtab(loginDataBaseAdapter.subtabsafam).get(0).gettab6Subtab2name()));
                }if(!loginDataBaseAdapter.getsubtab(loginDataBaseAdapter.subtabsafam).get(0).gettab6Subtab3name().equals("")){
                    tabLayout.addTab(tabLayout.newTab().setText(loginDataBaseAdapter.getsubtab(loginDataBaseAdapter.subtabsafam).get(0).gettab6Subtab3name()));
                }if(!loginDataBaseAdapter.getsubtab(loginDataBaseAdapter.subtabsafam).get(0).gettab6Subtab4name().equals("")){
                    tabLayout.addTab(tabLayout.newTab().setText(loginDataBaseAdapter.getsubtab(loginDataBaseAdapter.subtabsafam).get(0).gettab6Subtab4name()));
                }
            }
            else if(Objects.equals(s, "En")&&loginDataBaseAdapter.getsubtab(loginDataBaseAdapter.subtabsaf).size()>0){
                if(!loginDataBaseAdapter.getsubtab(loginDataBaseAdapter.subtabsaf).get(0).gettab6Subtab1name().equals("")){
                    tabLayout.addTab(tabLayout.newTab().setText(loginDataBaseAdapter.getsubtab(loginDataBaseAdapter.subtabsaf).get(0).gettab6Subtab1name()));
                }
                if(!loginDataBaseAdapter.getsubtab(loginDataBaseAdapter.subtabsaf).get(0).gettab6Subtab2name().equals("")){
                    tabLayout.addTab(tabLayout.newTab().setText(loginDataBaseAdapter.getsubtab(loginDataBaseAdapter.subtabsaf).get(0).gettab6Subtab2name()));
                }if(!loginDataBaseAdapter.getsubtab(loginDataBaseAdapter.subtabsaf).get(0).gettab6Subtab3name().equals("")){
                    tabLayout.addTab(tabLayout.newTab().setText(loginDataBaseAdapter.getsubtab(loginDataBaseAdapter.subtabsaf).get(0).gettab6Subtab3name()));
                }if(!loginDataBaseAdapter.getsubtab(loginDataBaseAdapter.subtabsaf).get(0).gettab6Subtab4name().equals("")){
                    tabLayout.addTab(tabLayout.newTab().setText(loginDataBaseAdapter.getsubtab(loginDataBaseAdapter.subtabsaf).get(0).gettab6Subtab4name()));
                }
            }

        }else {
            if(Objects.equals(s, "Am")&&loginDataBaseAdapter.getsubtab(loginDataBaseAdapter.subtabetam).size()>0){
                if(!loginDataBaseAdapter.getsubtab(loginDataBaseAdapter.subtabetam).get(0).gettab6Subtab1name().equals("")){
                    tabLayout.addTab(tabLayout.newTab().setText(loginDataBaseAdapter.getsubtab(loginDataBaseAdapter.subtabetam).get(0).gettab6Subtab1name()));
                }
                if(!loginDataBaseAdapter.getsubtab(loginDataBaseAdapter.subtabetam).get(0).gettab6Subtab2name().equals("")){
                    tabLayout.addTab(tabLayout.newTab().setText(loginDataBaseAdapter.getsubtab(loginDataBaseAdapter.subtabetam).get(0).gettab6Subtab2name()));
                }if(!loginDataBaseAdapter.getsubtab(loginDataBaseAdapter.subtabetam).get(0).gettab6Subtab3name().equals("")){
                    tabLayout.addTab(tabLayout.newTab().setText(loginDataBaseAdapter.getsubtab(loginDataBaseAdapter.subtabetam).get(0).gettab6Subtab3name()));
                }if(!loginDataBaseAdapter.getsubtab(loginDataBaseAdapter.subtabetam).get(0).gettab6Subtab4name().equals("")){
                    tabLayout.addTab(tabLayout.newTab().setText(loginDataBaseAdapter.getsubtab(loginDataBaseAdapter.subtabetam).get(0).gettab6Subtab4name()));
                }
            }if(Objects.equals(s, "En")&&loginDataBaseAdapter.getsubtab(loginDataBaseAdapter.subtabet).size()>0){
                if(!loginDataBaseAdapter.getsubtab(loginDataBaseAdapter.subtabet).get(0).gettab6Subtab1name().equals("")){
                    tabLayout.addTab(tabLayout.newTab().setText(loginDataBaseAdapter.getsubtab(loginDataBaseAdapter.subtabet).get(0).gettab6Subtab1name()));
                }
                if(!loginDataBaseAdapter.getsubtab(loginDataBaseAdapter.subtabet).get(0).gettab6Subtab2name().equals("")){
                    tabLayout.addTab(tabLayout.newTab().setText(loginDataBaseAdapter.getsubtab(loginDataBaseAdapter.subtabet).get(0).gettab6Subtab2name()));
                }if(!loginDataBaseAdapter.getsubtab(loginDataBaseAdapter.subtabet).get(0).gettab6Subtab3name().equals("")){
                    tabLayout.addTab(tabLayout.newTab().setText(loginDataBaseAdapter.getsubtab(loginDataBaseAdapter.subtabet).get(0).gettab6Subtab3name()));
                }if(!loginDataBaseAdapter.getsubtab(loginDataBaseAdapter.subtabet).get(0).gettab6Subtab4name().equals("")){
                    tabLayout.addTab(tabLayout.newTab().setText(loginDataBaseAdapter.getsubtab(loginDataBaseAdapter.subtabet).get(0).gettab6Subtab4name()));
                }
            }
        }
        if(tabLayout.getTabCount()==1){
            tabLayout.setVisibility(View.GONE);
            tabLayout.selectTab(tabLayout.getTabAt(0));
            FragmentManager manager = getChildFragmentManager();
            final FragmentTransaction transaction = manager.beginTransaction();
            final Fragment sample = new internationalvoicedaily(0);
            transaction.replace(R.id.host, sample);
            transaction.addToBackStack(null);
            transaction.commit();
        }else
        if(tabLayout.getTabCount()>1){
            tabLayout.setVisibility(View.VISIBLE);
            tabLayout.selectTab(tabLayout.getTabAt(0));
            FragmentManager manager = getChildFragmentManager();
            final FragmentTransaction transaction = manager.beginTransaction();
            final Fragment sample = new internationalvoicedaily(0);
            transaction.replace(R.id.host, sample);
            transaction.addToBackStack(null);
            transaction.commit();
        }
        else{
            tabLayout.setVisibility(View.GONE);
        }
        /* if(Objects.equals(s, "Am")){
            tabLayout.addTab(tabLayout.newTab().setText("ዕለታዊ"));
        }if(Objects.equals(s, "En")){
            tabLayout.addTab(tabLayout.newTab().setText("daily"));
        }if(Objects.equals(s, "Am")){
            tabLayout.addTab(tabLayout.newTab().setText("ሳምንታዊ"));
        }if(Objects.equals(s, "En")){
            tabLayout.addTab(tabLayout.newTab().setText("weekly"));
        }
        if(Objects.equals(s, "Am")){
            tabLayout.addTab(tabLayout.newTab().setText("ወርሀዊ"));
        }if(Objects.equals(s, "En")){
            tabLayout.addTab(tabLayout.newTab().setText("monthly"));
        }
        //  tabLayout.addTab(tabLayout.newTab().setText("night"));
        FragmentManager manager = getChildFragmentManager();
        final FragmentTransaction transaction = manager.beginTransaction();
        final Fragment sample = new internationalvoicedaily();
        transaction.replace(R.id.host, sample);
        transaction.addToBackStack(null);
        transaction.commit();*/
        //tabLayout.addTab(tabLayout.newTab().setText("Fresh Graduate"));
//       tabLayout.addTab(tabLayout.newTab().setText("Scholarship").setIcon(R.drawable.scholarship));
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
                } */ }
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                FragmentManager manager = getChildFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                switch (tab.getPosition()) {
                    case 0:
                        Fragment sample = new internationalvoicedaily(0);
                        transaction.replace(R.id.host, sample);
                        transaction.addToBackStack(null);
                        transaction.commit();
                        break;
                    case 1:
                        Fragment sample1 = new internationalvoicedaily(1);
                        transaction.replace(R.id.host, sample1);
                        transaction.addToBackStack(null);
                        transaction.commit();
                        break;
                    case 2:
                        Fragment sample2 = new internationalvoicedaily(2);
                        transaction.replace(R.id.host, sample2);
                        transaction.addToBackStack(null);
                        transaction.commit();
                        break;
                    case 3:
                        Fragment sample3 = new internationalvoicedaily(3);
                        transaction.replace(R.id.host, sample3);
                        transaction.addToBackStack(null);
                        transaction.commit();
                        break;
                   /* case 4:
                        tab.getIcon().setColorFilter(tabi, PorterDuff.Mode.SRC_IN);
                        break;*/
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {


            }


        });
    }
}