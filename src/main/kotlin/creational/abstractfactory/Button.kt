package creational.abstractfactory

interface Button {
    fun render(): String
}

class WindowButton : Button {
    override fun render(): String = "WindowButton"
}

class LinuxButton : Button {
    override fun render(): String = "LinuxButton"
}
