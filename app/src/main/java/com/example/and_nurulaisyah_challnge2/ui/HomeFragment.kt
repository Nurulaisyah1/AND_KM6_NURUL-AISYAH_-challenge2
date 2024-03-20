package com.example.and_nurulaisyah_challnge2.ui


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.and_nurulaisyah_challnge2.R
import com.example.and_nurulaisyah_challnge2.adapter.CatalogAdapter
import com.example.and_nurulaisyah_challnge2.adapter.CatalogAdapter.Companion.SPAN_COUNT_ONE
import com.example.and_nurulaisyah_challnge2.adapter.CatalogAdapter.Companion.SPAN_COUNT_THREE
import com.example.and_nurulaisyah_challnge2.adapter.CategoryAdapter
import com.example.and_nurulaisyah_challnge2.data.Catalog
import com.example.and_nurulaisyah_challnge2.data.Category
import com.example.and_nurulaisyah_challnge2.databinding.FragmentHomeBinding
import com.example.and_nurulaisyah_challnge2.utils.Utils.catalogList
import com.example.and_nurulaisyah_challnge2.utils.Utils.categoryList


class HomeFragment : Fragment() {

    private lateinit var binding : FragmentHomeBinding

    private lateinit var categoryAdapter: CategoryAdapter

    private lateinit var catalogAdapter: CatalogAdapter

    private lateinit var gridLayoutManager: GridLayoutManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        gridLayoutManager = GridLayoutManager(requireActivity(), SPAN_COUNT_ONE)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rvCategory()
        rvCatalog()
        binding.imgCategory.setOnClickListener {
            switchLayout()
            switchIcon()
        }

    }

    private fun rvCategory(){
        categoryAdapter = CategoryAdapter(categoryList,object : CategoryAdapter.OnClick{
            override fun onDetail(category: Category) {
                val bundle = Bundle().apply {
                    putParcelable(DATA_CATEGORY, category)
                }
                findNavController().navigate(
                    R.id.action_homeFragment2_to_detailFragment,
                    bundle
                )
            }

        })
        binding.rvCategory.apply {
            adapter = categoryAdapter
            layoutManager = LinearLayoutManager(requireActivity(),LinearLayoutManager.HORIZONTAL,false)
        }
    }

    private fun rvCatalog(){
        catalogAdapter = CatalogAdapter(catalogList,object : CatalogAdapter.OnClick{
            override fun onDetail(catalog: Catalog) {
//                val bundle = Bundle().apply {
//                    putParcelable(DATA_CATALOG, catalog)
//                }
//                findNavController().navigate(
//                    R.id.action_homeFragment2_to_detailFragment,
//                    bundle
//                )
                startActivity(Intent(requireActivity(),DetailActivity::class.java).also{
                    it.putExtra(DATA_CATALOG,catalog)
                })
            }

        },gridLayoutManager)
        binding.rvCatalog.apply {
            adapter = catalogAdapter
            layoutManager = gridLayoutManager
        }
    }

    private fun switchLayout() {
        if (gridLayoutManager.spanCount == SPAN_COUNT_ONE) {
            gridLayoutManager.spanCount = SPAN_COUNT_THREE
        } else {
            gridLayoutManager.spanCount = SPAN_COUNT_ONE
        }
        catalogAdapter.notifyItemRangeChanged(0, catalogAdapter.itemCount)
    }

    private fun switchIcon() {
        if (gridLayoutManager.spanCount == SPAN_COUNT_THREE) {
            binding.imgCategory.setImageResource(R.drawable.ic_category)
        } else {
            binding.imgCategory.setImageResource(R.drawable.ic_back)
        }
    }

    companion object{
        const val DATA_CATEGORY = "category"
        const val DATA_CATALOG = "catalog"
    }




}