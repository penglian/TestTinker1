package com.customview.taoqicar.testtinker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnTinker,btnTinker1;
    TextView tvTinker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
       btnTinker  = (Button) findViewById(R.id.btn_tinker);
        tvTinker = (TextView) findViewById(R.id.tv_tinker);
       btnTinker1 = (Button) findViewById(R.id.btn_tinker1);
        btnTinker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvTinker.setText("fasfafsafsa");
            }
        });

        btnTinker1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvTinker.setText("fasfsafsafsaf");
            }
        });
    }
}
