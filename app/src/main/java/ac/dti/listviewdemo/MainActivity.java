package ac.dti.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String players[] = {"Musfiqur Rahim", "Sakib Al Hasan", "Mahmudullah Riyad", "Mashrafe Bin Mortoza", "Mustafizur Rahman", "Sabbir Rahman", "Liton Das", "Summaya Sarkar", "Taskin Ahmed"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, players);
        listView.setAdapter(adapter);
    }
}