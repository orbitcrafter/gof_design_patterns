package behavioral.templatemethod

class Archer: Actor() {
    override fun prepare() {
        println("활 시위를 당깁니다")
    }

    override fun attack() {
        println("활 시위를 놓고 화살을 발사합니다")
    }

    override fun defend() {
        println("숲으로 몸을 숨깁니다")
    }
}
