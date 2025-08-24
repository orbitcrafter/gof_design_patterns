package creational.factorymethod

class ConcreteCreatorB : Creator {
    override fun generate(): Product = ProductB()
}
