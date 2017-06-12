package com.example.larsnik2.yellowribbonapp;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void sendHistory(View view) {
        // sends the user to the history screen
        Intent intent = new Intent(this, YellowRibbonHistory.class);
        startActivity(intent);
    }

    public void callHotline(View view) {

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            Intent intent = new Intent(Intent. ACTION_DIAL);
            String number = "tel:8002738255";
            intent.setData(Uri.parse(number));
            startActivity(intent);
            return;
        }

    }

    public void textHotline(View view) {

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS) != PackageManager.PERMISSION_GRANTED) {

            Intent smsIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:741741"));
            smsIntent.putExtra("sms_body", "HOME");
            startActivity(smsIntent);
            return;
        }

    }

    public void sendCards(View view) {
        // sends the user to the ribbon cards screen
        Intent intent = new Intent(this, HelpCards.class);
        startActivity(intent);
    }

    public void sendShareStory(View view) {
        // sends the user to the share story screen
        Intent intent = new Intent(this, ShareStory.class);
        startActivity(intent);
    }


    public void sendShop (View view) {
        String url = "https://yellowribbon.org/get-involved/shop.html";
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    public void sendDonate (View view) {
        String url1 = "https://yellowribbon.org/get-involved/donate.html";
        Uri uriUrl = Uri.parse(url1);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    public void sendStartYR (View view) {
        String url2 = "https://yellowribbon.org/get-involved/start-a-yr-program-in-your-area.html";
        Uri uriUrl = Uri.parse(url2);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    public void sendConnect(View view) {
        // sends the user to the share story screen
        Intent intent = new Intent(this, ConnectWithUs.class);
        startActivity(intent);
    }

}
