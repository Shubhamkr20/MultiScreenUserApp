package com.example.multiscreenuserapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.multiscreenuserapp.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    private lateinit var binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentProfileBinding.inflate(inflater, container, false)

        // Load current user data
        val user = SessionMannager.currentUser
        binding.etName.setText(user?.name)
        binding.etEmail.setText(user?.email)

        binding.btnSave.setOnClickListener {

            // READ UPDATED VALUES INSIDE CLICK
            val name = binding.etName.text.toString()
            val email = binding.etEmail.text.toString()

            // PROPER VALIDATION
            if (
                !Validator.isNotEmpty(name) ||
                !Validator.isNotEmpty(email) ||
                !Validator.isValidEmail(email)
            ) {
                return@setOnClickListener
            }

            // SAVE UPDATED USER
            SessionMannager.currentUser = User(name, email)

            // GO BACK TO DASHBOARD
            parentFragmentManager.popBackStack()
        }

        return binding.root
    }
}