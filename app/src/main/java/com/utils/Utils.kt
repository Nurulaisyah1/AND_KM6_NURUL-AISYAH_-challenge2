package coding.aisyah.foodchallenge.utils

import coding.aisyah.foodchallenge.R
import coding.aisyah.foodchallenge.data.Catalog
import coding.aisyah.foodchallenge.data.Category

object Utils {

    val categoryList = listOf(
        Category(img = R.drawable.img_rice, name = "Rice"),
        Category(img = R.drawable.img_mie, name = "Mie"),
        Category(img = R.drawable.img_drink, name = "Drink"),
        Category(img = R.drawable.img_snack, name = "Snack") ,
        Category(img = R.drawable.img_snack, name = "Snack"),
        Category(img = R.drawable.img_snack, name = "Snack")
    )

    val catalogList = listOf(
        Catalog(img = R.drawable.img_drink, price = 15000.00,name = "Kentang Goreng"),
        Catalog(img = R.drawable.img_drink,price = 20000.00,name =  "Kue Bandung"),
        Catalog(img = R.drawable.img_snack,price =  20000.00,name =  "Martabak"),
        Catalog(img = R.drawable.img_rice,price =  5000.00,name =  "Nasi"),
        Catalog(img = R.drawable.img_drink,price =  3000.00,name =  "Es Teh"),
        Catalog(img = R.drawable.img_mie,price =  10000.00,name =  "Mie Goreng"),
        Catalog(img = R.drawable.img_drink,price =  5000.00,name =  "Onde Onde"),
        Catalog(img = R.drawable.img_drink,price =  5000.00,name =  "Pisang Molen"),
        Catalog(img = R.drawable.img_drink,price =  10000.00,name =  "Tahu Petis"),
        Catalog(img = R.drawable.img_drink,price =  5000.00,name =  "Lumpia")
    )
}