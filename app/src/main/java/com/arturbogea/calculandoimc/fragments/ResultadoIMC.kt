package com.arturbogea.calculandoimc.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.arturbogea.calculandoimc.R
import com.arturbogea.calculandoimc.databinding.FragmentCalculoBinding
import com.arturbogea.calculandoimc.databinding.FragmentResultadoBinding

class ResultadoIMC : Fragment() {

    private var binding: FragmentResultadoBinding? = null
    private var pesoFinal: Double = 0.0
    private val alturaFinal: Double = 0.0

    val bundle = arguments

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val pesoFinal = arguments?.getDouble("peso") ?: 0.0
        val alturaFinal = arguments?.getDouble("altura") ?: 0.0
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentResultadoBinding.inflate(inflater, container, false)
        val view = binding!!.root

        resultadoFinal()

        binding!!.btnVoltar.setOnClickListener {
            requireActivity().supportFragmentManager.popBackStack()
        }

        return view
    }

    fun resultadoFinal(){

        val imagem = binding!!.imgResul
        val resultadoFinal = binding!!.txtResul
        val txtPeso = binding!!.txtPeso
        val txtAltura = binding!!.txtAltura


        var peso = pesoFinal
        var altura = alturaFinal
        var imc = peso / (altura * altura)

        imc.toString()

        txtPeso.text = "O peso informado foi de $pesoFinal"
        txtAltura.text = "A altura informada foi de $alturaFinal"


        when {
            imc <= 18.5 -> {
                resultadoFinal.setText("O seu imc é de ${"%.2f".format(imc)}. Você está abaixo do peso")
                resultadoFinal.setTextColor(requireContext().getColor(R.color.orange))
                imagem.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.alerta))

            }
            imc <= 24.9 -> {
                resultadoFinal.setText("O seu imc é de ${"%.2f".format(imc)}. Você está com o peso normal")
                resultadoFinal.setTextColor(requireContext().getColor(R.color.darkGreen))
                imagem.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.ok))
            }
            imc <= 29.9 -> {
                resultadoFinal.setText("O seu imc é de ${"%.2f".format(imc)}. Você está acima do peso")
                resultadoFinal.setTextColor(requireContext().getColor(R.color.yellow))
                imagem.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.alerta))
            }
            imc <= 34.9 -> {
                resultadoFinal.setText("O seu imc é de ${"%.2f".format(imc)}. Obsidade grau 1")
                resultadoFinal.setTextColor(requireContext().getColor(R.color.yellow))
                imagem.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.alerta))
            }
            imc <= 39.9 ->
            {
                resultadoFinal.setText("O seu imc é de ${"%.2f".format(imc)}. Obsidade grau 2")
                resultadoFinal.setTextColor(requireContext().getColor(R.color.orange))
                imagem.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.perigo))
            }
            else -> {
                resultadoFinal.setText("O seu imc é de ${"%.2f".format(imc)}. Obsidade grau 3")
                resultadoFinal.setTextColor(requireContext().getColor(R.color.red))
                imagem.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.perigo))
            }
        }


    }

}