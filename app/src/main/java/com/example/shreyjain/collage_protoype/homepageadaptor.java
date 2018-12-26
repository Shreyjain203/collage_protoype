package com.example.shreyjain.collage_protoype;

//https://www.youtube.com/watch?v=IGGT_jfZQrA


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class homepageadaptor extends RecyclerView.Adapter<homepageadaptor.homepageviewholder> {

    private String[] data;
    public homepageadaptor(String[] data)
    {
        this.data = data;
    }

    @NonNull
    @Override
    public homepageviewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull homepageviewholder homepageviewholder, int i) {

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class homepageviewholder extends RecyclerView.ViewHolder{


        public homepageviewholder(@NonNull View itemView) {
            super(itemView);
        }
    }

}
