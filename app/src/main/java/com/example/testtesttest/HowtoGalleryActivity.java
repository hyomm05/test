package com.example.testtesttest;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
@RequiresApi(api = Build.VERSION_CODES.M)

public class HowtoGalleryActivity extends HowtouseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.how_to_gallery);  // layout xml 과 자바파일을 연결
    } // end onCreate()
} // end MyTwo
