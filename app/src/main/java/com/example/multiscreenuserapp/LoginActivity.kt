package com.example.multiscreenuserapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.multiscreenuserapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {

            val name = binding.etName.text.toString()
            val email = binding.etEmail.text.toString()

            if (
                !Validator.isNotEmpty(name) ||
                !Validator.isNotEmpty(email) ||
                !Validator.isValidEmail(email)
            ) {
                binding.tvError.visibility = View.VISIBLE
                binding.tvError.text = "Enter valid name and email"
                return@setOnClickListener
            }

            SessionMannager.currentUser = User(name, email)

            startActivity(Intent(this, DashboardActivity::class.java))
            finish()
        }
    }
}