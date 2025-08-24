package structural.bridge

// 추상화 (리모컨의 기본 기능)
abstract class RemoteControl(protected val tv: TV) {

    // 기본 기능들
    fun powerOn() {
        println("📱 리모컨: 전원 버튼 눌림")
        tv.turnOn()
    }

    fun powerOff() {
        println("📱 리모컨: 전원 버튼 눌림")
        tv.turnOff()
    }

    fun setChannel(channel: Int) {
        println("📱 리모컨: ${channel}번 버튼 눌림")
        tv.changeChannel(channel)
    }

    fun setVolume(volume: Int) {
        println("📱 리모컨: 볼륨 조절")
        tv.adjustVolume(volume)
    }

    fun getTVInfo(): String = tv.getBrand()
}

// 정제된 추상화들 (고급 리모컨들)
class BasicRemote(tv: TV) : RemoteControl(tv) {

    fun quickStart() {
        println("\n=== 기본 리모컨으로 빠른 시작 ===")
        powerOn()
        setChannel(7)
        setVolume(15)
        println("기본 설정 완료! (${getTVInfo()} TV)")
    }
}
