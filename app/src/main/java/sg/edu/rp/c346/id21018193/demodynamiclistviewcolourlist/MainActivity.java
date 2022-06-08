package sg.edu.rp.c346.id21018193.demodynamiclistviewcolourlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText etElement;
    EditText etIndexElement;
    Button btnAdd;
    ListView lvColour;
    ArrayList<String> alColours;
    ArrayAdapter<String> aaColour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etElement = findViewById(R.id.editTextTextColour);
        etIndexElement = findViewById(R.id.editTextTextIndex);
        btnAdd = findViewById(R.id.buttonAddItem);
        lvColour = findViewById(R.id.listViewColours);
        alColours = new ArrayList<>();
        alColours.add("Red");
        alColours.add("Orange");

        ArrayAdapter aaColour = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, alColours);
       lvColour.setAdapter(aaColour);

        btnAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String colourName = etElement.getText().toString();
                // alColours.add(colourName);
                int pos = Integer.parseInt(etIndexElement.getText().toString());
                alColours.add(pos, colourName);
                aaColour.notifyDataSetChanged();
            }
        });


    }


}