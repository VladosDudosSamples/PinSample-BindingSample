package com.example.pincode.common.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
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
        binding.rvText.text = (++counter).toString()
    }

    override fun getItemCount(): Int = 2

    class RvView(view: View) : RecyclerView.ViewHolder(view)
}