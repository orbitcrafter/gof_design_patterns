package structural.decorator

abstract class BaseCoffeeDecorator(
    private val coffee: Coffee,
) : Coffee {
    override fun getName(): String = coffee.getName()
    override fun getDescription(): String = coffee.getDescription()
}
