package creational.abstractfactory

class WindowGuiFactory : GuiFactory {
    override fun generateButton(): Button = WindowButton()

    override fun generateCheckBox(): CheckBox = WindowsCheckBox()
}
