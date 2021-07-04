package com.example.filltheform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    private Button mbtnNext1;
    private EditText mEtName1;
    private EditText mEtPhone1;
    private EditText mEtMail1;
    private EditText mEtAdd1;
    private EditText mEtMan1;
    private EditText mEtTax1;
    private EditText mEtComp1;
    private EditText mEtOrg1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEtName1=findViewById(R.id.etName);
        mEtPhone1=findViewById(R.id.etPhone);
        mEtAdd1=findViewById(R.id.etAdd);
        mEtMan1=findViewById(R.id.etMan);
        mEtTax1=findViewById(R.id.etTax);
        mEtComp1=findViewById(R.id.etCopm);
        mEtMail1=findViewById(R.id.etMail);
        mEtOrg1=findViewById(R.id.etOrgName);
        Intent intent=getIntent();
        String Name=intent.getStringExtra("Name");
        mEtName1.setText(Name);
        String Phone=intent.getStringExtra("Phone");
        mEtPhone1.setText(Phone);
        String Mail=intent.getStringExtra("Mail");
        mEtAdd1.setText(Mail);
        String Add=intent.getStringExtra("Add");
        mEtMan1.setText(Add);
        String Man=intent.getStringExtra("Man");
        mEtTax1.setText(Man);
        String Tax=intent.getStringExtra("Tax");
        mEtComp1.setText(Tax);
        String Comp=intent.getStringExtra("Comp");
        mEtOrg1.setText(Comp);
        String Org=intent.getStringExtra("Org");
        mEtMail1.setText(Org);


            }
        }

