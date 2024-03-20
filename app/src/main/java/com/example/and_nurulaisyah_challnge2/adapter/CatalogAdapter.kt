package com.example.and_nurulaisyah_challnge2.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.and_nurulaisyah_challnge2.R
import com.example.and_nurulaisyah_challnge2.data.Catalog

class CatalogAdapter(
    private val data : List<Catalog>,
    private val listener : OnClick,
    private val layoutManager: GridLayoutManager
) : RecyclerView.Adapter<CatalogAdapter.ItemViewHolder>() {

    inner class ItemViewHolder(itemView: View, viewType: Int) : RecyclerView.ViewHolder(itemView) {
        val iv: ImageView
        val title: TextView
        val info: TextView
        val card: CardView

        init {

            card = if (viewType == VIEW_TYPE_BIG) {
                itemView.findViewById(R.id.cardc2)
            } else {
                itemView.findViewById(R.id.cardc)
            }

            iv = if (viewType == VIEW_TYPE_BIG) {
                itemView.findViewById(R.id.iv_catalog_image2)
            } else {
                itemView.findViewById(R.id.iv_catalog_image)
            }
            title = if (viewType == VIEW_TYPE_BIG) {
                itemView.findViewById(R.id.tv_catalog_name2)
            } else {
                itemView.findViewById(R.id.tv_catalog_name)
            }
            info = if (viewType == VIEW_TYPE_BIG) {
                itemView.findViewById(R.id.tv_catalog_price2)
            } else {
                itemView.findViewById(R.id.tv_catalog_price)
            }

        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = if (viewType == VIEW_TYPE_BIG) {
            inflater.inflate(R.layout.list_item_catalog2, parent, false)
        } else {
            inflater.inflate(R.layout.list_item_catalog, parent, false)
        }
        return ItemViewHolder(view, viewType)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = data[position % 4]
        holder.title.text = item.name
        holder.iv.setImageResource(item.img)
        holder.info.text = item.price.toString()
        holder.card.setOnClickListener { listener.onDetail(data[position]) }

    }

    override fun getItemViewType(position: Int): Int {
        val spanCount = layoutManager.spanCount
        return if (spanCount == SPAN_COUNT_ONE) {
            VIEW_TYPE_BIG
        } else {
            VIEW_TYPE_SMALL
        }
    }

    companion object {
        const val SPAN_COUNT_ONE = 1
        const val SPAN_COUNT_THREE = 2
        const val VIEW_TYPE_SMALL = 1
        const val VIEW_TYPE_BIG = 2
    }

    interface OnClick{
        fun onDetail(catalog: Catalog)
    }

}