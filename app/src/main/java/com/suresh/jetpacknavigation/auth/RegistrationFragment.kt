package com.suresh.jetpacknavigation.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.suresh.jetpacknavigation.R
import com.suresh.jetpacknavigation.databinding.FragmentRegistrationBinding

class RegistrationFragment : Fragment() {

    private lateinit var binding: FragmentRegistrationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRegistrationBinding.inflate(layoutInflater).apply {

            btnRegister.setOnClickListener {
                findNavController().navigate(R.id.action_registrationFragment_to_homeFragment)
            }

            btnLogin.setOnClickListener {
                findNavController().navigate(R.id.action_registrationFragment_to_loginFragment)
            }
        }

        return binding.root
    }

}