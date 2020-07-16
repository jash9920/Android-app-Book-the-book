package com.example.design;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AdminCatagoryActivity extends AppCompatActivity {

    private ImageView cse,mech,civil,electrical;
    private ImageView it,chemical,mechatronics,ece;
    private ImageView law,doctor,ca,farming;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_catagory);

        cse = (ImageView)findViewById(R.id.cse);
        mech = (ImageView)findViewById(R.id.mech);
        civil = (ImageView)findViewById(R.id.civil);
        electrical = (ImageView)findViewById(R.id.electrical);
        it = (ImageView)findViewById(R.id.it);
        chemical = (ImageView)findViewById(R.id.chemical);
        mechatronics = (ImageView)findViewById(R.id.mechatronics);
        ece = (ImageView)findViewById(R.id.ece);
        law = (ImageView)findViewById(R.id.law);
        doctor = (ImageView)findViewById(R.id.doctor);
        ca = (ImageView)findViewById(R.id.ca);
        farming = (ImageView)findViewById(R.id.farming);


        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCatagoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","Cse");
                startActivity(intent);
            }
        });

        mech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCatagoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","Mech");
                startActivity(intent);
            }
        });

        civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCatagoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","Civil");
                startActivity(intent);
            }
        });

        electrical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCatagoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","Electrical");
                startActivity(intent);
            }
        });

        it.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCatagoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","It");
                startActivity(intent);
            }
        });

        chemical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCatagoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","Chemical");
                startActivity(intent);
            }
        });

        mechatronics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCatagoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","Mechatronics");
                startActivity(intent);
            }
        });

        ece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCatagoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","Ece");
                startActivity(intent);
            }
        });

        law.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCatagoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","Law");
                startActivity(intent);
            }
        });

        doctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCatagoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","Doctor");
                startActivity(intent);
            }
        });

        ca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCatagoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","Ca");
                startActivity(intent);
            }
        });

        farming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCatagoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","Farming");
                startActivity(intent);
            }
        });

    }
}
