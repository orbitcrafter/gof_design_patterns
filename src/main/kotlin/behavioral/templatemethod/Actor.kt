package behavioral.templatemethod

abstract class Actor {
    fun fight() {
        prepare()
        attack()
        defend()
    }

    abstract fun prepare()
    abstract fun attack()
    abstract fun defend()
}
