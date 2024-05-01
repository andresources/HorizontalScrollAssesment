package com.horizontalscrollassesment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.horizontalscrollassesment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val galleryList = ArrayList<GalleryDetails>()
    private lateinit var galleryAdapter: GalleryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        prepareDataSet()
        galleryAdapter = GalleryAdapter(galleryList)
        with(binding) {
            rv.layoutManager = LinearLayoutManager(this@MainActivity,LinearLayoutManager.HORIZONTAL,false)
            rv.adapter = galleryAdapter
        }
    }
    fun prepareDataSet(){
        galleryList.apply {
            add(
                GalleryDetails(
                    image = R.drawable.i1
                )
            )
            add(
                GalleryDetails(
                    image = R.drawable.i2
                )
            )
            add(
                GalleryDetails(
                    image = R.drawable.i3
                )
            )
        }
    }
}