package com.example.registration1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    EditText name, email, hobbies, mobile;
    RadioGroup radioGroup;
    RadioButton radioButton;
    ToggleButton toggle;
    Button bt1;
    TextView txt1,txt2,txt3,txt4,txt5,txt6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.personName);
        email = findViewById(R.id.email_id);
        hobbies = findViewById(R.id.hobbies);
        mobile = findViewById(R.id.mobile);
        radioGroup = findViewById(R.id.radioGroup);
        toggle = findViewById(R.id.toggleButton);
        bt1 = findViewById(R.id.button);
        txt1 = findViewById(R.id.textView);
        txt2=findViewById(R.id.textView3);
        txt3=findViewById(R.id.textView4);
        txt4=findViewById(R.id.textView5);
        txt5=findViewById(R.id.textView6);
        txt6=findViewById(R.id.textView7);



        bt1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {


                String info = name.getText().toString();
                String mail = email.getText().toString();
                String hob = hobbies.getText().toString();
                String number = mobile.getText().toString();
                String display = toggle.getText().toString();
                String gender = radioButton.getText().toString();

                int radiobt = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(radiobt);

                toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (b) {
                            toggle.isChecked();
                        } else {
                            toggle.setTextOn("Yes");
                        }
                    }
                });

                if (info.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter The Name", Toast.LENGTH_LONG).show();
                } else if (mail.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter The Email", Toast.LENGTH_LONG).show();
                } else if (hob.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter Your Hobbies", Toast.LENGTH_LONG).show();
                } else if (number.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter Your Mobile Number", Toast.LENGTH_LONG).show();
                } else if (display.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Please Choose Yes or No", Toast.LENGTH_LONG).show();
                } else if (gender.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Please Choose Your Gender", Toast.LENGTH_LONG).show();

                } else {
                    Toast.makeText(MainActivity.this,"please fill all field",Toast.LENGTH_SHORT).show();
                }
                txt1.setText("Name:-  "+info);
                txt2.setText("Email:- "+mail);
                txt3.setText("Number:- "+number);
                txt4.setText("Hobbies:- "+hob);
                txt5.setText("Gender:- "+gender);
                txt6.setText(display);
                Toast.makeText(getApplicationContext(), "SUBMITTED", Toast.LENGTH_LONG).show();
            }
        });
    }

    public void checked(View view) {
        int radiobt = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radiobt);
    }
}
