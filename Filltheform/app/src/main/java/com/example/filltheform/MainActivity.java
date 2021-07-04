package com.example.filltheform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button mbtnNext;
    private EditText mEtName;
    private EditText mEtPhone;
    private EditText mEtMail;
    private EditText mEtAdd;
    private EditText mEtMan;
    private EditText mEtTax;
    private EditText mEtComp;
    private EditText mEtOrg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mbtnNext=findViewById(R.id.btnNext);
        mEtName=findViewById(R.id.etName);
        mEtPhone=findViewById(R.id.etPhone);
        mEtAdd=findViewById(R.id.etAdd);
        mEtMan=findViewById(R.id.etMan);
        mEtTax=findViewById(R.id.etTax);
        mEtComp=findViewById(R.id.etCopm);
        mEtOrg=findViewById(R.id.etOrgName);
        mEtMail=findViewById(R.id.etMail);
        mbtnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("Name",mEtName.getText().toString());
                intent.putExtra("Phone",mEtPhone.getText().toString());
                intent.putExtra("Mail",mEtMail.getText().toString());
                intent.putExtra("Add",mEtAdd.getText().toString());
                intent.putExtra("Man",mEtMan.getText().toString());
                intent.putExtra("Tax",mEtTax.getText().toString());
                intent.putExtra("Comp",mEtComp.getText().toString());
                intent.putExtra("Org",mEtOrg.getText().toString());
                startActivity(intent);
            }
        });
    }

}