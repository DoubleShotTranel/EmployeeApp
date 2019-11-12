package com.example.employee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonPressed(View v) {
        String fName = this.findViewById(R.id.firstName).toString();
        String lName = this.findViewById(R.id.lastName).toString();
        String age = (this.findViewById(R.id.age).toString());
        String weight = (this.findViewById(R.id.weight).toString());
        String height = (this.findViewById(R.id.height).toString());
        EmployeeInfo employeeUser = new EmployeeInfo(fName, lName, age, weight, height);

        TextView weightDis = findViewById(R.id.weightDis);
        weightDis.setText(String.format(employeeUser.persons_weight));

        TextView heightDis = findViewById(R.id.heightDis);
        heightDis.setText(String.format(employeeUser.persons_height));

        TextView ageDis = (findViewById(R.id.ageDis));
        ageDis.setText(String.format(employeeUser.persons_age));

    }
}
