package com.miniproj.WomensCompanion.ui.depression;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.content.Intent;

import com.miniproj.WomensCompanion.R;
import com.miniproj.WomensCompanion.ui.home.MainActivity;

public class depressionResultActivity extends MainActivity {

    private TextView mResult;
    private Button mRetry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout contentFrameLayout = findViewById(R.id.frag_container);
        getLayoutInflater().inflate(R.layout.activity_depression_result, contentFrameLayout);

        mResult = (TextView) findViewById(R.id.results);
        mRetry = (Button) findViewById(R.id.redo);

        Bundle b = getIntent().getExtras();
        int points = b.getInt("points");

        if (points >= 0 && points <= 4){
            mResult.setText("The level of your PPD is None to Minimal");
        }
        if (points >= 5 && points <= 9){
            mResult.setText("The level of your PPD is Mild");
        }
        if (points >= 10 && points <= 14){
            mResult.setText("The level of your PPD is Moderate");
        }
        if (points >= 15 && points <= 19){
            mResult.setText("The level of your PPD is Moderately severe");
        }
        if (points >= 20 && points <= 27){
            mResult.setText("The level of your PPD is Severe");
        }

        mRetry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), depressionActivity.class);
                startActivity(i);
            }
        });
    }
}
