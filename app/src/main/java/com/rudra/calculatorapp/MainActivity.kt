package com.rudra.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.rudra.calculatorapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPlus.setOnClickListener {
            val input1 = binding.eTInput1.text.toString().toInt()
            val input2 = binding.eTInput2.text.toString().toInt()

            binding.tVResult.text = (input1 + input2).toString()
        }

        binding.btnMinus.setOnClickListener {
            val input1 = binding.eTInput1.text.toString().toInt()
            val input2 = binding.eTInput2.text.toString().toInt()

            binding.tVResult.text = (input1 - input2).toString()
        }

        binding.btnMultiply.setOnClickListener {
            val input1 = binding.eTInput1.text.toString().toInt()
            val input2 = binding.eTInput2.text.toString().toInt()

            binding.tVResult.text = (input1 * input2).toString()
        }

        binding.btnDivide.setOnClickListener {
            val input1 = binding.eTInput1.text.toString().toInt()
            val input2 = binding.eTInput2.text.toString().toInt()

            if (input2 == 0 ) {
                binding.tVResult.text = "UNDEFINED"
            }
            else {
                binding.tVResult.text = (input1 / input2).toString()
            }

        }
    }
}