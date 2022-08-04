package com.example.myapplication2 
 
import androidx.appcompat.app.AppCompatActivity 
import android.os.Bundle 
import android.widget.Button 
import android.widget.TextView 
 
class MainActivity : AppCompatActivity() { 
    override fun onCreate(savedInstanceState: Bundle?) { 
        super.onCreate(savedInstanceState) 
        setContentView(R.layout.activity_main) 
 
        val t2 =findViewById<TextView>(R.id.textView) as TextView 
        val b1 =findViewById<Button>(R.id.button1) as Button 
        val b2 =findViewById<Button>(R.id.button2) as Button 
 
        b1?.setOnClickListener{ 
            firstFun() 
        } 
 
        b2?.setOnClickListener{ 
            birthdayGreeting("anu",12) 
        } 
 
               } 
 
    fun firstFun() 
    { 
        val t1=findViewById<TextView>(R.id.textView) as TextView 
        t1.text="This Works!" 
    } 
    fun birthdayGreeting(name:String, age: Int): String{ 
        val nameGreeting = "Happy Birthday, $name!" 
        val age ="You are now $age years old!" 
        return "$nameGreeting\nage" 
    } 
 
} 
