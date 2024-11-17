package com.ainadia.lab04

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ainadia.lab04.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // The step is used to link the UI created in XML to uor Kotlin file
        // 3 steps
        // 1 - enable {viewBinding} in gradle.kts
        // 2 - Initiate binding object
        // 3 - set content view to binding root
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.buttonPlus.setOnClickListener {
            val num1 = binding.editText1.text.toString().toInt()
            val num2 = binding.editText2.text.toString().toInt()
            val sum = num1 + num2;
            binding.resultTextView.text = "Result: $sum"

        }
        binding.buttonMinus.setOnClickListener {
            val num1 = binding.editText1.text.toString().toInt()
            val num2 = binding.editText2.text.toString().toInt()
            val minus = num1 - num2
            binding.resultTextView.text = "Result: $minus"
        }
        binding.buttonProduct.setOnClickListener {
                val num1 = binding.editText1.text.toString().toInt()
                val num2 = binding.editText2.text.toString().toInt()
                val product = num1 * num2
                binding.resultTextView.text = "Result: $product"

            }
        binding.buttonDivide.setOnClickListener {
            val num1 = binding.editText1.text.toString().toInt()
            val num2 = binding.editText2.text.toString().toInt()
            val divide = num1 / num2
            binding.resultTextView.text = "Result: $divide"

        }



    }
}