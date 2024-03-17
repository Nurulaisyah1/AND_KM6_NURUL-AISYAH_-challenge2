package coding.aisyah.foodchallenge.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coding.aisyah.foodchallenge.data.Category
import coding.aisyah.foodchallenge.databinding.ListItemCategoryBinding

class CategoryAdapter(private val data : List<Category>) : RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {

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

        }
    }
}