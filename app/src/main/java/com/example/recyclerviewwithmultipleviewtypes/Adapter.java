package com.example.recyclerviewwithmultipleviewtypes;

import static com.example.recyclerviewwithmultipleviewtypes.ModalClass.LAYOUT_ONE;
import static com.example.recyclerviewwithmultipleviewtypes.ModalClass.LAYOUT_THREE;
import static com.example.recyclerviewwithmultipleviewtypes.ModalClass.LAYOUT_TWO;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter {

    ArrayList<ModalClass> listItems;
    Context context;

    public Adapter(ArrayList<ModalClass> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @Override
    public int getItemViewType(int position) {
        switch (listItems.get(position).getViewType()) {

            case 1:
                return LAYOUT_ONE;


            case 2:
                return LAYOUT_TWO;


            case 3:
                return LAYOUT_THREE;


            default:
                return -1;


        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        switch (viewType) {

            case LAYOUT_ONE:
                View layout_one = LayoutInflater.from(context).inflate(R.layout.banner, parent, false);
                return new BannerViewHolder(layout_one);


            case LAYOUT_TWO:
                View layout_two = LayoutInflater.from(context).inflate(R.layout.search, parent, false);
                return new SearchViewHolder(layout_two);


            case LAYOUT_THREE:
                View layout_three = LayoutInflater.from(context).inflate(R.layout.discover, parent, false);
                return new DiscoverViewHolder(layout_three);

            default:
                return null;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        switch (listItems.get(position).getViewType()) {

            case LAYOUT_ONE:
                ModalClass model1 = listItems.get(position);
                ((BannerViewHolder)holder).imageView.setImageResource(model1.getImageview());
                break;

//            case LAYOUT_TWO:
//                ModalClass model2 = listItems.get(position);
//                break;

            case LAYOUT_THREE:
                ModalClass model3 = listItems.get(position);
                ((DiscoverViewHolder)holder).imageView.setImageResource(model3.getImageview());
                ((DiscoverViewHolder)holder).textView.setText(model3.getTextview());
                break;


        }


    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    class BannerViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        public BannerViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imgtop);
        }

    }

    class SearchViewHolder extends  RecyclerView.ViewHolder{

        public SearchViewHolder(@NonNull View itemView) {
            super(itemView);

        }
    }

    class DiscoverViewHolder extends RecyclerView.ViewHolder {

        TextView textView;
        ImageView imageView;
        public DiscoverViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.discover_txt);
            imageView = itemView.findViewById(R.id.discover_img);
        }
    }
}
