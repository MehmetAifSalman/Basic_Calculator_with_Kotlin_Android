package com.example.odev5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.odev5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.button0.setOnClickListener {
            if(binding.gosterge.text == "0"){
                binding.gosterge.text = binding.button0.text.toString()
            }
            else{
                binding.gosterge.text = binding.gosterge.text.toString() + binding.button0.text.toString()
            }

        }
        binding.button1.setOnClickListener {
            if(binding.gosterge.text == "0"){
                binding.gosterge.text = binding.button1.text.toString()
            }
            else{
                binding.gosterge.text =  binding.gosterge.text.toString() + binding.button1.text.toString()
            }

        }
        binding.button2.setOnClickListener {
            if(binding.gosterge.text == "0"){
                binding.gosterge.text = binding.button1.text.toString()
            }
            else{
                binding.gosterge.text =  binding.gosterge.text.toString() + binding.button2.text.toString()
            }

        }
        binding.button3.setOnClickListener {
            if(binding.gosterge.text == "0"){
                binding.gosterge.text = binding.button1.text.toString()
            }
            else{
                binding.gosterge.text =  binding.gosterge.text.toString() + binding.button3.text.toString()
            }

        }
        binding.button4.setOnClickListener {
            if(binding.gosterge.text == "0"){
                binding.gosterge.text = binding.button1.text.toString()
            }
            else{
                binding.gosterge.text =  binding.gosterge.text.toString() + binding.button4.text.toString()
            }

        }
        binding.button5.setOnClickListener {
            if(binding.gosterge.text == "0"){
                binding.gosterge.text = binding.button1.text.toString()
            }
            else{
                binding.gosterge.text =  binding.gosterge.text.toString() + binding.button5.text.toString()
            }

        }
        binding.button6.setOnClickListener {
            if(binding.gosterge.text == "0"){
                binding.gosterge.text = binding.button1.text.toString()
            }
            else{
                binding.gosterge.text =  binding.gosterge.text.toString() + binding.button6.text.toString()
            }

        }
        binding.button7.setOnClickListener {
            if(binding.gosterge.text == "0"){
                binding.gosterge.text = binding.button1.text.toString()
            }
            else{
                binding.gosterge.text =  binding.gosterge.text.toString() + binding.button7.text.toString()
            }

        }
        binding.button8.setOnClickListener {
            if(binding.gosterge.text == "0"){
                binding.gosterge.text = binding.button1.text.toString()
            }
            else{
                binding.gosterge.text =  binding.gosterge.text.toString() + binding.button8.text.toString()
            }

        }
        binding.button9.setOnClickListener {
            if(binding.gosterge.text == "0"){
                binding.gosterge.text = binding.button1.text.toString()
            }
            else{
                binding.gosterge.text =  binding.gosterge.text.toString() + binding.button9.text.toString()
            }

        }
        binding.buttonTopla.setOnClickListener {
            if(binding.gosterge.text == "0"){
                binding.gosterge.text = binding.button1.text.toString()
            }
            else{
                binding.gosterge.text =  binding.gosterge.text.toString() + binding.buttonTopla.text.toString()
            }

        }
        binding.buttonEsit.setOnClickListener {
            if(binding.gosterge.text == "0"){

            }
            else{
                var sonuc = binding.gosterge.text.split("+").map{ it.toInt() }.sum()
                binding.gosterge.text = sonuc.toString()
            }
            var liste = listOf<Int>(1,2,3)


        }


        setContentView(binding.root)
    }
}