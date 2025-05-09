package com.example.navcompodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navcompodev.databinding.FragmentDorduncuGitBinding


class DorduncuGitFragment : Fragment() {
    private lateinit var binding: FragmentDorduncuGitBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentDorduncuGitBinding.inflate(inflater, container, false)

        binding.button6.setOnClickListener(){
            Navigation.findNavController(it).navigate(R.id.geriDon)
        }

        return binding.root
    }


}