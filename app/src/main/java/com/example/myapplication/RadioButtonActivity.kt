package com.example.myapplication

import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RadioButtonActivity : AppCompatActivity() {
    lateinit var radioDog:RadioButton
    lateinit var radioBone:RadioButton
    lateinit var radioMeat:RadioButton
    lateinit var radioBelt:RadioButton
    lateinit var imageViewRadio:ImageView




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_radio_button)
        radioDog = findViewById(R.id.Buttondog)
        radioBone = findViewById(R.id.Buttonbone)
        radioMeat = findViewById(R.id.Buttonmeat)
        radioBelt = findViewById(R.id.Buttonbelt)
        imageViewRadio = findViewById(R.id.imageViewRadio)

        radioDog.setOnClickListener{
            imageViewRadio.setImageResource(R.drawable.img)
        }

        radioDog.setOnClickListener{
            imageViewRadio.setImageResource(R.drawable.bone)
        }

        radioDog.setOnClickListener{
            imageViewRadio.setImageResource(R.drawable.meat)
        }
        radioDog.setOnClickListener{
            imageViewRadio.setImageResource(R.drawable.belt)
        }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.EMAIL)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}