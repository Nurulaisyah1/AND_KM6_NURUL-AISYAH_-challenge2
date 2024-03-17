package coding.aisyah.foodchallenge.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coding.aisyah.foodchallenge.data.Catalog
import coding.aisyah.foodchallenge.databinding.ListItemCatalogBinding
import coding.aisyah.foodchallenge.extenstions.toIndonesianFormat

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