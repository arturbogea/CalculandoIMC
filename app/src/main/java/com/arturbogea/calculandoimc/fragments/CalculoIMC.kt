package com.arturbogea.calculandoimc.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.arturbogea.calculandoimc.R
import com.arturbogea.calculandoimc.databinding.FragmentCalculoBinding

class CalculoIMC : Fragment() {

    private var binding: FragmentCalculoBinding? = null



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentCalculoBinding.inflate(inflater, container, false)
        val view = binding!!.root



        return view
    }

}