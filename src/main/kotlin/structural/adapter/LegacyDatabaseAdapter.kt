package structural.adapter

class LegacyDatabaseAdapter(private val legacyDatabase: LegacyDatabase) : DatabaseService {
    override fun select(): String {
        return legacyDatabase.select()
    }
}
