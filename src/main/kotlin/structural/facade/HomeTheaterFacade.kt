package structural.facade

// Facade Pattern - 홈시어터 파사드
class HomeTheaterFacade(
    private val dvdPlayer: DVDPlayer,
    private val projector: Projector,
    private val soundSystem: SoundSystem,
    private val lights: Lights,
    private val airConditioner: AirConditioner,
) {

    fun watchMovie(movie: String) {
        println("🎭 영화 감상 준비 중...")
        println("=".repeat(40))

        // 환경 설정
        lights.dim(10)
        airConditioner.on()
        airConditioner.setTemperature(22)

        // 장비 켜기
        projector.on()
        projector.setInput("DVD")

        soundSystem.on()
        soundSystem.setVolume(8)
        soundSystem.setSurroundSound()

        dvdPlayer.on()

        println("=".repeat(40))
        dvdPlayer.play(movie)
        println("🍿 영화를 즐기세요!")
    }

    fun pauseMovie() {
        println("\n⏸️ 잠시 멈춤...")
        dvdPlayer.stop()
        lights.dim(50) // 조금 밝게
    }

    fun resumeMovie() {
        println("\n▶️ 재생 재개...")
        lights.dim(10) // 다시 어둡게
    }

    fun endMovie() {
        println("\n🎬 영화 종료 중...")
        println("=".repeat(40))

        dvdPlayer.stop()
        dvdPlayer.off()
        soundSystem.off()
        projector.off()
        airConditioner.off()
        lights.on()

        println("=".repeat(40))
        println("✨ 홈시어터 시스템 종료 완료")
    }

    // 게임 모드
    fun gameMode() {
        println("🎮 게임 모드 설정 중...")
        println("=".repeat(40))

        lights.dim(30)
        projector.on()
        projector.setInput("HDMI")
        soundSystem.on()
        soundSystem.setVolume(6)

        println("=".repeat(40))
        println("🕹️ 게임을 즐기세요!")
    }

    // 음악 감상 모드
    fun musicMode() {
        println("🎵 음악 감상 모드 설정 중...")
        println("=".repeat(40))

        lights.dim(70)
        soundSystem.on()
        soundSystem.setSurroundSound()
        soundSystem.setVolume(5)

        println("=".repeat(40))
        println("🎶 음악을 즐기세요!")
    }
}
