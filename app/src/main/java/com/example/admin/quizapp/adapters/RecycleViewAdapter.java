package com.example.admin.quizapp.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.admin.quizapp.model.Intrebare;
import com.example.admin.quizapp.R;

import java.util.List;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.MyViewHolder>{

    private Context mContext;
    private List<Intrebare>mData;

    public RecycleViewAdapter(Context context, List<Intrebare> mData) {
        this.mContext = context;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {


        View view;
        LayoutInflater inflater = LayoutInflater.from(mContext);
        view =inflater.inflate(R.layout.intrebare_sablon_adapter,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder,final int position) {

        holder.enunt_intrebare_tv.setText(mData.get(position).getText());
        holder.rasp1_btn.setText(mData.get(position).getRaspuns1());
        holder.rasp2_btn.setText(mData.get(position).getRaspuns2());
        holder.rasp3_btn.setText(mData.get(position).getRaspuns3());
        holder.rasp4_btn.setText(mData.get(position).getRaspuns4());



    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView enunt_intrebare_tv;
        Button rasp1_btn;
        Button rasp2_btn;
        Button rasp3_btn;
        Button rasp4_btn;




      public MyViewHolder(@NonNull View itemView) {
          super(itemView);

          enunt_intrebare_tv=itemView.findViewById(R.id.question_text);
          rasp1_btn=itemView.findViewById(R.id.raspuns1_btn);
          rasp2_btn=itemView.findViewById(R.id.raspuns2_btn);
          rasp3_btn=itemView.findViewById(R.id.raspuns3_btn);
          rasp4_btn=itemView.findViewById(R.id.raspuns4_btn);



      }
  }


}
