package com.umutakpinar.recyclerviewdemo;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.umutakpinar.recyclerviewdemo.databinding.RecylerRowBinding;

import java.util.ArrayList;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.PersonAdapterVH>  {

    public ArrayList<Person> personArrayList;

    public PersonAdapter(ArrayList<Person> _personArrayList) {
        this.personArrayList = _personArrayList;
    }

    @NonNull
    @Override
    public PersonAdapterVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecylerRowBinding recylerRowBinding = RecylerRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new PersonAdapterVH(recylerRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonAdapterVH holder, int position) {
        holder.binding.recyylerViewTextView.setText(personArrayList.get(position).name);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(),DetailsActivity.class);
                intent.putExtra("person",personArrayList.get(position));
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return personArrayList.size();
    }

    public class PersonAdapterVH extends RecyclerView.ViewHolder{

        private RecylerRowBinding binding;

        public PersonAdapterVH(RecylerRowBinding _binding) {
            super(_binding.getRoot());
            this.binding = _binding;
        }
    }
}
