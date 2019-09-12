package com.beedevelopers.taks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_task.*

class TaskActivity : AppCompatActivity() {

    private var task: Task? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task)

        task = intent.extras?.getSerializable("task") as? Task


        taskName_tv.text = task?.taskName
        details_tv.text = task?.details

    }
}
