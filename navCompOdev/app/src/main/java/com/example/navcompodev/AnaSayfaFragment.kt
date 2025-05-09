package com.example.navcompodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navcompodev.databinding.FragmentAnaSayfaBinding


class AnaSayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnaSayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAnaSayfaBinding.inflate(inflater, container, false)

        binding.button.setOnClickListener(){
            Navigation.findNavController(it).navigate(R.id.gitToA)
        }

        binding.button2.setOnClickListener(){
            Navigation.findNavController(it).navigate(R.id.gitToX)
        }

        return binding.root


    }
}