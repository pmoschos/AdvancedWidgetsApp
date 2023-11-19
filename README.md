# AdvancedWidgetsApp
Advanced Widgets

We show in separated Activities the design and the use of some advanced android widgets as:
- CheckBox
- ProgressBar
- RatioButtons
- RatingBar
- SeekBar
- SwitchButton
- customized buttons.

Also, we create Vector Asset.

![image](https://github.com/pmoschos/AdvancedWidgetsApp/assets/133533759/3f6eea3b-01b0-49fe-998b-4b1626c26bc4)

# MainActivity Overview 📱

## Introduction 🌟
This document provides an in-depth look at the `MainActivity` in our Android application, focusing on the implementation and functionality of a `CheckBox`.

## CheckBox Implementation ✅
The `MainActivity` includes a `CheckBox` widget that showcases basic user interactions and state handling within an Android UI.

### Initialization 🔍
- **ID:** `@+id/checkBox`
- The `CheckBox` is initialized by referencing its ID from the layout.

### State Checking 🔵🔴
- Immediately upon the activity's creation (`onCreate` method), the state of the `CheckBox` is checked.
- This check is pivotal for determining the initial state and corresponding actions.

### Event Listener 🎧
- **Event:** `setOnCheckedChangeListener`
- Changes in the `CheckBox` state trigger a `Toast` message, offering instant user feedback.
- **Checked State:** Displays "I accepted the terms."
- **Unchecked State:** Displays "I don't accept the terms."

## Code Snippet 💻
```java
private CheckBox checkBox;

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    checkBox = findViewById(R.id.checkBox);

    if(checkBox.isChecked()) {
        // Action when checkbox is initially checked
    } else {
        // Action when checkbox is initially unchecked
    }

    checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if (isChecked) {
                Toast.makeText(MainActivity.this, "I accepted the terms.", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this, "I don't accept the terms.", Toast.LENGTH_SHORT).show();
            }
        }
    });
}
```
## MainActivity :camera:
![image](https://github.com/pmoschos/AdvancedWidgetsApp/assets/133533759/1af4cd6b-7826-4dbe-b370-ebfb15f2942d)

# ProgressBar Activity Overview 🚀

## Introduction 🌟
This section of the documentation focuses on the `ProgressBar` activity in the Android application. It provides insights into how the ProgressBar, TextView, and Button components are used to simulate a file download process.

## Component Overview 🧩

### Initialization 🔍
- **ProgressBar:** `@+id/progressBar`
- **TextView (Progress Display):** `@+id/progressTV`
- **Button (Start Download):** `@+id/button`

### Functionality 🛠️
- Upon clicking the button, a simulated file download process is initiated.
- The `ProgressBar` visually indicates the progress of the download.
- The `TextView` displays the current percentage of the download process.

## Code Snippet 💻
```java
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

                // Update the state of progress
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
```
## ProgressBarActivity :camera:
![image](https://github.com/pmoschos/AdvancedWidgetsApp/assets/133533759/b79d4b74-429f-45dd-95fa-5827ae56198b)

# RadioButton Activity Overview 📻

## Introduction 🌟
This section provides an overview of the `RadioButton` activity in our Android application. It explains the implementation of the RadioGroup and Button components to handle user selections.

## Component Overview 🧩

### Initialization 🔍
- **RadioGroup:** `@+id/radioGroup`
- **Button (Submit):** `@+id/submitBtn2`

### Functionality 🛠️
- The `RadioGroup` allows users to select one of several options.
- Upon clicking the submit button, the selected option from the RadioGroup is identified.
- A `Toast` message is displayed showing the user's selection.

## Code Snippet 💻
```java
private RadioGroup radioGroup;
private Button submitBtn2;

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_radio_button);

    radioGroup = findViewById(R.id.radioGroup);
    submitBtn2 = findViewById(R.id.submitBtn2);

    submitBtn2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int selectedId = radioGroup.getCheckedRadioButtonId();
            RadioButton radioButton = findViewById(selectedId);

            Toast.makeText(RadioButtonActivity.this, "Selected delivery: " + radioButton.getText(),
                    Toast.LENGTH_SHORT).show();
        }
    });
}
```
## RadioButtonActivity :camera:
![image](https://github.com/pmoschos/AdvancedWidgetsApp/assets/133533759/309a0ed0-6528-4c86-a997-29b16423749f)

# RatingBar Activity Overview 🌟

## Introduction 📖
This document details the `RatingBar` activity in our Android application, highlighting the integration of the RatingBar and Button components for capturing user ratings.

## Component Overview 🧩

### Initialization 🔎
- **RatingBar:** `@+id/ratingBar`
- **Button (Submit):** `@+id/submitBtn`

### Functionality ⚙️
- The `RatingBar` allows users to provide a rating, typically out of five stars.
- Upon clicking the submit button, the current rating value is retrieved.
- A `Toast` message displays the user's given rating.

## Code Snippet 💻
```java
private RatingBar ratingBar;
private Button submitBtn;

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_rating_bar);

    ratingBar = findViewById(R.id.ratingBar);
    submitBtn = findViewById(R.id.submitBtn);

    submitBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            float rating = ratingBar.getRating();
            Toast.makeText(RatingBarActivity.this, "Rating: " + rating, Toast.LENGTH_SHORT).show();
        }
    });
}
```

## RadioButtonActivity :camera:
![image](https://github.com/pmoschos/AdvancedWidgetsApp/assets/133533759/f3dc572b-416b-4cee-b86d-061d9e456be9)

# SeekBar Activity Overview 🎚️

## Introduction 📘
This section outlines the functionality of the `SeekBar` activity in our Android application, focusing on the use of a SeekBar to dynamically change the background color of a layout.

## Component Overview 🧩

### Initialization 🔎
- **SeekBar:** `@+id/seekBar`
- **ConstraintLayout (Background):** `@+id/constraintLayoutBackground`

### Functionality ⚙️
- The `SeekBar` provides a user interface element for adjusting values by sliding a handle.
- As the user slides the handle, the background color of the `ConstraintLayout` dynamically changes.
- The color change is based on the seek bar's progress value, modifying the RGB values.

## Code Snippet 💻
```java
private SeekBar seekBar;
private ConstraintLayout constraintLayoutBackground;

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_seek_bar);

    seekBar = findViewById(R.id.seekBar);
    constraintLayoutBackground = findViewById(R.id.constraintLayoutBackground);

    seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            int color = Color.rgb(progress, 255, progress);
            constraintLayoutBackground.setBackgroundColor(color);
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            // Implement if needed
        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            // Implement if needed
        }
    });
}
```

## RadioButtonActivity :camera:
![image](https://github.com/pmoschos/AdvancedWidgetsApp/assets/133533759/07c6dffd-d4fd-442f-b2e9-a2d40b0f7d24)



