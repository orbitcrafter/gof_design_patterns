package structural.facade

fun main() {
    // 서브시스템 객체들 생성
    val dvdPlayer = DVDPlayer()
    val projector = Projector()
    val soundSystem = SoundSystem()
    val lights = Lights()
    val airConditioner = AirConditioner()

    // 파사드 생성
    val homeTheater = HomeTheaterFacade(
        dvdPlayer, projector, soundSystem, lights, airConditioner
    )

    // 파사드 없이 직접 사용하는 경우 (복잡함)
    println("🤯 파사드 없이 직접 사용:")
    println("=".repeat(50))
    lights.dim(10)
    airConditioner.on()
    airConditioner.setTemperature(22)
    projector.on()
    projector.setInput("DVD")
    soundSystem.on()
    soundSystem.setVolume(8)
    dvdPlayer.on()
    dvdPlayer.play("아바타")
    println("😵‍💫 너무 복잡해!")

    println("\n\n")

    // 파사드 사용 (간단함)
    println("😎 파사드 패턴 사용:")
    println("=".repeat(50))
    homeTheater.watchMovie("어벤져스: 엔드게임")

    println("\n")
    Thread.sleep(2000) // 2초 대기 (영화 감상 중...)

    homeTheater.pauseMovie()

    println("\n")
    Thread.sleep(1000) // 1초 대기

    homeTheater.resumeMovie()

    println("\n")
    Thread.sleep(2000) // 2초 대기

    homeTheater.endMovie()

    println("\n\n")

    // 다른 모드들
    homeTheater.gameMode()
    println("\n")
    homeTheater.musicMode()
}
