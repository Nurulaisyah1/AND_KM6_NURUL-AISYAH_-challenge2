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
        Category(img = R.drawable.img_bread, name = "Bread"),
        Category(img = R.drawable.img_seafood, name = "Seafood")
    )

    val catalogList = listOf(
        Catalog(img = R.drawable.img_french_fries_with_ketchup_top_view, price = 15000.00,name = "Kentang Goreng"),
        Catalog(img = R.drawable.img_dumplings,price = 20000.00,name =  "dumplings"),
        Catalog(img = R.drawable.img_cappucino,price =  20000.00,name =  "Cappucino"),
        Catalog(img = R.drawable.img_coffee_latte_with_croissant,price =  5000.00,name =  "coffe latte"),
        Catalog(img = R.drawable.img_icetea,price =  3000.00,name =  "Es Teh"),
        Catalog(img = R.drawable.img_cheeseburger,price =  10000.00,name =  "Chesse Burger"),
        Catalog(img = R.drawable.img_pizza,price =  5000.00,name =  "Pizza"),
        Catalog(img = R.drawable.img_pisangmolen,price =  5000.00,name =  "Pisang Molen"),
        Catalog(img = R.drawable.img_tahupetis,price =  10000.00,name =  "Tahu Petis"),
        Catalog(img = R.drawable.img_lumpia,price =  5000.00,name =  "Lumpia")
    )
}