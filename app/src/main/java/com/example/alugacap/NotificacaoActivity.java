package com.example.alugacap;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.alugacap.databinding.ActivityNotificacaoBinding;

public class NotificacaoActivity extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_notificacao);

            TextView texto = (TextView) findViewById(R.id.txtMsg);

            String mensagem = getIntent().getStringExtra("Mensagem");
            texto.setText(mensagem);
        }
    }

