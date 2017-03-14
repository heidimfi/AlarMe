package com.example.aminaettayebi.loginregister;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.sql.*;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import  java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class register extends Activity implements View.OnClickListener  {

    Button bRegister;
    EditText etbrukernavn,etpassord, etnavn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        etbrukernavn = (EditText) findViewById(R.id.etbrukernavn);
        etpassord = (EditText) findViewById(R.id.etpassord);
        etnavn = (EditText) findViewById(R.id.etnavn);
        bRegister = (Button) findViewById(R.id.bRegister);
        bRegister.setOnClickListener(this);
    }}


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bRegister:
                try {
                    String server = "sql11.freemysqlhosting.net";
                    String database = "sql11163131";
                    String username = "sql11163131";
                    String password = "wi4gXfVvT3";
                    String connectionString = "jdbc:mysql://" + server + "/" + database +
                            "?user=" + username + "&password=" + password;
                    Connection connection = DriverManager.getConnection(connectionString);
                    String result = "Database connection success\n";
                    Statement st = connection.createStatement();
                    ResultSet rs = st.executeQuery("select * from Student");
                    System.out.print(rs);
                    ResultSetMetaData rsmd = rs.getMetaData();
                    while (rs.next()) {

                        result += rsmd.getColumnName(1) + ": " + rs.getString(1) + "\n";
                        System.out.print(result);

                    }

                } catch (Exception e) {
                    e.printStackTrace();


                    //what happens when user click register

        }

    }
}





