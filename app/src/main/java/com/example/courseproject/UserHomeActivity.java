package com.example.courseproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class UserHomeActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    ViewPager2 viewPager;
    UserFragmentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_home);

        bottomNavigationView = findViewById(R.id.bottom_navigation_userToolBar);
        viewPager = findViewById(R.id.viewPager_user);
        adapter = new UserFragmentAdapter(getSupportFragmentManager(), getLifecycle());

        viewPager.setAdapter(adapter);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Menu menu = bottomNavigationView.getMenu();
                for (int pos = 0; pos < menu.size(); pos ++)
                    if (menu.getItem(pos).equals(item)){
                        viewPager.setCurrentItem(pos);
                        break;
                    }
                return false;
            }
        });




    }
}