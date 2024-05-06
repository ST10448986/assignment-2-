package com.example.tamagotchiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.Toast




class MainActivity : AppCompatActivity() {
    private lateinit var petImageView: ImageView
    private lateinit var hungerBar: ProgressBar
    private lateinit var happinessBar: ProgressBar
    private lateinit var cleanlinessBar: ProgressBar
    private lateinit var button1 :Button
    private lateinit var button2 :Button
    private lateinit var button3 :Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1 = findViewById(R.id.feed)
        button2 = findViewById(R.id.clean)
        button3 = findViewById(R.id.play)

        var hunger = 50
        hungerBar.progress = hunger
        var happy = 50
        happinessBar.progress = happy
        var clean = 50
        cleanlinessBar.progress = clean



        // Initialize UI elements
        petImageView = findViewById(R.id.petImageView)
        hungerBar = findViewById(R.id.hungerBar)
        happinessBar = findViewById(R.id.happinessBar)
        cleanlinessBar = findViewById(R.id.cleanlinessBar)





        // Set up button click listeners
        button1.setOnClickListener {
            //feedPet()
            petImageView.setImageResource(R.drawable.cateating)
            hunger++
            hungerBar.progress = hunger

        }
        button2.setOnClickListener {
            petImageView.setImageResource(R.drawable.catplaying)
            happy++

            happinessBar.progress = happy
        }

        button3.setOnClickListener {
            petImageView.setImageResource(R.drawable.catclean)
            clean++
            cleanlinessBar.progress = clean
        }
    }

    /*private fun updateUI() {
        // Update pet image
        // petImageView.setImageResource(...)

        // Update progress bars
        hungerBar.progress = pet.hunger
        happinessBar.progress = pet.happiness
        healthBar.progress = pet.health
        cleanlinessBar.progress = pet.cleanliness
    }

    private fun feedPet() {
        pet.hunger = Pet.MAX_STATUS
        updateUI()
        Toast.makeText(this, "You fed ${pet.name}!", Toast.LENGTH_SHORT).show()
    }

    private fun playWithPet() {
        pet.happiness = Pet.MAX_STATUS
        updateUI()
        Toast.makeText(this, "You played with ${pet.name}!", Toast.LENGTH_SHORT).show()
    }

    private fun cleanPet() {
        pet.cleanliness = Pet.MAX_STATUS
        updateUI()
        Toast.makeText(this, "You cleaned ${pet.name}!", Toast.LENGTH_SHORT).show()
    }*/


}

