package com.example.studentdetails;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.studentdetails.Adapter.FragmentsAdapter;
import com.example.studentdetails.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        binding.viewPager.setAdapter(new FragmentsAdapter(getSupportFragmentManager()));
        binding.tabLayout.setupWithViewPager(binding.viewPager);

        }
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu){
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.top_nav_menu, menu);
//
//        return super.onCreateOptionsMenu(menu);
//    }

//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item){
//        switch (item.getItemId()){
//            case R.id.settings:
//
//        }
//
//        return super.onOptionsItemSelected((item));
//    }
}