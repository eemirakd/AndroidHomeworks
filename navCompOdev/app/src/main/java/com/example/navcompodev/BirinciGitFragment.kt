package com.example.navcompodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navcompodev.databinding.FragmentBirinciGitBinding


class BirinciGitFragment : Fragment() {
    private lateinit var binding: FragmentBirinciGitBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentBirinciGitBinding.inflate(inflater, container, false)

        binding.button3.setOnClickListener(){
            Navigation.findNavController(it).navigate(R.id.gitToB)
        }


        return binding.root
    }


}