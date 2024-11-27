package com.example.wash_wear.auth;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.wash_wear.R;
import com.example.wash_wear.databinding.SignupScreenBinding;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class SignupActivity extends AppCompatActivity {

    private SignupScreenBinding binding;
    private ProgressDialog loadingBar;
    private FirebaseAuth mAuth;
    private FirebaseFirestore db = FirebaseFirestore.getInstance();
    private CollectionReference userRef;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //initialize view binding

        binding = SignupScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        //initializing firebaseAuth and Firestore references
        mAuth = FirebaseAuth.getInstance();
        userRef = db.collection("users");

        //initializing progress dialog
        loadingBar = new ProgressDialog(this);

        //Register button click listener
        binding.registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        })


    }
}
