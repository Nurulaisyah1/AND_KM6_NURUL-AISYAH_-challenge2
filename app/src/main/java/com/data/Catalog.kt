package coding.aisyah.foodchallenge.data

import androidx.annotation.DrawableRes
import java.util.UUID

data class Catalog(
    var id : String = UUID.randomUUID().toString(),

    @DrawableRes
    var img : Int,

    var price : Double,

    var name : String,
)
