package creational.abstractfactory

fun main() {
    val guiComponentFactory = GuiComponentFactory()
    val linuxButton = guiComponentFactory.generateButton(OsType.Linux)
    val windowButton = guiComponentFactory.generateButton(OsType.Windows)
    println(linuxButton.render())
    println(windowButton.render())

    val linuxCheckBox = guiComponentFactory.generateCheckBox(OsType.Linux)
    val windowCheckBox = guiComponentFactory.generateCheckBox(OsType.Windows)
    println(linuxCheckBox.render())
    println(windowCheckBox.render())
}
