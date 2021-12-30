package demos

class User(private val name: String) {
    fun getUpperName(): String {
        return name.uppercase();
    }
}