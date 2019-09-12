package com.beedevelopers.taks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        TasksController.tasks.add(Task("XD","a",false))
        TasksController.tasks.add(Task("Den like en Facebook Beedevelopers","a",false))


        val strings = mutableListOf<String>()

        for (task in TasksController.tasks){
            strings.add(task.taskName)
        }

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, strings)

        listView.adapter = adapter
    }
}
