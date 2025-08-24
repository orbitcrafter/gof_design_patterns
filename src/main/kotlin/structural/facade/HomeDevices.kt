package structural.facade

class DVDPlayer {
    fun on() = println("📀 DVD Player 켜짐")
    fun play(movie: String) = println("🎬 재생 중: $movie")
    fun stop() = println("⏹️ 재생 정지")
    fun off() = println("📀 DVD Player 꺼짐")
}

class Projector {
    fun on() = println("📽️ 프로젝터 켜짐")
    fun setInput(input: String) = println("🔌 입력 설정: $input")
    fun off() = println("📽️ 프로젝터 꺼짐")
}

class SoundSystem {
    fun on() = println("🔊 사운드 시스템 켜짐")
    fun setVolume(volume: Int) = println("🔈 볼륨 설정: $volume")
    fun setSurroundSound() = println("🎵 서라운드 사운드 켜짐")
    fun off() = println("🔊 사운드 시스템 꺼짐")
}

class Lights {
    fun dim(level: Int) = println("💡 조명 밝기: $level%")
    fun on() = println("💡 조명 켜짐")
    fun off() = println("💡 조명 꺼짐")
}

class AirConditioner {
    fun on() = println("❄️ 에어컨 켜짐")
    fun setTemperature(temp: Int) = println("🌡️ 온도 설정: ${temp}도")
    fun off() = println("❄️ 에어컨 꺼짐")
}
