package com.example.keypad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.keypad.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    private EditText editText;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        LinearLayout linearLayout =findViewById(R.id.card_0);
        LinearLayout linearLayout1=findViewById(R.id.card_1);
        EditText editText= findViewById(R.id.edNumber);
        editText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN) {
                    char pressedKey = (char) event.getUnicodeChar();
                    String existingText = editText.getText().toString();
                    String newText = existingText + pressedKey;
                    editText.setText(newText);
                    editText.setSelection(newText.length());
                    return true;
                }
                return false;

            }
        });


        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              showToast("incorrect");
            }
        });

        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("correct");
            }
        });


//
//        binding.btnKeypad.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
        binding.btnKeypad.setOnClickListener(z -> {

            if (binding.dialerLayout.getVisibility() == View.VISIBLE) {
                binding.dialerLayout.setVisibility(View.GONE);
            } else {
                binding.dialerLayout.setVisibility(View.VISIBLE);
            }
        });

    }
    private void showToast(String message  ) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}