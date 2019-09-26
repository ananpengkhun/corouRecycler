package com.example.uploadfile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.work.*
import java.util.concurrent.TimeUnit

class UploadActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_upload)

        val workmanager = WorkManager.getInstance(this)
        val task = OneTimeWorkRequest.Builder(UploadWoker::class.java).build()

        workmanager.enqueue(task)

        workmanager.getWorkInfoByIdLiveData(task.id).observe(this, Observer {
            println("workerrrr : ${it.outputData.getString("UploadWoker")}")

        })

    }
}
