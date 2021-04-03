package com.gullerkilic.kotlinsimplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var numberOne : Int? = null
    var numberTwo : Int? = null
    var result : Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun mySum ( view : View){
        numberOne = editTextNumber.text.toString().toIntOrNull()
        numberTwo = editTextNumber2.text.toString().toIntOrNull()

        if (numberOne == null || numberTwo == null){
            textView.text = "Error!"
        }else {}
        result = numberOne!! + numberTwo!!
        textView.text = "Result : $result"

    }

    fun mySub (view : View){
        numberOne = editTextNumber.text.toString().toIntOrNull()
        numberTwo = editTextNumber2.text.toString().toIntOrNull()

        if ( numberOne == null || numberTwo == null){
            textView.text  ="Error!"
        }else {
            result = numberOne!! - numberTwo!!
            textView.text = "Result : $result"
        }

    }

    fun myMultiply (view : View){
        numberOne = editTextNumber.text.toString().toIntOrNull()
        numberTwo = editTextNumber2.text.toString().toIntOrNull()

        if ( numberOne == null || numberTwo == null){
            textView.text  ="Error!"
        }else {
            result = numberOne!!  *numberTwo!!
            textView.text = "Result : $result"
        }

    }

    fun myDivision (view : View){
        numberOne = editTextNumber.text.toString().toIntOrNull()
        numberTwo = editTextNumber2.text.toString().toIntOrNull()

        if ( numberOne == null || numberTwo == null){
            textView.text  ="Error!"
        }else {
            result = numberOne!! / numberTwo!!
            textView.text = "Result : $result"
        }

    }
}