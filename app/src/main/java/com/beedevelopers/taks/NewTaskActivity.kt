package com.beedevelopers.taks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_new_task.*

class NewTaskActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_task)

        guardar_btn.setOnClickListener {
            val taskName = tarea_et.text.toString()
            val details = detalles_et.text.toString()

            val task = Task(taskName, details, false)

            TasksController.tasks.add(task)

            val dialog = AlertDialog.Builder(this).apply {
                setTitle("Mi primera tarea llamada $taskName")
                setMessage("Detalles: $details")
                setPositiveButton("Ok") { _, _ ->
                    val intent = Intent(this@NewTaskActivity, TaskActivity::class.java)
                    intent.putExtra("task", task)
                    startActivity(intent)
                }
            }

            dialog.show()
        }
    }
}
