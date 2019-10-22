package com.example.nestedscrollview

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val edtTitle = findViewById<EditText>(R.id.edtTitle)
        val edtDirected = findViewById<EditText>(R.id.edtDirected)
        val edtProduction = findViewById<EditText>(R.id.edtProduction)
        val rg1 = findViewById<RadioGroup>(R.id.rg1)
        val rg2 = findViewById<RadioGroup>(R.id.rg2)
        val rg4 = findViewById<RadioGroup>(R.id.rg4)
        val date = findViewById<EditText>(R.id.edtDate)
        val spinnegara = findViewById<Spinner>(R.array.spinner_negara)

        btnProses.setOnClickListener {
            val title = edtTitle.text.toString()
            val directed = edtDirected.text.toString()
            val production = edtProduction.text.toString()
            val radiog1 = rg1.checkedRadioButtonId.toString()
            val radiog2 = rg2.checkedRadioButtonId.toString()
            val radiog4 = rg4.checkedRadioButtonId.toString()
            val spinn = arrayOf(spinnegara).toString()
            val datee = date.text.toString()


            val intent = Intent(this@MainActivity, ActivityKedua::class.java)
            intent.putExtra("Title", title)
            intent.putExtra("Directed", directed)
            intent.putExtra("Production", production)
            intent.putExtra("Genre", radiog1 + radiog2)
            intent.putExtra("Age", radiog4)
            intent.putExtra("Country", spinn)
            intent.putExtra("Date Release", datee)
            startActivity(intent)

        }
    }
}
