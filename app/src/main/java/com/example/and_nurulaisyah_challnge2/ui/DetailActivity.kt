

package com.example.and_nurulaisyah_challnge2.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.and_nurulaisyah_challnge2.data.Catalog
import com.example.and_nurulaisyah_challnge2.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding : ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
    }

    private fun initView(){

        val catalog = intent.getParcelableExtra<Catalog>(HomeFragment.DATA_CATALOG)

        setupView(catalog)

    }

    private fun setupView(catalog : Catalog?){
        binding.apply {
            if(catalog != null){
                img.setImageResource(catalog.img)
                tvName.text = catalog.name
                val price = "Rp. ${catalog.price}"
                tvPrice.text = price
                tvAppBar.text = "Detail Catalog"
            }else{
                Toast.makeText(this@DetailActivity, "Route not found", Toast.LENGTH_SHORT).show()
            }

            imgBack.setOnClickListener { finish() }

            restaurantLocation.setOnClickListener {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://maps.app.goo.gl/h4wQKqaBuXzftGK77"))
                startActivity(intent)
            }

        }
    }


