package com.zwsi.gb.feature

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.zwsi.gb.feature.GBViewModel.Companion.secondPlayer

class LoadActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_load)

        // Set up the Version View
        val version = findViewById<TextView>(R.id.version)
        version.setText(BuildConfig.VERSIONNAME) // for now: 0.0.0.~ #commits...


        // TODO Lots of code duplication here...
        val new1Button: Button = findViewById(R.id.New1Button)
        new1Button.setOnClickListener(View.OnClickListener {
            GlobalStuff.makeUniverse(it)
            secondPlayer = false
        })

        val new2Button: Button = findViewById(R.id.New2Button)
        new2Button.setOnClickListener(View.OnClickListener {
            GlobalStuff.makeUniverse(it)
        })

        val load1Button1: Button = findViewById(R.id.Load1Button1)
        load1Button1.setOnClickListener(View.OnClickListener {
            GlobalStuff.loadUniverse(it, 1)
            secondPlayer = false
        })

        val load1Button2: Button = findViewById(R.id.Load1Button2)
        load1Button2.setOnClickListener(View.OnClickListener {
            GlobalStuff.loadUniverse(it, 2)
            secondPlayer = false
        })

        val load1Button3: Button = findViewById(R.id.Load1Button3)
        load1Button3.setOnClickListener(View.OnClickListener {
            GlobalStuff.loadUniverse(it, 3)
            secondPlayer = false
        })

        val load2Button1: Button = findViewById(R.id.Load2Button1)
        load2Button1.setOnClickListener(View.OnClickListener {
            GlobalStuff.loadUniverse(it, 1)
            secondPlayer = true
        })

        val load2Button2: Button = findViewById(R.id.Load2Button2)
        load2Button2.setOnClickListener(View.OnClickListener {
            GlobalStuff.loadUniverse(it, 2)
            secondPlayer = true
        })

        val load2Button3: Button = findViewById(R.id.Load2Button3)
        load2Button3.setOnClickListener(View.OnClickListener {
            GlobalStuff.loadUniverse(it, 3)
            secondPlayer = true
        })


    }

}
