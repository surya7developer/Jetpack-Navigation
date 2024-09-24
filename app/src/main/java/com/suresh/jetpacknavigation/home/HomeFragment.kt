package com.suresh.jetpacknavigation.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.suresh.jetpacknavigation.R
import com.suresh.jetpacknavigation.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater).apply {

            btnProfile.setOnClickListener {
                findNavController().navigate(R.id.action_homeFragment_to_profileFragment)
            }

            btnSetting.setOnClickListener {
                findNavController().navigate(R.id.action_homeFragment_to_settingFragment)
            }
        }




        return binding.root
    }
}