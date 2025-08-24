package creational.abstractfactory

class LinuxGuiFactory : GuiFactory {
    override fun generateButton(): Button = LinuxButton()

    override fun generateCheckBox(): CheckBox = LinuxCheckBox()
}
