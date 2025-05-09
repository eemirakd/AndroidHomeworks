package com.example.navcompodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navcompodev.databinding.FragmentUcuncuGitBinding


class UcuncuGitFragment : Fragment() {
    private lateinit var binding: FragmentUcuncuGitBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentUcuncuGitBinding.inflate(inflater, container, false)

        binding.button5.setOnClickListener(){
            Navigation.findNavController(it).navigate(R.id.xToY)
        }

        return binding.root
    }


}