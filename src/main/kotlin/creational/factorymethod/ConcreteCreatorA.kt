package creational.factorymethod

class ConcreteCreatorA : Creator {
    override fun generate(): Product {
        return ProductA()
    }
}
