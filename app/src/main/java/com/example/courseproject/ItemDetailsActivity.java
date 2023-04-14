package com.example.courseproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ItemDetailsActivity extends AppCompatActivity {

    Button btnInc, btnDec, btnAddToCart;
    TextView tvQuantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_details);

        btnInc = findViewById(R.id.btn_item_details_inc);
        btnDec = findViewById(R.id.btn_item_details_dec);
        btnAddToCart = findViewById(R.id.btn_add_to_cart);
        tvQuantity = findViewById(R.id.tv_item_details_quantity);

        btnInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int quantity = Integer.parseInt(tvQuantity.getText().toString());
                tvQuantity.setText(String.valueOf(++quantity));
            }
        });

        btnDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int quantity = Integer.parseInt(tvQuantity.getText().toString());
                tvQuantity.setText(String.valueOf( Math.max(--quantity, 0)));
            }
        });

    }
}