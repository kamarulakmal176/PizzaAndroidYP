package com.metech.pizzaandroidyp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import com.metech.pizzaandroidyp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.orderBtn.setOnClickListener {

            var pizzaSizePrice = 0.0
            var toppingTotal = 0.0

            when {
                binding.radioBtnSmall.isChecked -> pizzaSizePrice = 5.0
                binding.radioBtnMedium.isChecked -> pizzaSizePrice = 7.0
                binding.radioBtnLarge.isChecked -> pizzaSizePrice = 10.0
            }

            if (binding.checkBox1.isChecked) {
                toppingTotal += 1.0
            }
            if (binding.checkBox2.isChecked) {
                toppingTotal += 2.0
            }
            if (binding.checkBox3.isChecked) {
                toppingTotal += 3.0
            }

            binding.totalLbl.text = "Total Order Price: RM ${pizzaSizePrice + toppingTotal}"
        }
    }
}