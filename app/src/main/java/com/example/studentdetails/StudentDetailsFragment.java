package com.example.studentdetails;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class StudentDetailsFragment extends Fragment {
    private EditText name, email, dept;
    private TextView roll;
    StudentItem studentItem;
    private static final String LIST_ID_1 = "list_id";

    public static StudentDetailsFragment newInstance(int listid){
        Bundle bundle = new Bundle();
        bundle.putSerializable(LIST_ID_1, listid);

        StudentDetailsFragment fragment = new StudentDetailsFragment();
        fragment.setArguments(bundle);
        return fragment;

    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //int listid = (int)getActivity().getIntent().getSerializableExtra(SecondActivity.LIST_ID);
        int listid = (int)getArguments().getSerializable(LIST_ID_1);
        studentItem = Student.get(getActivity()).getsingle(listid);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.detailfragment, container, false);
        name = (EditText) v.findViewById(R.id.name1);
        name.setText(studentItem.getName());
        name.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                studentItem.setName(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        email = (EditText) v.findViewById(R.id.email1);
        email.setText(studentItem.getEmail());
        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                studentItem.setEmail(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        dept = (EditText) v.findViewById(R.id.dept1);
        dept.setText(studentItem.getDepartment());
        dept.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                studentItem.setDepartment(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        roll = (TextView) v.findViewById(R.id.rollnop);
        roll.setText(studentItem.getRoll());

        return v;
    }
}
