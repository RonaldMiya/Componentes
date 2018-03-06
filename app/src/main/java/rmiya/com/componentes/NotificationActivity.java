package rmiya.com.componentes;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NotificationActivity extends AppCompatActivity {

    Button noti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
//        noti = (Button) findViewById(R.id.noti);
//
//        noti.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                NotificationCompat.Builder builder = new NotificationCompat.Builder (this);
//                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http//www.tecsup.edu.pe"));
//                PendingIntent pendingIntent = PendingIntent.getActivity(NotificationActivity.this, 01, intent, 0);
//                builder.setContentIntent(pendingIntent);
//                builder.setDefaults(Notification.DEFAULT_ALL);
//                builder.setContentTitle("NOTIFICATION IS HERE!");
//                builder.setSmallIcon(R.mipmap.ic_launcher);
//                builder.setContentText("Notificacion 1");
//                NotificationManager notificationManager = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
//                notificationManager.notify(001, builder.build());
//            }
//        });

    }

}
