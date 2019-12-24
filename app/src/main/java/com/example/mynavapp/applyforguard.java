package com.example.mynavapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class applyforguard extends AppCompatActivity {


    private DatabaseReference databaseReference;
    private FirebaseDatabase firebaseDatabase;

    private Button button,btnsubmit;
    private EditText pincode,institute,address,state,district,guards,contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_applyforguard);

        btnsubmit = (Button) findViewById(R.id.btn_submit);
        button = (Button) findViewById(R.id.reset);

        pincode = (EditText) findViewById(R.id.pincode);
        institute = (EditText) findViewById(R.id.institue);
        address = (EditText) findViewById(R.id.address);
        state = (EditText) findViewById(R.id.state);
        guards = (EditText) findViewById(R.id.guard);
        district = (EditText) findViewById(R.id.district);
        contact = (EditText) findViewById(R.id.contact);

        databaseReference = FirebaseDatabase.getInstance().getReference().child("guard");

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty(contact.getText()))
                {
                    contact.setError("Please enter a contact number");
                    contact.requestFocus();
                }
                else  if (TextUtils.isEmpty(district.getText()))
                {
                    district.setError("Please enter a district");
                    district.requestFocus();
                }
                else  if (TextUtils.isEmpty(state.getText()))
                {
                    state.setError("Please enter a district");
                    state.requestFocus();
                }
                else  if (TextUtils.isEmpty(address.getText()))
                {
                    address.setError("Please enter a district");
                    address.requestFocus();
                }
                else  if (TextUtils.isEmpty(institute.getText()))
                {
                    institute.setError("Please enter a district");
                    institute.requestFocus();
                }
                else  if (TextUtils.isEmpty(pincode.getText()))
                {
                    pincode.setError("Please enter a district");
                    pincode.requestFocus();
                }
                else  if (TextUtils.isEmpty(guards.getText()))
                {
                    guards.setError("Please enter a district");
                    guards.requestFocus();
                }
                else{
                    AddData();
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pincode.setText("");
                institute.setText("");
                address.setText("");
                contact.setText("");
                district.setText("");
                guards.setText("");
                state.setText("");


            }
        });
    }

    private void AddData() {

        String instituteName = institute.getText().toString().trim();
        String Contact = contact.getText().toString().trim();
        String Address = address.getText().toString().trim();
        String District = district.getText().toString().trim();
        String State = state.getText().toString().trim();
        String Pincode = pincode.getText().toString().trim();
        String Guards = guards.getText().toString().trim();

        SaveData saveData = new SaveData(instituteName,Contact,Address,District,State,Pincode,Guards);
        databaseReference.push().setValue(saveData);
        Toast.makeText(getApplication(), "Save SuccessFully", Toast.LENGTH_LONG).show();
    }
}
