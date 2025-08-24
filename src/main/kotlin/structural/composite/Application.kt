package structural.composite

fun main() {
    val fileA = File("A", 100)
    val fileB = File("B", 400)
    val folder = Folder(mutableListOf(fileA, fileB))
    folder.showDetails()
    println(folder.size)
}
