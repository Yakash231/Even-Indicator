package com.example.evenindicator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button submit;
        EditText number;
        Button ind;
        TextView result;

       submit = findViewById(R.id.sub);
       number = findViewById(R.id.input);
       ind = findViewById(R.id.ind);
       result = findViewById(R.id.result);

       submit.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               double input = Double.parseDouble(number.getText().toString());
               if(input % 2 == n0)
               {
                   result.setText("EVEN");
                   ind.setBackgroundColor(getResources().getColor(R.color.Green));
                   result.setTextColor(getResources().getColor(R.color.Green));
               }
               else{
                   result.setText("ODD");
                   result.setTextColor(getResources().getColor(R.color.Red));
                   ind.setBackgroundColor(getResources().getColor(R.color.Red));
               }
           }
       });


        EdgeToEdge.enable(this);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}