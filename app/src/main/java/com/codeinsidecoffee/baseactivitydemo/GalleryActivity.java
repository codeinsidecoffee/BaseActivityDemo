package com.codeinsidecoffee.baseactivitydemo;

import android.os.Bundle;
import android.view.View;

public class GalleryActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View rootView = getLayoutInflater().inflate(R.layout.activity_gallery, frameLayout);
        txt_menuTitle.setText("Gallery Activity");
    }
}
