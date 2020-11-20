package com.dharwarCraton.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val foodList = arrayListOf("Chinese", "Hamburger", "Mexican", "Pizza", "McDonald's")

       decideButton.setOnClickListener {
           val random = Random()
           val randomFood = random.nextInt(foodList.count())
           selectedFoodText.text = foodList[randomFood]
       }

        addFoodButton.setOnClickListener {
           val addedFood = addFoodText.text.toString()
            foodList.add(addedFood)
            addFoodText.text.clear()
            Toast.makeText(this, "Added!", Toast.LENGTH_SHORT).show()
            println(foodList)
        }

    }

}