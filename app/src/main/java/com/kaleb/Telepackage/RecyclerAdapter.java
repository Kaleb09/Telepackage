package com.kaleb.Telepackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Objects;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerItemViewHolder> {
    private ArrayList<MyListData> myList; forothersdialog cd; SharedPreferences sharedPreferences;
    int mLastPosition = 0; private ClickListner mListner;String s;LoginDataBaseAdapter loginDataBaseAdapter;
    public RecyclerAdapter(ArrayList<MyListData> myList,ClickListner listner) {
        this.myList = myList;
        mListner=listner;
    }
    public RecyclerItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
        RecyclerItemViewHolder holder = new RecyclerItemViewHolder(view);
        sharedPreferences = view.getContext().getSharedPreferences("but", Context.MODE_PRIVATE);
        s = sharedPreferences.getString("language", "Am");
        loginDataBaseAdapter = new LoginDataBaseAdapter(parent.getContext());
        loginDataBaseAdapter = loginDataBaseAdapter.open();
        return holder;
    }
    @Override
    public void onBindViewHolder(final RecyclerItemViewHolder holder, final int position) {
        Log.d("onBindViewHoler ", myList.size() + "");
       // holder.etTitleTextView.setText(myList.get(position).getTitle());
       /* if(position!=myList.size()-1){
            holder.c.setVisibility(View.GONE);}*/
        if(Objects.equals(s, "Am")){
            holder.you.setText("ለ እርስዎ");
            holder.gift.setText("ለ ስጦታ");

        }if(Objects.equals(s, "En")){
            holder.you.setText("For you");
            holder.gift.setText("For gift");
        }
        if( (Objects.equals(myList.get(position).getDescription(),"")/*||myList.get(position).getDescription()==null*/)&&holder.card.getVisibility()==View.VISIBLE){
            holder.card.setVisibility(View.GONE);
            holder.etDescriptionTextView.setText("invisible");
        }
        else{
            holder.card.setVisibility(View.VISIBLE);
            holder.etDescriptionTextView.setText(myList.get(position).getDescription());
        }
        holder.linearLayout.setVisibility(View.GONE);
        holder.etDescriptionTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 // Toast.makeText(v.getContext(), String.valueOf(loginDataBaseAdapter.get(loginDataBaseAdapter.tabledaily).size())+" and "+String.valueOf(loginDataBaseAdapter.getdatasize(loginDataBaseAdapter.tabledaily)), Toast.LENGTH_SHORT).show();
                  //loginDataBaseAdapter.deletedata(loginDataBaseAdapter.tabledailyam);
                MyListData myListData=new MyListData();
                myListData.setForyou1("kalebf");
                myListData.setGift1("kalebg");
                myListData.setTag1("kalebt");
              //  loginDataBaseAdapter.updatetotable(myListData, loginDataBaseAdapter.tabledaily,String.valueOf(position+1));

                Toast.makeText(v.getContext(), "id"+loginDataBaseAdapter.get(loginDataBaseAdapter.tabledaily).get(position).getId()+" "+myList.get(position).getStep()+" and "+myList.get(position).getStepgift()+" and "+
                        myList.get(position).getCheck(), Toast.LENGTH_SHORT).show();


                if( holder.linearLayout.getVisibility()==View.VISIBLE){
                holder.linearLayout.setVisibility(View.GONE);
                }
              else if(holder.linearLayout.getVisibility()==View.GONE){
                  holder.linearLayout.setVisibility(View.VISIBLE);
              }

            }
        });
        holder.cardViewfor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               mListner.data(myList.get(position).getStep(),myList.get(position).getCheck());
                holder.linearLayout.setVisibility(View.GONE);

            }
        });
        holder.cardViewgif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* mListner.dialog(myList.get(position).getStepgift(),myList.get(position).getCheck());
                holder.linearLayout.setVisibility(View.GONE);*/
                Toast.makeText(v.getContext(), "tag is"+myList.get(position).getCheck(), Toast.LENGTH_SHORT).show();


            }
        });
        holder.icon.setImageResource(myList.get(position).getImgId());
        mLastPosition =position;
    }@Override
    public int getItemCount() {
        return(null != myList?myList.size():0);
    }public void notifyData(ArrayList<MyListData> myList) {
        Log.d("notifyData ", myList.size() + "");
        this.myList = myList;
        notifyDataSetChanged();
    }
    public class RecyclerItemViewHolder extends RecyclerView.ViewHolder {
       // private final TextView etTitleTextView;
        private final TextView etDescriptionTextView,you,gift;
        private FrameLayout mainLayout;
        public ConstraintLayout c;
        LinearLayout linearLayout,linearLayoutmain;
        public ImageView icon;
        public CardView cardViewfor,cardViewgif,card;
        public RecyclerItemViewHolder(final View parent) {
            super(parent);
           // etTitleTextView = (TextView) parent.findViewById(R.id.txtTitle);
//c=(ConstraintLayout)parent.findViewById(R.id.constraint);
           etDescriptionTextView = (TextView)parent.findViewById(R.id.txtDescription);
           you = (TextView)parent.findViewById(R.id.you);
           gift= (TextView)parent.findViewById(R.id.gift);
           icon = (ImageView) parent.findViewById(R.id.imageButton);
            cardViewgif=(CardView) parent.findViewById(R.id.forgift);
            cardViewfor=(CardView) parent.findViewById(R.id.foryou);
            linearLayout=(LinearLayout)parent.findViewById(R.id.option);
            card=(CardView)parent.findViewById(R.id.card_view);
        }
    }
}