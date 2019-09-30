package com.vigneshpranav.asporientation;

import android.app.Notification;
import android.os.Build;
import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    public MyFirebaseMessagingService() {
    }

    @Override
    public void onNewToken(String token) {
        Log.d("Tag", "Refreshed token: " + token);
    }

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        // ...

        // TODO(developer): Handle FCM messages here.
        // Not getting messages here? See why this may be: https://goo.gl/39bRNJ
        Log.d("Tag", "From: " + remoteMessage.getFrom());
        showNotification(remoteMessage.getNotification().getTitle(), remoteMessage.getNotification().getBody());

        // Check if message contains a data payload.
        if (remoteMessage.getData().size() > 0) {
            Log.d("Tag", "Message data payload: " + remoteMessage.getData());

            if (/* Check if data needs to be processed by long running job */ true) {
                // For long-running tasks (10 seconds or more) use Firebase Job Dispatcher.
//                scheduleJob();
            } else {
                // Handle message within 10 seconds
//                handleNow();
            }

        }

        // Check if message contains a notification payload.
        if (remoteMessage.getNotification() != null) {
            Log.d("Tag", "Message Notification Body: " + remoteMessage.getNotification().getBody());
        }

        // Also if you intend on generating your own notifications as a result of a received FCM
        // message, here is where that should be initiated. See sendNotification method below.
    }

    public void showNotification(String title, String message) {

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "MyNotification");

        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            builder.setSmallIcon(R.drawable.notifi_icon);
            builder.setColor(getResources().getColor(R.color.ic_launcher_background));
        } else {
            builder.setSmallIcon(R.drawable.notification_icon);
        }
        builder.setContentTitle(title);
        builder.setContentText(message);
        NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(this);
        notificationManagerCompat.notify(909,builder.build());


//        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "MyNotification")
//                .setContentTitle(title)
//                .setSmallIcon(R.drawable.notification_icon)
//                .setAutoCancel(true)
//                .setContentText(message);
//        NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(this);
//        notificationManagerCompat.notify(909,builder.build());



    }
}
