package com.example.intrfz_nav_e_intracc;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

//import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.graphics.Insets;
//import androidx.core.view.ViewCompat;
//import androidx.core.view.WindowInsetsCompat;

import com.example.intrfz_nav_e_intracc.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        registerListener();
    }

    private void registerListener() {
        binding.passwordEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence cs, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() > 5) {
                    binding.showButton.setEnabled(true);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }

        });
        binding.showButton.setOnClickListener(view -> showMessage());
    }

    private void showMessage() {
        binding.hiddenText.setVisibility(View.VISIBLE);

    }
}






 /*   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
} */