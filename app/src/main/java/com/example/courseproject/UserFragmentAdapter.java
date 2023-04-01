package com.example.courseproject;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class UserFragmentAdapter extends FragmentStateAdapter {


    public UserFragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new UserHomeFragment();
            case 1:
                return new UserMenuFragment();
            case 2:
                return new UserOrderFragment();
            case 3:
                return new UserProfileFragment();
            default:
                return new UserHomeFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
