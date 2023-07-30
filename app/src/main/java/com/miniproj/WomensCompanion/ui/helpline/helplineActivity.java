package com.miniproj.WomensCompanion.ui.helpline;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.view.View;
import android.widget.FrameLayout;
import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.miniproj.WomensCompanion.R;
import com.miniproj.WomensCompanion.ui.home.MainActivity;

import android.os.Bundle;

public class helplineActivity extends MainActivity {

    private static final int REQUEST_CALL = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout contentFrameLayout = findViewById(R.id.frag_container);
        getLayoutInflater().inflate(R.layout.activity_helpline, contentFrameLayout);

        findViewById(R.id.kidsHelpCall).setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                call("tel:7506308932");
            }
        });

        findViewById(R.id.kidsHelpVisit).setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                visit("https://prafultaandheri.org/");
            }
        });



        findViewById(R.id.safeHavenCall).setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                call("tel:1091");
            }
        });

        findViewById(R.id.safeHavenVisit).setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                visit("https://www.womensweb.in/");
            }
        });



        findViewById(R.id.transLifelineCall).setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                call("tel:7827170170");
            }
        });

        findViewById(R.id.transLifelineVisit).setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                visit("http://www.ncw.nic.in/helplines");
            }
        });



        findViewById(R.id.chimoHelpCall).setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                call("tel:011-24372437");
            }
        });

        findViewById(R.id.chimoHelpVisit).setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                visit("https://shaktishalini.org/");
            }
        });



        findViewById(R.id.someOtherCall).setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                call("tel:(020) 2565 8600");
            }
        });

        findViewById(R.id.someOtherVisit).setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                visit("https://www.swadharpune.org/index.php");
            }
        });



//        findViewById(R.id.cmhaCall).setOnClickListener(new View.OnClickListener() {
//            public void onClick(View arg0) {
//                call("tel:1-888-811-2222");
//            }
//        });
//
//        findViewById(R.id.cmhaVisit).setOnClickListener(new View.OnClickListener() {
//            public void onClick(View arg0) {
//                visit("https://cmhapeeldufferin.ca");
//            }
//        });
//
//
//
//        findViewById(R.id.crisisServicesCall).setOnClickListener(new View.OnClickListener() {
//            public void onClick(View arg0) {
//                call("tel:1-833-456-4566");
//            }
//        });
//
//        findViewById(R.id.crisisServicesVisit).setOnClickListener(new View.OnClickListener() {
//            public void onClick(View arg0) {
//                visit("https://www.crisisservicescanada.ca/");
//            }
//        });
//
//
//
//        findViewById(R.id.hopeForWellnessCall).setOnClickListener(new View.OnClickListener() {
//            public void onClick(View arg0) {
//                call("tel:1-855-242-3310");
//            }
//        });
//
//        findViewById(R.id.hopeForWellnessVisit).setOnClickListener(new View.OnClickListener() {
//            public void onClick(View arg0) {
//                visit("https://www.hopeforwellness.ca");
//            }
//        });
//
//
//
//        findViewById(R.id.nedicCall).setOnClickListener(new View.OnClickListener() {
//            public void onClick(View arg0) {
//                call("tel:1-866-633-4220");
//            }
//        });
//
//        findViewById(R.id.nedicVisit).setOnClickListener(new View.OnClickListener() {
//            public void onClick(View arg0) {
//                visit("https://nedic.ca");
//            }
//        });
//
//
//
//        findViewById(R.id.drugRehabCall).setOnClickListener(new View.OnClickListener() {
//            public void onClick(View arg0) {
//                call("tel:1-877-746-1963");
//            }
//        });
//
//        findViewById(R.id.drugRehabVisit).setOnClickListener(new View.OnClickListener() {
//            public void onClick(View arg0) {
//                visit("http://www.canadadrugrehab.ca");
//            }
//        });
    }





    public void call(String phone) {
        if (ContextCompat.checkSelfPermission(helplineActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(helplineActivity.this, new String[] {Manifest.permission.CALL_PHONE}, REQUEST_CALL);
        }

        else {
            Intent callIntent = new Intent(Intent.ACTION_CALL);
            callIntent.setData(Uri.parse(phone));
            startActivity(callIntent);
        }
    }

    public void visit(String website) {

        Intent viewIntent = new Intent(Intent.ACTION_VIEW);
        viewIntent.setData(Uri.parse(website));
        startActivity(viewIntent);
    }
}
