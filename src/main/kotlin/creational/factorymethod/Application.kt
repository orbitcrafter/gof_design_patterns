package creational.factorymethod

fun main() {
    val productFactory = ProductFactory()
    val productA = productFactory.create("A")
    val productB = productFactory.create("B")

    println("productA: ${productA.name()}")
    println("productB: ${productB.name()}")
}
