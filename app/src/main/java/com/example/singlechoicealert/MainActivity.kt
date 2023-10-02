package com.example.singlechoicealert

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById<Button>(R.id.btn)
        button.setOnClickListener {
            var alert = AlertDialog.Builder(this)
            val array = arrayOf("Hindi", "math", "english", "Hindi", "bhojpuri")
            var bol = booleanArrayOf(false, true, false, true)
            alert.setSingleChoiceItems(array, 3) { dialog, which ->
                Toast.makeText(this, "${array[which]} Select", Toast.LENGTH_SHORT).show()
            }
            alert.setPositiveButton("Ok") { dialog, which ->
            }
            alert.setNegativeButton("Cancel") { dialog, which ->
                Toast.makeText(this, "Cancel", Toast.LENGTH_SHORT).show()
            }
            var dialog = alert.create()
            dialog.show()
        }
    }
}