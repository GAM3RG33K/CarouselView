package com.example.carouselview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPagerCarouselView viewPagerCarouselView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        long carouselSlideInterval = 3000; // 3 SECONDS
        int [] imageResourceIds = {
                R.drawable.car1,
                R.drawable.car2,
                R.drawable.car3,
                R.drawable.car4,
                R.drawable.car5,
                R.drawable.car6};

        viewPagerCarouselView = (ViewPagerCarouselView) findViewById(R.id.carousel_view);
        viewPagerCarouselView.setData(getSupportFragmentManager(), imageResourceIds, carouselSlideInterval);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        viewPagerCarouselView.onDestroy();
    }
}
