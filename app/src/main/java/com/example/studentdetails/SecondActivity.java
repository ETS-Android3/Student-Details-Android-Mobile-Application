package com.example.studentdetails;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;

public class SecondActivity extends SingleFragmentActivity {

    public static final String LIST_ID = "com.example.studentdetails.list_id";

    public static Intent newIntent(Context context, int listID ){
        Intent intent = new Intent(context, SecondActivity.class);
        intent.putExtra(LIST_ID, listID);
        return intent;
    }

    public Fragment createFragment(){
        int listID = (int)getIntent().getSerializableExtra(LIST_ID);
        return StudentDetailsFragment.newInstance(listID);
    }
}
