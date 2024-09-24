package com.suresh.jetpacknavigation.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.suresh.jetpacknavigation.R
import com.suresh.jetpacknavigation.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    private lateinit var binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProfileBinding.inflate(layoutInflater).apply {

            btnBack.setOnClickListener {
                findNavController().popBackStack()
            }

            btnLogout.setOnClickListener {
                findNavController().navigate(R.id.action_profileFragment_to_registrationFragment)
            }
        }

        return binding.root
    }
}