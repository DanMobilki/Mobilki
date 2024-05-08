package com.example.msip

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    var tt: TextView? = null
    var ed: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tt = findViewById(R.id.textView2)
        ed = findViewById(R.id.editTextText)

    }
    fun ClickButton(view: View) {
        when(ed?.text.toString()){
            "d"  -> {
                tt?.text = "Это дуб"
            }
            "D"  -> {
                tt?.text = "Это дуб"
            }
            else -> {
                tt?.text = "повторите попытку"
            }
        }
    }
}
