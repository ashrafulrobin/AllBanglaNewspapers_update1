package com.example.ashra.allbanglanewspapers;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private CardView firstCardView,secondCardView,thirdCardView,fourthCardView,fifthCardView,sixthCardView,seventhCardView,eighthCardView;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//// connection code

        if(!isConnected(MainActivity.this)) buildDialog(MainActivity.this).show();
        else {
            // Intent intent = new Intent(InternetConnection.this,MainActivity.class);
            // startActivity(intent);
        }


        ////end of connection code

        firstCardView = findViewById(R.id.firstCardViewId);
        secondCardView = findViewById(R.id.secondCardViewId);
        thirdCardView = findViewById(R.id.thirdCardViewId);
        fourthCardView = findViewById(R.id.fourthCardViewId);
        fifthCardView = findViewById(R.id.fifthCardViewId);
        sixthCardView = findViewById(R.id.sixthCardViewId);
        seventhCardView = findViewById(R.id.seventhCardViewId);
        eighthCardView = findViewById(R.id.eighthCardViewId);


        firstCardView.setOnClickListener(this);
        secondCardView.setOnClickListener(this);
        thirdCardView.setOnClickListener(this);
        fourthCardView.setOnClickListener(this);
        fifthCardView.setOnClickListener(this);
        sixthCardView.setOnClickListener(this);
        seventhCardView.setOnClickListener(this);
        eighthCardView.setOnClickListener(this);

    }


    ///connecttion code start



    public boolean isConnected(Context context) {
        this.context = context;

        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netinfo = cm.getActiveNetworkInfo();

        if (netinfo != null && netinfo.isConnectedOrConnecting()) {
            android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
            android.net.NetworkInfo mobile = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);

            if((mobile != null && mobile.isConnectedOrConnecting()) || (wifi != null && wifi.isConnectedOrConnecting())) return true;
            else return false;
        } else
            return false;
    }

    //2nd method

    public AlertDialog.Builder buildDialog(Context c) {

        AlertDialog.Builder builder = new AlertDialog.Builder(c);
        builder.setTitle("No Internet Connection");
        builder.setMessage("You need to have Mobile Data or wifi to access this. Press ok to Exit");

        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {

                finish();

            }
        });

        return builder;

    }

    ///end of code (internet connection )
    @Override
    public void onClick(View view) {

       if(view.getId()==R.id.firstCardViewId){

           Intent intent = new Intent(MainActivity.this,firstActivity.class);
           startActivity(intent);
       }
        else if(view.getId()==R.id.secondCardViewId){

Intent intent = new Intent(MainActivity.this,secondActivity.class);
startActivity(intent);

        }

        if (view.getId()==R.id.thirdCardViewId){
            Intent intent = new Intent(MainActivity.this,thirdActivity.class);
            startActivity(intent);
        }

        else if (view.getId()==R.id.fourthCardViewId){

            Intent intent = new Intent(MainActivity.this,fourthActivity.class);
            startActivity(intent);
        }

        if(view.getId()==R.id.fifthCardViewId){

            Intent intent = new Intent(MainActivity.this,fifthActivity.class);
            startActivity(intent);
        }

        else if (view.getId()==R.id.sixthCardViewId){

            Intent intent = new Intent(MainActivity.this,sixthActivity.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.sixthCardViewId){
            Intent intent = new Intent(MainActivity.this,seventhActivity.class);
            startActivity(intent);
        }

        else if (view.getId()==R.id.eighthCardViewId){

            Intent intent = new Intent(MainActivity.this,eighthActivity.class);
            startActivity(intent);
        }

    }
}
