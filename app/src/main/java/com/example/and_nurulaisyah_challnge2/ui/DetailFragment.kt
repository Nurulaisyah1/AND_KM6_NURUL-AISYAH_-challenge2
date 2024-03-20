package com.example.and_nurulaisyah_challnge2.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.and_nurulaisyah_challnge2.R
import com.example.and_nurulaisyah_challnge2.data.Catalog
import com.example.and_nurulaisyah_challnge2.data.Category
import com.example.and_nurulaisyah_challnge2.databinding.FragmentDetailBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class DetailFragment : Fragment() {

    private lateinit var binding : FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        val bottomNav = view.rootView.findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNav?.visibility = View.GONE
    }


    private fun initView(){

        val category = arguments?.getParcelable<Category>(HomeFragment.DATA_CATEGORY)

        setupView(category)

    }

    private fun setupView(category: Category?){
        binding.apply {
           if(category != null){
               img.setImageResource(category.img)
               tvName.text = category.name
               tvAppBar.text = "Detail Category"
           }else{
               Toast.makeText(requireActivity(), "Route not found", Toast.LENGTH_SHORT).show()
           }

            imgBack.setOnClickListener { findNavController().navigateUp() }

            restaurantLocation.setOnClickListener {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://maps.app.goo.gl/h4wQKqaBuXzftGK77"))
                startActivity(intent)
            }

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        val bottomNav = requireActivity().findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNav?.visibility = View.VISIBLE
    }


}