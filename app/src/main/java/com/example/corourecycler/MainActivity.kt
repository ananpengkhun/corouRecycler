package com.example.corourecycler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.uploadfile.UploadActivity
import com.google.gson.GsonBuilder
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val model = ViewModelProvider.NewInstanceFactory().create(MainViewModel::class.java)

        model.firstTodo.observe(this, Observer {resource ->
            when(resource.status){
                Status.SUCCESS -> {

                }

                Status.LOADING -> {

                }

                Status.ERROR -> {

                }
            }
        })


        btn_retry.setOnClickListener {
            model.retry()
        }

        btn_upload.setOnClickListener {
            val intent = Intent(this,UploadActivity::class.java)
            startActivity(intent)

        }
    }
}
