package structural.adapter

fun main() {
    val legacyDatabaseAdapter = LegacyDatabaseAdapter(LegacyDatabase())
    println(legacyDatabaseAdapter.select())
}
