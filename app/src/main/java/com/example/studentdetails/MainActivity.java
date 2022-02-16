package com.example.studentdetails;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new StudentListFragment();
    }
}