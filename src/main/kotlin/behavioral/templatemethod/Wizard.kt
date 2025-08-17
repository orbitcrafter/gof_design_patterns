package behavioral.templatemethod

class Wizard : Actor() {
    override fun prepare() {
        println("마법 주문을 준비합니다")
    }

    override fun attack() {
        println("마법을 발사합니다")
    }

    override fun defend() {
        println("방어 주문을 외칩니다")
    }
}
