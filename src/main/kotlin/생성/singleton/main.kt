package 생성.singleton

fun main() {
    val setting1 = Setting
    val setting2 = Setting
    println(setting1 == setting2)

    val settingObject1 = SettingObject
    val settingObject2 = SettingObject
    println(settingObject1 == settingObject2)
}
