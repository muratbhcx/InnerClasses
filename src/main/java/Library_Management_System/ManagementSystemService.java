package Library_Management_System;

import java.util.List;

public class ManagementSystemService {

    //Kitapları yönetme işlemi kütüphane sınıfında gerçekleşecek
    private static final Library library = new Library();

    //Kitap ekleme işlemi
    public void addBookElement(String name, String author) {
        Book book = new Book(name, author);
        book.setStatus(false);
        library.save(book);
    }
    //Kütüphanedeki tüm kitapları listeleme işlemi
    public static List<Book> getAll() {
        return library.listAll();
    }
    //Kitap kiralama işlemi
    public void rent(int rentedBook) {
        boolean forRent = library.forRent(rentedBook);
        if (forRent){
            Book book = library.findIsbn(rentedBook);
            if (book.isStatus() == true) {
                System.out.println("Bu kitap kiralanmış !!! ");
            return;
            }
            book.setStatus(true);
            System.out.println("Kitap başarıyla kiralandı ! Kitap ismi => " + book.getName() + " - Yazar : " + book.getAuthor());
        }
    }
    //Kitap arama işlemi
    public void search(String bookName) {
        for (Book book : library.listAll()) {
            if (book.getName().toUpperCase().contains(bookName.toUpperCase())) {
                System.out.println("Aradığınız kitap bulundu ! Kitap ismi => " + book.getName() + " - Yazar : " + book.getAuthor());
            }
        }
    }
    //Kitap iade işlemi
    public void returnIt(int restitution) {
        boolean returnedBook = library.forRent(restitution);
        if (returnedBook){
            Book book = library.findIsbn(restitution);
            book.setStatus(false);
            System.out.println("Kitap başarıyla iade edildi ! Kitap ismi => " + book.getName() + " - Yazar : " + book.getAuthor());
        }
    }
}