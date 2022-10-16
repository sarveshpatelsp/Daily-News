package com.akkupatel.dailynewsapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.appcompat.app.AlertDialog;

public class NetworkBroadcast extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if(!isNetworkConnected(context))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            View layout_dialog = LayoutInflater.from(context).inflate(R.layout.no_internet_connection , null);
            builder.setView(layout_dialog);

            Button buttonTryAgain = layout_dialog.findViewById(R.id.tryAgainButton);

            AlertDialog dialog = builder.create();
            dialog.show();
            dialog.setCancelable(false);

            buttonTryAgain.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(isNetworkConnected(context))
                        dialog.dismiss();
                }
            });

        }
    }
    private boolean isNetworkConnected(Context context)
    {
        try{
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
            return networkInfo!=null && networkInfo.isConnected();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
}
