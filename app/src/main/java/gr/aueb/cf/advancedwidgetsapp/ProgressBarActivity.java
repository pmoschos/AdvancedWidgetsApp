package gr.aueb.cf.advancedwidgetsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.nio.channels.InterruptedByTimeoutException;

public class ProgressBarActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    private TextView progressTV;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);

        progressBar = findViewById(R.id.progressBar);
        progressTV = findViewById(R.id.progressTV);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressTV.setVisibility(View.VISIBLE);
                downloadFile();

            }
        });
    }

    private void downloadFile() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                int progress = 0;
                while (progress <= 100) {
                    int currentProgress = progress;

                    // i want to update the state of progress
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            progressBar.setProgress(currentProgress);

                            progressTV.setText(currentProgress + "%");
                        }
                    });
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    progress++;
                }
            }
        }).start();
    }
}