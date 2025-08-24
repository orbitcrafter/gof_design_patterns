package structural.composite

// Leaf - 개별 객체 (파일)
class File(
    val name: String,
    override val size: Int,
) : FileSystemComponent() {
    override fun showDetails() {
        println("File: " + name)
    }
}
