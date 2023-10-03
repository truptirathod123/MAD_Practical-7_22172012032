package com.example.mad_practical_7_22172012032

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    val myVideoView: VideoView = findViewById(R.id.myVideoView)
    val mediaController = MediaController(this)
    val 	uri: 	Uri 	= 	Uri.parse("android.resource://"+ 	packageName+"/"+ R.raw.thestoryoflight)
        mediaController.setAnchorView(myVideoView)
        myVideoView.setMediaController(mediaController)
        myVideoView.setVideoURI(uri)
        myVideoView.requestFocus()
    myVideoView.start()
}
}



