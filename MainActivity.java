package com.example.myapplication;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText edittext1;
    SQLiteDatabase mydatabase = null;
    private Button buttonInsert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }

    private void addListenerOnButton()  {

        edittext1 = (EditText) findViewById(R.id.editText1);
        buttonInsert = (Button) findViewById(R.id.button);
        buttonInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)  {
                String value1=edittext1.getText().toString();
                if (mydatabase == null) {
                    SQLiteDatabase mydatabase = openOrCreateDatabase("UserEmail", MODE_PRIVATE, null);
                }
                mydatabase.execSQL("CREATE TABLE IF NOT EXISTS Data(email VARCHAR);");
                mydatabase.execSQL("INSERT INTO Data VALUES('value1');");


            }
        });
    }



}





//                Statement statement = null;
//                String URL = "jdbc:mysql://localhost:3306/tom";
//                String USER = "tom";
//                String PASS = "P95namer";
//                Connection conn = null;
//                try {
//                    conn = DriverManager.getConnection(URL, USER, PASS);
//                    statement = conn.createStatement();
//                    statement.executeUpdate("INSERT INTO Persons " + "VALUES ('value1')");
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }