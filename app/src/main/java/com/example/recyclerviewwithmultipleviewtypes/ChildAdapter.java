package com.example.recyclerviewwithmultipleviewtypes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ChildAdapter extends RecyclerView.Adapter<ChildAdapter.ViewHolder> {

    ArrayList<ChildModal> childModalArrayList;
    Context context;

    public ChildAdapter(ArrayList<ChildModal> childModalArrayList, Context context) {
        this.childModalArrayList = childModalArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.child_rv_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        ChildModal childmodal =childModalArrayList.get(position);

        holder.img.setImageResource(childmodal.getImage());
        holder.txt.setText(childmodal.getText());
    }

    @Override
    public int getItemCount() {
        return childModalArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView txt;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.child_img);
            txt = itemView.findViewById(R.id.child_txt);
        }
    }
}
