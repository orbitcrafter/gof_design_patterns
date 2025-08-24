package creational.abstractfactory

class GuiComponentFactory {
    private val windowGuiFactory = WindowGuiFactory()
    private val linuxGuiFactory = LinuxGuiFactory()

    fun generateButton(osType: OsType): Button {
        return when (osType) {
            OsType.Windows -> windowGuiFactory.generateButton()
            OsType.Linux -> linuxGuiFactory.generateButton()
        }
    }

    fun generateCheckBox(osType: OsType): CheckBox {
        return when (osType) {
            OsType.Linux -> linuxGuiFactory.generateCheckBox()
            OsType.Windows -> windowGuiFactory.generateCheckBox()
        }
    }
}
