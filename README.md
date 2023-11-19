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
