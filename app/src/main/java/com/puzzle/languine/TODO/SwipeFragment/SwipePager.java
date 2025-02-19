package com.puzzle.languine.TODO.SwipeFragment;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.puzzle.languine.R;
import com.puzzle.languine.ui.fragment.TextQuestionFragment;

public class SwipePager extends FragmentActivity{
    ViewPager viewPager;
    SwipeViewAdapter swipeViewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe_pager);
        viewPager = (ViewPager) findViewById(R.id.pager);
        swipeViewAdapter = new SwipeViewAdapter(getSupportFragmentManager());
        swipeViewAdapter.addFragment(new TextQuestionFragment());
        swipeViewAdapter.addFragment(new TextQuestionFragment());
        swipeViewAdapter.addFragment(new TextQuestionFragment());
        swipeViewAdapter.notifyDataSetChanged();
        viewPager.setAdapter(swipeViewAdapter);

    }
}
