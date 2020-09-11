package com.sem.lvl1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.sem.lvl1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.btnConfirm.setOnClickListener {
            checkAnswer()
        }
        setContentView(binding.root)
    }

    private fun checkAnswer() {
        val answer = binding.etAnswer.text.toString()

        if (answer == getString(R.string.giraffe)) {
            Toast.makeText(this, getString(R.string.correct),
            Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this, getString(R.string.incorrect),
            Toast.LENGTH_LONG).show()
        }
    }
}
