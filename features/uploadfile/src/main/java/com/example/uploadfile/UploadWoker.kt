package com.example.uploadfile

import android.annotation.SuppressLint
import android.content.Context
import androidx.work.Data
import androidx.work.Worker
import androidx.work.WorkerParameters
import androidx.work.workDataOf

class UploadWoker(context: Context, workerParams: WorkerParameters) : Worker(context, workerParams) {

    override fun doWork(): Result {
        val data = Data.Builder()
            .putString("UploadWoker","UploadWokerUploadWokerUploadWoker")
            .build()
        return Result.success(data)
    }
}