package com.example.administrador.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.MenuPopupWindow;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   // private menu menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView) findViewById(R.id.tv_nombre);
        tv.setText("Carlos Daniel Robles");
        TextView tv2 = (TextView) findViewById(R.id.tv_correo);
        tv2.setText("daniel0599@icloud.com");
        TextView tv3 = (TextView) findViewById(R.id.tv_telefono);
        tv3.setText("77981618");
        TextView tv4 = (TextView) findViewById(R.id.tv_fecha);

        tv4.setText("05/10/99");

        //ImageView img = (ImageView) findViewById(R.id.imageView);
       // img.setImageResource(R.drawable.images);


        Button btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

            }
        });






}

    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    };

    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.item1:
                 finish();
                // Toast.makeText(this, "Menu", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item2:
                Intent intent = new Intent(this, SettingsActivity.class);
                startActivity(intent);
               // Toast.makeText(this, "Configuracion", Toast.LENGTH_SHORT).show();
                return true;
        }
        return true;
    }
}
