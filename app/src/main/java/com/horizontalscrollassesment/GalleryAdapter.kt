package com.horizontalscrollassesment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.horizontalscrollassesment.databinding.ItemGalleryBinding

class GalleryAdapter (private val gallery: List<GalleryDetails>) :
    RecyclerView.Adapter<GalleryAdapter.GalleryViewHolder>() {
    private lateinit var binding: ItemGalleryBinding
    inner class GalleryViewHolder(private val localBinding: ItemGalleryBinding) : RecyclerView.ViewHolder(localBinding.root) {
        fun bindData(gallery: GalleryDetails) {
            with(localBinding) {
                iv.setImageResource(gallery.image)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GalleryViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        binding =ItemGalleryBinding.inflate(layoutInflater,parent,false)
        return GalleryViewHolder(binding)
    }

    override fun getItemCount(): Int = gallery.size

    override fun onBindViewHolder(holder: GalleryViewHolder, position: Int) {
        val data = gallery[position]
        holder.bindData(data)
    }
}