package structural.proxy

fun main() {
    val image = ImageProxy("name")
    image.display()
}

// 공통 인터페이스
interface Image {
    fun display()
    fun getSize(): Long
}

// 실제 이미지 클래스 - 로딩이 비쌈
class RealImage(private val filename: String) : Image {

    init {
        loadImageFromDisk()
    }

    private fun loadImageFromDisk() {
        println("디스크에서 '$filename' 로딩 중... (3초 소요)")
        Thread.sleep(3000) // 로딩 시간 시뮬레이션
        println("'$filename' 로딩 완료!")
    }

    override fun display() {
        println("이미지 '$filename' 화면에 표시")
    }

    override fun getSize(): Long {
        return 1024 * 1024 * 5 // 5MB 시뮬레이션
    }
}

class ImageProxy(private val filename: String) : Image {
    private var realImage: RealImage? = null

    override fun display() {
        // 실제로 표시할 때만 로딩
        if (realImage == null) {
            println("프록시: 실제 이미지를 로딩합니다...")
            realImage = RealImage(filename)
        }
        realImage!!.display()
    }

    override fun getSize(): Long {
        // 실제 로딩 없이 메타데이터만으로 크기 반환
        return when {
            filename.endsWith(".jpg") -> 1024 * 1024 * 2
            filename.endsWith(".png") -> 1024 * 1024 * 5
            else -> 1024 * 1024
        }
    }
}
