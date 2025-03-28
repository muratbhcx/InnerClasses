package Library_Management_System;

import java.util.ArrayList;
import java.util.List;

public class Library {

    //Kitapların tutulduğu liste
    private List<Book>books = new ArrayList<>();

    //ISBN numarası için sayaç yeni eklenen her kitapta artar
    private int bookCounter = 1234567890;

    //Tüm kitapları listeler
    public List<Book> listAll() {
        return books;
    }

    //Yeni kitabı sisteme ekler
    public void save(Book book) {
        //Kitaba benzersiz bir ISBN numarası
        book.setIsbn(bookCounter);
        books.add(book);
        //Bir sonraki eklenecek kitap için ISBN numarası artırılır
        bookCounter++;
    }
    //Belirtilen kitap mevcut mu diye kontrol eder
    public boolean forRent(int rentedBook) {
        for (Book book : books){
            if (book.getIsbn() == rentedBook)
                return true;
        }
        return false;
    }
    //Kitabı ISBN numarasına göre bulur
    public Book findIsbn(int rentedBook) {
        for (Book book : books){
            if (book.getIsbn() == rentedBook)
                return book;
        }
        return null;
    }
}