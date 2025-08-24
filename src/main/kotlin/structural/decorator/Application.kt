package structural.decorator

fun main() {
    val coffee = SimpleCoffee()
    val milkCoffeeDecorator = MilkCoffeeDecorator(coffee)
    println(milkCoffeeDecorator.getName())
    println(milkCoffeeDecorator.getDescription())
}
