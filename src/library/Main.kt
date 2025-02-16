package library

fun main() {
    val bookNormal = Book("Harry Potter and the Sorcerer’s Stone", "J.K. Rowling", 9780439708180)
    val bookNonFic = NonFictionBook("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", 9780062316097, "History")
    val bookFiction = FictionBook("The Great Gatsby", "F. Scott Fitzgerald", 9780743273565, "Classic Literature")


    val myBooks= listOf(bookFiction,bookNormal,bookNonFic)

    for(book in myBooks){

        println(book.displayInfo())
        println(book.isAvailable())
        println("----------------------------------------------------------------------------------------")

    }

    println(bookNonFic.getNonFictionGenre())

    println("----------------------------------------------------------------------------------------")

    println(bookFiction.getFictionBook())
}