package io.github.formulario

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nu: EditText = findViewById(R.id.n1)
        val nm: EditText = findViewById(R.id.n2)
        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener { view -> Snackbar.make(
            view,
            "Respuesta: " + (nu.text.toString().toInt()-nm.text.toString().toInt()),
            Snackbar.LENGTH_LONG
        ).show()
        }
    }
}