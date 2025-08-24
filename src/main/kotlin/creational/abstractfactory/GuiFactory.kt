package creational.abstractfactory

interface GuiFactory {
    fun generateButton(): Button
    fun generateCheckBox(): CheckBox
}
