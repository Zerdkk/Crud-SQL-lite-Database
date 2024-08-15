package com.example.sqllitedatabase;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button insert, view, update, delete;
    EditText id, name, marks;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


insert.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

    }
});

view.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

    }
});
update.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

    }
});
delete.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

    }
});


    }
    public void init(){
        insert=findViewById(R.id.btn_insert);
        view=findViewById(R.id.btn_view);
        update=findViewById(R.id.btn_update);
        delete=findViewById(R.id.btn_delete);
        id=findViewById(R.id.txt_id);
        name=findViewById(R.id.txt_name);
        marks=findViewById(R.id.txt_marks);
    }
}