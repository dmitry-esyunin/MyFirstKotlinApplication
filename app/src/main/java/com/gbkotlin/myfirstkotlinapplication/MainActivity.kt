package com.gbkotlin.myfirstkotlinapplication

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val t = TestClass("Первое текстовое поле", "Второе текстовое поле")


        val textView1 = findViewById<TextView>(R.id.textView1)
        val textView2 = findViewById<TextView>(R.id.textView2)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            textView1.text = t.FieldOne
            textView2.text = t.FieldTwo
        }


        val list = ArrayList<TestClass>()
        list.add(TestClass("aaaa", "pppp"))
        list.add(TestClass("bbbb", "pppp"))
        list.add(TestClass("cccc", "pppp"))
        list.add(TestClass("dddd", "pppp"))
        list.add(TestClass("eeee", "pppp"))


        for (item in list) {
            print(item.FieldOne)
        }

        for (i in 1..10) {
            print(i)
        }

    }
}