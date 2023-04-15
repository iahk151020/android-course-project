package com.example.courseproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class CartActivity extends AppCompatActivity {

    Spinner spinnerPayment;
    RecyclerView rcvCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        spinnerPayment = findViewById(R.id.spinner_cart_payment);
        String[] paymentTypes = new String[] {"cash", "transfer"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, paymentTypes);
        spinnerPayment.setAdapter(adapter);

        rcvCart = findViewById(R.id.rcv_cart);
        rcvCart.setLayoutManager(new LinearLayoutManager(this));
        rcvCart.setHasFixedSize(true);
        CartAdapter cartAdapter = new CartAdapter(this);
        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        rcvCart.addItemDecoration(itemDecoration);
        rcvCart.setAdapter(cartAdapter);
        cartAdapter.notifyDataSetChanged();
    }
}