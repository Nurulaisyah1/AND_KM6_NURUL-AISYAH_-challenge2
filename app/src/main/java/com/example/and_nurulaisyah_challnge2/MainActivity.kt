package com.example.and_nurulaisyah_challnge2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.and_nurulaisyah_challnge2.adapter.CatalogAdapter
import com.example.and_nurulaisyah_challnge2.adapter.CategoryAdapter
import com.example.and_nurulaisyah_challnge2.databinding.ActivityMainBinding
import com.example.and_nurulaisyah_challnge2.utils.Utils.catalogList
import com.example.and_nurulaisyah_challnge2.utils.Utils.categoryList


class MainActivity : AppCompatActivity() {
    private var _binding : ActivityMainBinding? = null
    private val binding get() = _binding!!

    private lateinit var categoryAdapter: CategoryAdapter
    private lateinit var catalogAdapter: CatalogAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        rvCategory()
        rvCatalog()
    }

    private fun rvCategory(){
        categoryAdapter = CategoryAdapter(categoryList)
        binding.rvCategory.apply {
            adapter = categoryAdapter
            layoutManager = LinearLayoutManager(this@MainActivity,LinearLayoutManager.HORIZONTAL,false)
        }
    }

    private fun rvCatalog(){
        catalogAdapter = CatalogAdapter(catalogList)
        binding.rvCatalog.apply {
            adapter = catalogAdapter
            layoutManager = GridLayoutManager(this@MainActivity,2)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}