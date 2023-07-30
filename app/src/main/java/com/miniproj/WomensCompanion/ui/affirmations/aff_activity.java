package com.miniproj.WomensCompanion.ui.affirmations;

import android.os.Bundle;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.miniproj.WomensCompanion.R;
import com.miniproj.WomensCompanion.ui.home.MainActivity;

public class aff_activity extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout contentFrameLayout = findViewById(R.id.frag_container);
        getLayoutInflater().inflate(R.layout.activity_affirmations, contentFrameLayout);
    }

}
