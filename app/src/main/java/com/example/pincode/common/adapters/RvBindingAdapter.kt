package com.example.pincode.common.adapters

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.pincode.R
import com.example.pincode.databinding.RvElementBinding

class RvBindingAdapter(private val context: Context) : RecyclerView.Adapter<RvBindingAdapter.RvView>(){

    private lateinit var binding: RvElementBinding
    private var counter = 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvView {
        binding = RvElementBinding.bind(
            LayoutInflater
                .from(parent.context)
                .inflate(
                    R.layout.rv_element,
                    parent,
                    false
                )
        )
        return RvView(binding.root)
    }

    override fun onBindViewHolder(holder: RvView, position: Int) {
        if (++counter == 1)
            loadImg("https://static.wikia.nocookie.net/universeultimatecrossoverallstars/images/9/94/Jean_Pierre_Polnareff.png/revision/latest/top-crop/width/360/height/450?cb=20200902160534", binding.img)
        else loadImg("https://static.wikia.nocookie.net/universe-of-smash-bros-lawl/images/e/e9/Avdol.png/revision/latest/top-crop/width/360/height/450?cb=20161216031709", binding.img)
    }

    override fun getItemCount(): Int = 2

    private fun loadImg(url: String, view: ImageView){
        Glide.with(view)
            .load(url)
            .into(view)
    }

    class RvView(view: View) : RecyclerView.ViewHolder(view)
}