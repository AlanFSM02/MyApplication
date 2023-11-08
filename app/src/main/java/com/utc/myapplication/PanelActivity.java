package com.utc.myapplication;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PanelActivity extends AppCompatActivity {
    private ImageView imgUp, imgDown, imgRight, imgLeft, imgStop, imgConnect, imgLight;
    final static String UP="F";
    final static String DOWN="B";
    final static String LEFT="L";
    final static String RIGHT="R";
    final static String AUTOMATIC="A";
    final static String STOP="S";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panel);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        inicializarControles();

    }

    private void inicializarControles() {
        imgUp = findViewById(R.id.img_up);
        imgDown = findViewById(R.id.img_down);
        imgRight = findViewById(R.id.img_right);
        imgLeft = findViewById(R.id.img_left);
        imgStop = findViewById(R.id.img_stop);
        imgConnect = findViewById(R.id.img_connect);
        imgLight = findViewById(R.id.img_light);
        imgUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PanelActivity.this, "Boton UP", Toast.LENGTH_LONG).show();
            }
        });
        imgDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PanelActivity.this, "Boton DOWN", Toast.LENGTH_LONG).show();
            }
        });
        imgRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PanelActivity.this, "Boton RIGHT", Toast.LENGTH_LONG).show();
            }
        });
        imgLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PanelActivity.this, "Boton LEFT", Toast.LENGTH_SHORT).show();
            }
        });
        imgStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PanelActivity.this, "Boton ALTO", Toast.LENGTH_SHORT).show();
            }
        });
        imgConnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(PanelActivity.this)
                        .setTitle(R.string.text_disconnect)
                        .setMessage(getString(R.string.text_disconnect_confirm))
                        .setPositiveButton(getString(R.string.text_yes_confirm),
                                new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        Toast.makeText(PanelActivity.this, "Boton Conectar", Toast.LENGTH_LONG).show();
                                    }
                                })
                        .setNegativeButton(getString(R.string.text_cancel), null)
                        .show();

            }
        });
        imgLight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PanelActivity.this, "Boton LUZ", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
