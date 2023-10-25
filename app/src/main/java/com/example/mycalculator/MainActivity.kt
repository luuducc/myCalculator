package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.mycalculator.databinding.ActivityMainBinding
import java.text.DecimalFormat


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonClear.setOnClickListener {
            binding.input.text = ""
            binding.result.text = ""
        }

        binding.button0.setOnClickListener {
            binding.input.text = addToInputText("0")
        }
        binding.button1.setOnClickListener {
            binding.input.text = addToInputText("1")
        }
        binding.button2.setOnClickListener {
            binding.input.text = addToInputText("2")
        }
        binding.button3.setOnClickListener {
            binding.input.text = addToInputText("3")
        }
        binding.button4.setOnClickListener {
            binding.input.text = addToInputText("4")
        }
        binding.button5.setOnClickListener {
            binding.input.text = addToInputText("5")
        }
        binding.button6.setOnClickListener {
            binding.input.text = addToInputText("6")
        }
        binding.button7.setOnClickListener {
            binding.input.text = addToInputText("7")
        }
        binding.button8.setOnClickListener {
            binding.input.text = addToInputText("8")
        }
        binding.button9.setOnClickListener {
            binding.input.text = addToInputText("9")
        }
        binding.buttonPlus.setOnClickListener {
            binding.input.text = addToInputText("+")
        }
        binding.buttonSubtract.setOnClickListener {
            binding.input.text = addToInputText("-")
        }
        binding.buttonDivide.setOnClickListener {
            binding.input.text = addToInputText("÷")
        }
        binding.buttonMultiple.setOnClickListener {
            binding.input.text = addToInputText("x")
        }
        binding.buttonEqual.setOnClickListener {
//            showResult()
        }

    }
    private fun addToInputText(buttonValue: String): String {

        return binding.input.text.toString() + "" + buttonValue
    }
    private fun showResult() {

    }

    private fun getInputExpression(): String {
        var expression = binding.input.text.replace(Regex("÷"), "/")
        expression = expression.replace(Regex("×"), "*")
        return expression
    }
//    private fun showResult() {
//        try {
//            val expression = getInputExpression()
//            val result = Expression(expression).calculate()
//            if (result.isNaN()) {
//                // Show Error Message
//                binding.result.text = ""
//                binding.result.setTextColor(ContextCompat.getColor(this, R.color.red))
//            } else {
//                // Show Result
//                binding.result.text = DecimalFormat("0.######").format(result).toString()
//                binding.result.setTextColor(ContextCompat.getColor(this, R.color.green))
//            }
//        } catch (e: Exception) {
//            // Show Error Message
//            binding.result.text = ""
//            binding.result.setTextColor(ContextCompat.getColor(this, R.color.red))
//        }
//    }

}