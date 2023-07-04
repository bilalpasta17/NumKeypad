package com.example.keypad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.keypad.databinding.ActivityMainBinding;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    private EditText editText;
    private String test = "";
    CardView button;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.keypad);
        button=findViewById(R.id.btn_keypad);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(MainActivity.this);
                bottomSheetDialog.setContentView(R.layout.keypad);

                bottomSheetDialog.show();

            }
        });




//        binding = ActivityMainBinding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());

//        LinearLayout linearLayout = findViewById(R.id.card_0);
//        LinearLayout linearLayout1 = findViewById(R.id.card_1);
//        EditText editText = findViewById(R.id.edNumber);

//        editText.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//                // Do nothing
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//                String newText = charSequence.toString();
//                if (newText.equals("0")) {
//                    // Display a Toast message indicating that "0" is pressed
//                    Toast.makeText(MainActivity.this, charSequence+" is pressed", Toast.LENGTH_SHORT).show();
//                }
//
//            }
//
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//                // Get the last entered character
////                if (editable.length() > 0) {
////                    char lastChar = editable.charAt(editable.length() - 1);
////
////                    // Check if the last character is a number
////                    if (Character.isDigit(lastChar)) {
////                        // Print the number on the screen (you can change this to any desired output mechanism)
////                        Toast.makeText(MainActivity.this, "Pressed: " + lastChar, Toast.LENGTH_SHORT).show();
////                    }
////                }
//            }
//        });
//
//
//        linearLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////              showToast("0 is Pressed");
//              test.concat("0");
//                editText.setText(test);
//            }
//        });
//
//        linearLayout1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                showToast("1 is pressed");
//                test.concat("1");
//                editText.setText(test);
//            }
//        });
//
//
////
////        binding.btnKeypad.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////
////            }
////        });
//        binding.btnKeypad.setOnClickListener(z -> {
//
//            if (binding.dialerLayout.getVisibility() == View.VISIBLE) {
//                binding.dialerLayout.setVisibility(View.GONE);
//            } else {
//                binding.dialerLayout.setVisibility(View.VISIBLE);
//            }
//        });
//
//    }
//    private void showToast(String message  ) {
//        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
//    }
    }
}