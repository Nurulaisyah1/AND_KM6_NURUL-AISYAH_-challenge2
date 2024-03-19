package com.example.and_nurulaisyah_challnge2.utils

import com.example.and_nurulaisyah_challnge2.R
import com.example.and_nurulaisyah_challnge2.data.Catalog
import com.example.and_nurulaisyah_challnge2.data.Category

object Utils {

    val categoryList = listOf(
        Category(img = R.drawable.img_rice, name = "Rice"),
        Category(img = R.drawable.img_noodle, name = "Mie"),
        Category(img = R.drawable.img_drink, name = "Drink"),
        Category(img = R.drawable.img_snack, name = "Snack") ,
        Category(img = R.drawable.img_seafood, name = "Seafood"),
        Category(img = R.drawable.img_bread, name = "bread")
    )

    val catalogList = listOf(
        Catalog(img = R.drawable.img_frenchfries, price = 15000.00,name = "Kentang Goreng"),
        Catalog(img = R.drawable.img_cheeseburger,price = 20000.00,name =  "burger"),
        Catalog(img = R.drawable.img_dumplings,price =  20000.00,name =  "dumplings"),
        Catalog(img = R.drawable.img_salmon_sushi,price =  5000.00,name =  "salmon sushi"),
        Catalog(img = R.drawable.img_fried_chicken,price =  3000.00,name =  "chiken"),
        Catalog(img = R.drawable.img_cappucino,price =  10000.00,name =  "cappucino"),
        Catalog(img = R.drawable.img_coffee_latte_with_croissant,price =  5000.00,name =  "coffee latte"),
        Catalog(img = R.drawable.img_dim_sum_dumplings,price =  5000.00,name =  "dimsum"),
        Catalog(img = R.drawable.img_grilled_whole_chicken,price =  10000.00,name =  "chiken saus"),
        Catalog(img = R.drawable.img_icetea,price =  5000.00,name =  "ice tea")
    )
}