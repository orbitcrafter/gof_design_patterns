package structural.composite

class Folder(
    private val children: MutableList<FileSystemComponent>,
) : FileSystemComponent() {
    override val size: Int
        get() = children.sumOf { it.size }

    override fun showDetails() {
        println("Folder showDetails")
        children.forEach {
            it.showDetails()
        }
    }

    fun add(fileSystemComponent: FileSystemComponent) {
        children.add(fileSystemComponent)
    }
}
