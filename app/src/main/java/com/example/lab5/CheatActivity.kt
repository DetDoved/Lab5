package com.example.lab5

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

private const val SUM= "com.bignerdranch.android.lab5.sum"
class CheatActivity : AppCompatActivity() {
    private lateinit var sumtext: TextView
    private var summ = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cheat)
        sumtext = findViewById(R.id.sum)
        summ = intent.getDoubleExtra(SUM,0.0)
            sumtext.setText(summ.toString())


    }
    companion object {
        fun newIntent(
            packageContext: Context,
            sum: Double
        ): Intent {
            return Intent(packageContext, CheatActivity::class.java).apply {
                putExtra(SUM, sum)
            }
        }
    }
}

