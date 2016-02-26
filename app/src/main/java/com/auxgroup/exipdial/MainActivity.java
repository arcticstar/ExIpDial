package com.auxgroup.exipdial;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText et_number;
    private SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_number= (EditText) findViewById(R.id.et_ip);
        sp = getSharedPreferences("config", MODE_PRIVATE);

    }

    public void save(View view) {
        String ipNumber = et_number.getText().toString().trim();
        if (TextUtils.isEmpty(ipNumber)) {
            Toast.makeText(this,"清除ip号码成功",Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this,"设置ip号码成功",Toast.LENGTH_SHORT).show();
        }
        SharedPreferences.Editor edit = sp.edit();
        edit.putString("ipNumber",ipNumber);
        edit.commit();


    }
}
