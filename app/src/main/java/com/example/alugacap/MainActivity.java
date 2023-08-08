package com.example.alugacap;

import static android.content.ClipData.newIntent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText msg = (EditText) findViewById(R.id.edtTexto);
        Button enviar = (Button) findViewById(R.id.btnEnviar);
        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);

                    PendingIntent pi = PendingIntent.getActivity(getApplicationContext(), 0,
                            intent, PendingIntent.FLAG_IMMUTABLE);
                    NotificationManagerCompat notificationManager = NotificationManagerCompat.from(getApplicationContext());
                    String NOTIFICATIONCHANELID = "my_chanel_id_01";
                    NotificationChannel nc = new NotificationChannel(NOTIFICATIONCHANELID, "my notification id", NotificationManager.IMPORTANCE_HIGH);

                    nc.setDescription("stoy louco");
                    nc.setLightColor(Color.RED);
                    nc.enableLights(true);
                    nc.setVibrationPattern(new long[]{0,1000,500,1000});
                    nc.enableVibration(true);
                    notificationManager.createNotificationChannel(nc);
                    NotificationCompat.Builder builder = new NotificationCompat.Builder(
                            getApplicationContext(), NOTIFICATIONCHANELID)
                            .setContentTitle("AlugaCap")
                            .setContentText("Bem-vindo ao APP")
                            .setSmallIcon(R.drawable.ic_launcher_background)
                            .setPriority(NotificationCompat.PRIORITY_HIGH)
                            .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                            .setContentIntent(pi)
                            .setAutoCancel(true);

                    notificationManager.notify(001,builder.build());



                }

            }

        });
    }

    private void newIntent(MainActivity mainActivity, Class<NotificacaoActivity> notificacaoActivityClass) {

    }

}


        //Object button = new Object();
       // Object button1 = button;

       // button.setOnClickListenner {
          //  openNextActivity();


    // private fun openNextActivity() {
       //     val intent = Intent (this, MainActivity2::class.java)
        //    startActivity(intent);


   // }

   // private void startActivity(val intent) {
    //}
//}