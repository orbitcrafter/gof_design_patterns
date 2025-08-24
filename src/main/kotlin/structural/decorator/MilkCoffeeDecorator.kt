package structural.decorator

class MilkCoffeeDecorator(
    private val coffee: Coffee,
) : BaseCoffeeDecorator(coffee) {
    override fun getName(): String = coffee.getName() + "milk"
    override fun getDescription(): String = coffee.getDescription() + "milk"
}
