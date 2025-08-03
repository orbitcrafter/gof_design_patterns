package 생성.singleton

class Setting private constructor() {
    var configurationA = true
    var configurationB = false

    fun setA(value: Boolean) {
        configurationA = value
    }

    fun setB(value: Boolean) {
        configurationA = value
    }

    companion object {
        val INSTANCE = Setting()
    }
}

// or

object SettingObject {
    var configurationA = true
    var configurationB = false

    fun setA(value: Boolean) {
        configurationA = value
    }

    fun setB(value: Boolean) {
        configurationA = value
    }
}
