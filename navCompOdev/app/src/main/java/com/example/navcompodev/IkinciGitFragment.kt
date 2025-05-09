package com.example.navcompodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navcompodev.databinding.FragmentIkinciGitBinding


class IkinciGitFragment : Fragment() {
    private lateinit var binding: FragmentIkinciGitBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentIkinciGitBinding.inflate(inflater, container, false)

        binding.button4.setOnClickListener(){
            Navigation.findNavController(it).navigate(R.id.bTOy)
        }

        return binding.root
    }


}