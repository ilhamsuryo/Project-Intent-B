package com.example.nestedscrollview

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ActivityKedua : AppCompatActivity() {

   fun onCeate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kedua)

        val intent = intent
        val title = intent.getStringExtra("Title")
        val directed = intent.getStringExtra("Directed by")
        val production = intent.getStringExtra("Home Production")
        val radiog1 = intent.getStringExtra("Gennre")
        val radiog2 = intent.getStringExtra("Gennre")
        val radiog4 = intent.getStringExtra("Age")
        val spinn = intent.getStringExtra("Country")
        val datee = intent.getStringExtra("Date Release")


        val tvData1 = findViewById<TextView>(R.id.tvData1)
        val tvData2 = findViewById<TextView>(R.id.tvData2)
        val tvData3 = findViewById<TextView>(R.id.tvData3)
        val tvData4 = findViewById<TextView>(R.id.tvData4)
        val tvData5 = findViewById<TextView>(R.id.tvData5)
        val tvData6 = findViewById<TextView>(R.id.tvData6)
        val tvData7 = findViewById<TextView>(R.id.tvData7)

        tvData1.text = "Title : "+title
        tvData2.text = "Directed by : "+directed
        tvData3.text = "Home Production : "+production
        tvData4.text = "Genre : "+radiog1+radiog2
        tvData5.text = "Age : "+radiog4
        tvData6.text = "Country : "+spinn
        tvData7.text = "Date Release : "+datee


    }
}
