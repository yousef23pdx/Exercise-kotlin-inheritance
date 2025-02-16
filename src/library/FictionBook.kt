package library

class FictionBook(title: String, author: String, iSBN: Long, val fGenre: String) : Book(title, author, iSBN) {

    override fun displayInfo(): String {
        return super.displayInfo() + ", Genre: $fGenre (Fiction)"
    }

    fun getFictionBook() = "The book '$title' by '$author' belongs to the '$fGenre' fiction genre. ISBN: $iSBN"
}
