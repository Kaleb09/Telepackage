package com.kaleb.Telepackage;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerItemViewHolder> {
    private ArrayList<MyListData> myList; customdialog cd;
    int mLastPosition = 0; private ClickListner mListner;
    public RecyclerAdapter(ArrayList<MyListData> myList,ClickListner listner) {
        this.myList = myList;
        mListner=listner;
    }
    public RecyclerItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
        RecyclerItemViewHolder holder = new RecyclerItemViewHolder(view);
        return holder;
    }
    @Override
    public void onBindViewHolder(final RecyclerItemViewHolder holder, final int position) {
        Log.d("onBindViewHoler ", myList.size() + "");
       // holder.etTitleTextView.setText(myList.get(position).getTitle());
        if(position!=myList.size()-1){
            holder.c.setVisibility(View.GONE);}
        holder.etDescriptionTextView.setText(myList.get(position).getDescription());
        holder.linearLayout.setVisibility(View.GONE);
        holder.etDescriptionTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

           //  String d="1;1;1;1;1";
              /*  Context context=v.getContext();
                Intent intent = new Intent("kaleb1");
                intent.putExtra("datastep",myList.get(position).getStep());
               context.sendBroadcast(intent);*/
               // Toast.makeText(v.getContext(), "descriptin", Toast.LENGTH_SHORT).show();
              if( holder.linearLayout.getVisibility()==View.VISIBLE){
                holder.linearLayout.setVisibility(View.GONE);}
              else if(holder.linearLayout.getVisibility()==View.GONE){
                  holder.linearLayout.setVisibility(View.VISIBLE);
              }
            }
        });
        holder.cardViewfor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.data(myList.get(position).getStep());
                holder.linearLayout.setVisibility(View.GONE);
            }
        });
        holder.cardViewgif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.dialog(myList.get(position).getStepgift());
                holder.linearLayout.setVisibility(View.GONE);

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
        private final TextView etDescriptionTextView;
        private FrameLayout mainLayout;
        public ConstraintLayout c;
        LinearLayout linearLayout,linearLayoutmain;
        public ImageView icon;
        public CardView cardViewfor,cardViewgif;
        public RecyclerItemViewHolder(final View parent) {
            super(parent);
           // etTitleTextView = (TextView) parent.findViewById(R.id.txtTitle);
c=(ConstraintLayout)parent.findViewById(R.id.constraint);
            etDescriptionTextView = (TextView)parent.findViewById(R.id.txtDescription);
           icon = (ImageView) parent.findViewById(R.id.imageButton);
            cardViewgif=(CardView) parent.findViewById(R.id.forgift);
            cardViewfor=(CardView) parent.findViewById(R.id.foryou);
            linearLayout=(LinearLayout)parent.findViewById(R.id.option);
        }
    }
}