package com.lambdaschool.congressdetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.lambdaschool.congressdataapiaccess.CongressDao;
import com.lambdaschool.congressdataapiaccess.CongresspersonOverview;

import java.util.ArrayList;


public class ListActivity extends AppCompatActivity {

    private ArrayList<CongresspersonOverview> congresspersonOverviews;
   
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        
        //congressPersonOverviewRepo = new CongressPersonOverviewRepo();
        
    }
}
