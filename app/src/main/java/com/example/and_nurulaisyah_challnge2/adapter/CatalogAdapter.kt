package com.example.and_nurulaisyah_challnge2.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.and_nurulaisyah_challnge2.extenstions.toIndonesianFormat
import com.example.and_nurulaisyah_challnge2.data.Catalog
import com.example.and_nurulaisyah_challnge2.databinding.ListItemCatalogBinding


class CatalogAdapter(private val data : List<Catalog>) : RecyclerView.Adapter<CatalogAdapter.CatalogViewHolder>() {

    inner class CatalogViewHolder(val binding : ListItemCatalogBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatalogViewHolder {
        return CatalogViewHolder(ListItemCatalogBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: CatalogViewHolder, position: Int) {
        holder.binding.apply {
            val (_,img,price,name) = data[position]
            tvCatalogName.text = name
            tvCatalogPrice.text = price.toIndonesianFormat()
            ivCatalogImage.setImageResource(img)
        }
    }
}