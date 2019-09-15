package com.example.databinding1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.databinding1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        //setContentView(R.layout.activity_main)
        binding.button.setOnClickListener{
            abc(it)
        }
    }
    private fun abc(smallview:View){
        binding.apply {
            invalidateAll()
            hello.text = binding.editText.text
            editText.visibility = View.GONE
            button.visibility = View.GONE
        }
    }
}
