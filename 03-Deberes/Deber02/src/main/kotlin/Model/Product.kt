package Model

data class Product(
    val id: Int,
    val name: String,
    val price: Double,
    val stock: Int,
    val isAvailable: Boolean
)