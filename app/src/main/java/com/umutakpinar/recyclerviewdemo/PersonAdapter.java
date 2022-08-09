package com.umutakpinar.recyclerviewdemo;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.PersonAdapterVH>  {

    @NonNull
    @Override
    public PersonAdapterVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull PersonAdapterVH holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 4;
    }

    public class PersonAdapterVH extends RecyclerView.ViewHolder{

        public PersonAdapterVH(@NonNull View itemView) {
            super(itemView);
        }
    }
}
