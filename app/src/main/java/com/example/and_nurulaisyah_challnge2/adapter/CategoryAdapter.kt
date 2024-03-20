package com.example.and_nurulaisyah_challnge2.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.and_nurulaisyah_challnge2.data.Category
import com.example.and_nurulaisyah_challnge2.databinding.ListItemCategoryBinding

class CategoryAdapter(
    private val data : List<Category>,
    private val listener : OnClick
) : RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {

    inner class CategoryViewHolder(val binding : ListItemCategoryBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        return CategoryViewHolder(ListItemCategoryBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.binding.apply {
            val (_,img,name) = data[position]
            ivCategoryAvatars.setImageResource(img)
            tvName.text = name
            card.setOnClickListener {
                listener.onDetail(data[position])
            }

        }
    }

    interface OnClick{
        fun onDetail(category : Category)
    }
}