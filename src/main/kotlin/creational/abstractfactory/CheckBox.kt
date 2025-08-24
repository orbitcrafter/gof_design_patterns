package creational.abstractfactory

interface CheckBox {
    fun render(): String
}

class WindowsCheckBox : CheckBox {
    override fun render(): String = "WindowsCheckBox"
}

class LinuxCheckBox : CheckBox {
    override fun render(): String = "LinuxCheckBox"
}
