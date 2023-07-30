package com.miniproj.WomensCompanion.ui.breathing;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.miniproj.WomensCompanion.R;

public class BreathingVideoActivity extends AppCompatActivity {

    VideoView vid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breathing_video);

        vid = findViewById(R.id.vid);
        vid.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.breathingex);
        MediaController med= new MediaController(this);
        vid.setMediaController(med);
        med.setAnchorView(vid);
    }
}