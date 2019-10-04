package com.sematecjavaproject.recyclerviewwithjava_pro;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {

    ArrayList<InfoModel> infoModelArrayList;
    ClickInterface clickInterface;

    RecyclerAdapter(ArrayList<InfoModel> infoModelArrayList, ClickInterface clickInterface) {

        this.infoModelArrayList = infoModelArrayList;
        this.clickInterface = clickInterface;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item, parent, false);
        return new RecyclerViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {

        holder.onBind(infoModelArrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return infoModelArrayList.size();
    }

    class RecyclerViewHolder extends RecyclerView.ViewHolder {

        TextView textView;
        View v;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.txt);
            v = itemView;
        }

        void onBind(final InfoModel infoModel){

            textView.setText(infoModel.getName());

            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clickInterface.onRecyclerViewItemClicked(infoModel.getFamily(),infoModel.getAge());
                }
            });
        }
    }
}
