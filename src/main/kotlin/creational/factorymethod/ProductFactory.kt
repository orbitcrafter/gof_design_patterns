package creational.factorymethod

class ProductFactory {
    private val creatorA: Creator = ConcreteCreatorA()
    private val creatorB: Creator = ConcreteCreatorB()

    fun create(type: String): Product {
        return when (type) {
            "A" -> creatorA.generate()
            "B" -> creatorB.generate()
            else -> throw IllegalArgumentException("Unknown product type: $type")
        }
    }
}
