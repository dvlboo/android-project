package com.example.scoresetaplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RvAdapter extends RecyclerView.Adapter<RvAdapter.ViewHolder> {

    private ArrayList<ItemModel> dataItem;
    private Context context;

    @NonNull
    @Override
    public RvAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_score, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RvAdapter.ViewHolder holder, int position) {

        ImageView ivImage = holder.ivImage;
        TextView txtJudul = holder.txtJudul;
        TextView txtDesc = holder.txtDesc;

        ivImage.setImageResource(dataItem.get(position).getImage());
        txtJudul.setText(dataItem.get(position).getTitle());
        txtDesc.setText(dataItem.get(position).getDesc());

        holder.parentLayout.setOnClickListener(view -> {
            Toast.makeText(context,"Anda memilih" + dataItem.get(position).getTitle() , Toast.LENGTH_SHORT).show();
        });

    }

    @Override
    public int getItemCount() {
        return dataItem.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView ivImage;
        TextView txtJudul, txtDesc;
        LinearLayoutCompat parentLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ivImage = itemView.findViewById(R.id.iv_BgSport);
            txtJudul = itemView.findViewById(R.id.tv_Title);
            txtDesc = itemView.findViewById(R.id.tv_Description);
            parentLayout = itemView.findViewById(R.id.parentLayout);

        }
    }

    RvAdapter(Context context, ArrayList<ItemModel> dataItem) {
        this.context = context;
        this.dataItem = dataItem;
    }
}
