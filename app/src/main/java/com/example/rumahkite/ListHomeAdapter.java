package com.example.rumahkite;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ListHomeAdapter extends RecyclerView.Adapter<ListHomeAdapter.ListViewHolder> {
    private ArrayList<Home> listHome;
    private OnItemClickCallBack onItemClickCallBack;


    public void setOnItemClickCallBack(OnItemClickCallBack onItemClickCallBack) {
        this.onItemClickCallBack = onItemClickCallBack;
    }


    public ListHomeAdapter(ArrayList<Home> list) {
        this.listHome = list;
    }


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_home, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Home home = listHome.get(position);
        Glide.with(holder.itemView.getContext())
                .load(home.getFoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgHome);
        holder.tvType.setText(home.getType_home());
        holder.tvPrice.setText(home.getHarga());
//        holder.tvDesc.setText(home.getDeskripsi());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallBack.onItemClicked(listHome.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listHome.size();
    }

     class ListViewHolder extends RecyclerView.ViewHolder {
            ImageView imgHome;
            TextView tvType, tvPrice, tvDesc;

            ListViewHolder(View itemView) {
                super(itemView);
                imgHome = itemView.findViewById(R.id.img_item_photo);
                tvType = itemView.findViewById(R.id.type);
                tvPrice = itemView.findViewById(R.id.tv_harga);
            }
    }


    public interface OnItemClickCallBack {
        void onItemClicked(Home data);
    }
}
