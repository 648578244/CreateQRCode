package com.example.l.createqrcode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView image = (ImageView)findViewById(R.id.image);
        try{
            image.setImageBitmap(BitmapUtil.createQRCode("http://192.168.17.223:8080/manager/weidaiwang.apk", 50));
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
