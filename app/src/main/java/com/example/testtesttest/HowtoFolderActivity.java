package com.example.testtesttest;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
@RequiresApi(api = Build.VERSION_CODES.M)

public class HowtoFolderActivity extends HowtouseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.howtofolder);  // layout xml 과 자바파일을 연결
    } // end onCreate()

} // end MyTwo
