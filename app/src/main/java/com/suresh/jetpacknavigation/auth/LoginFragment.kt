package com.suresh.jetpacknavigation.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.suresh.jetpacknavigation.R
import com.suresh.jetpacknavigation.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(layoutInflater).apply {

            btnLogin.setOnClickListener {
                findNavController().navigate(R.id.action_loginFragment_to_homeFragment)
            }
        }
        return binding.root
    }

}