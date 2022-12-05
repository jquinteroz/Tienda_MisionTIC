package com.example.storemisintic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Info extends AppCompatActivity {

    private TextView txtdescriptioninfo, txtpriceinfo, txtnameinfo;
    private Button btnatras;
    private ImageView imginfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        txtdescriptioninfo=(TextView) findViewById(R.id.txtdescriptioninfo);
        txtpriceinfo=(TextView) findViewById(R.id.txtpriceinfo);
        txtnameinfo=(TextView) findViewById(R.id.txtnameinfo);

        btnatras=(Button) findViewById(R.id.btnatras);

        imginfo=(ImageView) findViewById(R.id.imginfo);

        Intent intentIn=getIntent();
        txtnameinfo.setText(intentIn.getStringExtra("name"));
        txtdescriptioninfo.setText(intentIn.getStringExtra("description"));
        txtpriceinfo.setText(String.valueOf(intentIn.getIntExtra("price",0)));
        imginfo.setImageResource(intentIn.getIntExtra("image",0));

        btnatras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Catalogo.class);
                startActivity(intent);
            }
        });
    }
}