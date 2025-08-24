package structural.bridge

// 구현 인터페이스 (TV 브랜드들이 구현해야 하는 기능)
interface TV {
    fun turnOn()
    fun turnOff()
    fun changeChannel(channel: Int)
    fun adjustVolume(volume: Int)
    fun getBrand(): String
}

// 구체적인 구현들 (실제 TV 브랜드들)
class SamsungTV : TV {
    override fun turnOn() = println("삼성 TV: 전원이 켜졌습니다 🔵")
    override fun turnOff() = println("삼성 TV: 전원이 꺼졌습니다")
    override fun changeChannel(channel: Int) = println("삼성 TV: ${channel}번 채널로 변경")
    override fun adjustVolume(volume: Int) = println("삼성 TV: 볼륨을 ${volume}으로 조절")
    override fun getBrand() = "Samsung"
}

class LGTV : TV {
    override fun turnOn() = println("LG TV: 전원 ON! 🟢")
    override fun turnOff() = println("LG TV: 전원 OFF!")
    override fun changeChannel(channel: Int) = println("LG TV: 채널 $channel 선택됨")
    override fun adjustVolume(volume: Int) = println("LG TV: 음량 레벨 $volume")
    override fun getBrand() = "LG"
}

class SonyTV : TV {
    override fun turnOn() = println("Sony TV: Power ON 🔴")
    override fun turnOff() = println("Sony TV: Power OFF")
    override fun changeChannel(channel: Int) = println("Sony TV: Channel switched to $channel")
    override fun adjustVolume(volume: Int) = println("Sony TV: Volume set to $volume")
    override fun getBrand() = "Sony"
}
