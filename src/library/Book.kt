package library

open class Book(val title: String, val author: String, val iSBN: Long) {

    open fun displayInfo(): String {
        return "Title: $title, Author: $author, ISBN: $iSBN"
    }

    fun isAvailable(): String {
        return "The book '$title' is currently available in the library."
    }
}