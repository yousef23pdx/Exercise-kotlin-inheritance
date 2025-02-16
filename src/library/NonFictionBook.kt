package library

class NonFictionBook(title: String, author: String, iSBN: Long, val rGenre: String) : Book(title, author, iSBN) {

    override fun displayInfo(): String {
        return super.displayInfo() + ", Genre: $rGenre (Non-Fiction)"
    }

    fun getNonFictionGenre() = "The book '$title' by '$author' belongs to the '$rGenre' non-fiction genre. ISBN: $iSBN"
}