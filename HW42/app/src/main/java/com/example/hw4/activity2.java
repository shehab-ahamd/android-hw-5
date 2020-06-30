package com.example.hw4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activity2 extends AppCompatActivity {
MediaPlayer mysong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

       Bundle b =getIntent().getExtras();

        TextView tv1 = (TextView) findViewById(R.id.textview1);
        TextView tv2 = (TextView) findViewById(R.id.textview2);
        TextView tv3 = (TextView) findViewById(R.id.textview3);
        Button tv4 = (Button) findViewById(R.id.textview4);
        final TextView em = (TextView) findViewById(R.id.email);
final TextView ph =(TextView) findViewById(R.id.phone);

        tv1.setText(b.getString("key1"));
        tv2.setText(b.getString("key2"));
        tv3.setText(b.getString("key3"));
        tv4.setText(b.getString("key4"));
        em.setText(b.getString("key5"));
        ph.setText(b.getString("key4"));


tv4.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

                mysong=MediaPlayer.create(activity2.this,R.raw.cal);
                mysong.start();

    }
});
        Button back =(Button) findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(activity2.this,MainActivity.class);
                startActivity(i);
                mysong.release();
            }
        });
em.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        String mail =em.getText().toString();
        Intent mail2 =new Intent(Intent.ACTION_SEND);
        mail2.setType("message/rfc822");
        mail2.putExtra(Intent.EXTRA_EMAIL,new String[]{mail});
        mail2.setPackage("com.google.android.gm");
        startActivity(mail2);
    }
});
ph.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        String phones = ph.getText().toString();
        Intent call =new Intent(Intent.ACTION_DIAL);
        call.setData(Uri.parse("tel:"+ph));
        startActivity(call);
    }
});
    }
}