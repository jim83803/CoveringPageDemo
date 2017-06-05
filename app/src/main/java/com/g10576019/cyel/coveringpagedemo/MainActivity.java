package com.g10576019.cyel.coveringpagedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.g10576019.cyel.coveringpagedemo.tools.CoveringPage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new CoveringPage(this).start(R.layout.view_page_covering);
    }
}
