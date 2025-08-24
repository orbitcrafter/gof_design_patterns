package structural.flyweight

// Flyweight 인터페이스
interface TreeType {
    fun render(x: Int, y: Int)  // 외부 상태(위치)를 매개변수로 받음
}

// 구체적인 Flyweight - 공유 가능한 데이터만 저장
class TreeTypeFlyweight(
    private val name: String,        // 공유 데이터
    private val color: String,       // 공유 데이터
    private val sprite: ByteArray    // 공유 데이터 (큰 이미지)
) : TreeType {

    override fun render(x: Int, y: Int) {
        // 외부에서 받은 고유 데이터(x, y)와 내부 공유 데이터를 조합
        println("$name 렌더링: $color 색상, 위치($x, $y)")
        // 실제로는 sprite를 사용해서 해당 위치에 그림
    }

    // 이 메서드는 모든 인스턴스가 공유하므로 메모리 절약
    fun getTreeInfo(): String = "나무 타입: $name, 색상: $color"
}

// Flyweight Factory - 중복 생성 방지
class TreeTypeFactory {
    companion object {
        private val treeTypes = mutableMapOf<String, TreeType>()

        fun getTreeType(name: String, color: String, spriteFile: String): TreeType {
            val key = "$name-$color-$spriteFile"

            return treeTypes.getOrPut(key) {
                println("새로운 TreeType 생성: $key")
                TreeTypeFlyweight(name, color, loadSpriteData(spriteFile))
            }
        }

        fun getCreatedTreeTypesCount(): Int = treeTypes.size

        private fun loadSpriteData(spriteFile: String): ByteArray {
            // 실제로는 파일에서 이미지 로드
            return ByteArray(1024) // 1KB 시뮬레이션
        }
    }
}

// Context 클래스 - 고유 데이터 저장
class Tree(
    private val x: Int,           // 고유 데이터 (Extrinsic)
    private val y: Int,           // 고유 데이터 (Extrinsic)
    private val treeType: TreeType // Flyweight 참조
) {

    fun render() {
        treeType.render(x, y)  // 고유 데이터를 매개변수로 전달
    }
}

// 숲 관리 클래스
class Forest {
    private val trees = mutableListOf<Tree>()

    fun plantTree(x: Int, y: Int, name: String, color: String, spriteFile: String) {
        // 팩토리에서 Flyweight 가져오기 (공유됨)
        val treeType = TreeTypeFactory.getTreeType(name, color, spriteFile)

        // 고유 데이터만 가진 Tree 객체 생성
        trees.add(Tree(x, y, treeType))
    }

    fun render() {
        trees.forEach { it.render() }
    }

    fun getStats() {
        println("총 나무 수: ${trees.size}")
        println("생성된 TreeType 수: ${TreeTypeFactory.getCreatedTreeTypesCount()}")
    }
}
