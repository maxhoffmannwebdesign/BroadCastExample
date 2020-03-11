package com.example.broadcastexample;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import static android.content.ContentValues.TAG;

public class MyBroadCastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.MAIN")) {
            Intent serviceIntent = new Intent(context, MyService.class);
            context.startService(serviceIntent);
        } else {
            Toast.makeText(context.getApplicationContext(), "Alarm Manager just ran", Toast.LENGTH_LONG).show();
        }
        if (intent != null) {
            if(intent.getAction() != null){
                Log.i(TAG, "Intent: " + intent.getAction());
            }else{
                Log.i(TAG, "Intent: !null, Action: null");
            }
        }else{
            Log.i(TAG, "Intent: null");
        }
    }
}