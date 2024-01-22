package com.example.firebasedemoapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.firebasedemoapp.databinding.ItemsCardBinding;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.myViewHolder> {

    Context context;
    ArrayList<Users> usersArrayList;

    public MyAdapter(Context context, ArrayList<Users> usersArrayList) {
        this.context = context;
        this.usersArrayList = usersArrayList;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemsCardBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()) , R.layout.items_card , parent , false);
        return new myViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        Users Curruser = usersArrayList.get(position);
        holder.binding.setUser(Curruser);
    }

    @Override
    public int getItemCount() {
        return usersArrayList.size();
    }


    public class myViewHolder extends RecyclerView.ViewHolder{
        ItemsCardBinding binding;

        public myViewHolder(ItemsCardBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
            binding.getRoot().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                }
            });
        }
    }
}
