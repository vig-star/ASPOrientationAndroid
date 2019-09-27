package com.vigneshpranav.asporientation;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.util.Log;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;



public class MyInstanceIDListenerService extends FirebaseMessagingService {

    public static final String TAG = "MsgFirebaseServ";
    public static final String CHANNEL_ID = "MsgFirebaseChan";

    @Override
    public void onNewToken(String token) {
        Log.d(TAG, "Refreshed token: " + token);
    }

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        /*Log.d(TAG, "From: " + remoteMessage.getFrom());

        if (remoteMessage.getData().size() > 0) {
            Log.d(TAG, "Message data payload: "+remoteMessage.getData());
        }

        if (remoteMessage.getNotification() != null) {
            Log.d(TAG, "Message Notification Body: " + remoteMessage.getData().getBody());
            Log.d(TAG, "Message Notification Title: " + remoteMessage.getData().getTitle());

            createNotificationChannel();

            NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this, CHANNEL_ID)
                    .setSmallIcon(R.drawable.ic_launcher_foreground)
                    .setContentTitle(remoteMessage.getNotification().getTitle())
                    .setContentText(remoteMessage.getNotification().getBody())
                    .setPriority(NotificationCompat.PRIORITY_DEFAULT);

            NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);

            // notificationId is a unique int for each notification that you must define
            notificationManager.notify(NotificationID.getID(), mBuilder.build());

        }
         */

        super.onMessageReceived(remoteMessage);
        Notification notification = new NotificationCompat.Builder(this)
                .setContentTitle(remoteMessage.getData().get("title"))
                .setContentText(remoteMessage.getData().get("body"))
                .setSmallIcon(R.mipmap.ic_launcher)
                .build();
        NotificationManagerCompat manager = NotificationManagerCompat.from(getApplicationContext());
        manager.notify(NotificationID.getID(), notification);


    }

    private void createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            //using same string for both channelId and name. Ideally use different strings
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, CHANNEL_ID, importance);
            // Register the channel with the system; you can't change the importance or other notification behaviors after this
            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
    }




}

