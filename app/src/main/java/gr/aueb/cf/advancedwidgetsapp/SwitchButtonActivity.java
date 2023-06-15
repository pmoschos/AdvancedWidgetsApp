package gr.aueb.cf.advancedwidgetsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class SwitchButtonActivity extends AppCompatActivity {

    private Switch switchBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch_button);

        switchBtn = findViewById(R.id.switchBtn);

        switchBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(SwitchButtonActivity.this, "Switch is ON", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(SwitchButtonActivity.this, "Switch is OFF", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}