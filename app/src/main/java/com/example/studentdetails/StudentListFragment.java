package com.example.studentdetails;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Objects;

public class StudentListFragment extends Fragment{
    private RecyclerView mlistRecyclerView;
    View view;
    private DetailsAdapter adapter;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        view = inflater.inflate(R.layout.listfragment, container, false);
        mlistRecyclerView = (RecyclerView) view.findViewById(R.id.recview);
        mlistRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        updateUI();
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        updateUI();
    }

    private void updateUI(){
        Student student = Student.get(getActivity());
        ArrayList<StudentItem> items = student.getlist();

        if(adapter == null) {
            adapter = new DetailsAdapter(items);
            mlistRecyclerView.setAdapter(adapter);
        }
        else{
            Log.d("Run", "Chning");
            adapter.notifyDataSetChanged();
        }
    }

    private class DetailsAdapter extends RecyclerView.Adapter<DetailsAdapter.Detailsviewholder>{

        private ArrayList<StudentItem> studentholder;

        public DetailsAdapter(ArrayList<StudentItem> studentholder){
            this.studentholder = studentholder;
        }
        @NonNull
        @Override
        public Detailsviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.singledetail, parent, false);
            return new Detailsviewholder(view);
        }


        @Override
        public void onBindViewHolder(@NonNull Detailsviewholder holder, int position) {
            holder.name.setText(studentholder.get(position).getName());
            holder.roll.setText(studentholder.get(position).getRoll());
            StudentItem item = studentholder.get(position);
            holder.bind(item);
        }

        @Override
        public int getItemCount() {
            return studentholder.size();
        }

        private class Detailsviewholder extends RecyclerView.ViewHolder implements View.OnClickListener{

            private StudentItem mitem;
            TextView name, roll;
            public Detailsviewholder(@NonNull View itemView) {
                super(itemView);
                name = itemView.findViewById(R.id.name);
                roll = itemView.findViewById(R.id.rollno);
                roll.setOnClickListener(this);

            }

            public void bind(StudentItem item){
                mitem = item;
            }
            @Override
            public void onClick(View v) {
                Intent i = SecondActivity.newIntent(getActivity(), mitem.getId());
                startActivity(i);
            }
        }

    }

}
