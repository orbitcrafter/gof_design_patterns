package behavioral.templatemethod

fun main() {
    val archer = Archer()
    val wizard = Wizard()

    archer.fight()
    println("---")
    wizard.fight()
}
