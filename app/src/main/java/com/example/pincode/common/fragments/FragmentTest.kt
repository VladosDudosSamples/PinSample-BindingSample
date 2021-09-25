package com.example.pincode.common.fragments

import android.os.Binder
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.pincode.R
import com.example.pincode.databinding.FragmentTestBinding

class FragmentTest : Fragment() {

    private lateinit var binding: FragmentTestBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTestBinding.bind(
            inflater.inflate(
                R.layout.fragment_test,container, false
            )
        )
        return binding.root
    }
}