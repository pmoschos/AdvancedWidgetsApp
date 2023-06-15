package gr.aueb.cf.advancedwidgetsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox = findViewById(R.id.checkBox);

        // TODO: We need to complete this task tomorrow.
        if(checkBox.isChecked()) {
            // do something
        } else {
            // do something else
        }

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity.this, "I accepted the terms.", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "I don't accepted the terms.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}