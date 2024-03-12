package com.arturbogea.calculandoimc.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.arturbogea.calculandoimc.R
import com.arturbogea.calculandoimc.databinding.ActivitySplashBinding
import com.arturbogea.calculandoimc.databinding.FragmentCalculoBinding

class CalculoIMC : Fragment() {

    private var binding: FragmentCalculoBinding? = null

    private var pesoFinal: Double? = null
    private var alturaFinal: Double? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        pesoFinal = arguments?.getDouble("$pesoFinal")
        alturaFinal = arguments?.getDouble("$alturaFinal")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentCalculoBinding.inflate(inflater, container, false)
        val view = binding!!.root


        binding!!.btnCalcular.setOnClickListener {
            val nome = binding!!.editNome.text.toString()
            val peso = binding!!.editPeso.text.toString().toDoubleOrNull() ?: 0.0
            val altura = binding!!.editAltura.text.toString().toDoubleOrNull() ?: 0.0

            val bundle = bundleOf("peso" to peso, "altura" to altura)
            val resultadoImc = ResultadoIMC()
            resultadoImc.arguments = bundle

            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_conteudo, resultadoImc)
                .addToBackStack(null)
                .commit()
        }



        return view
    }

}


