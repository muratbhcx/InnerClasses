package Library_Management_System;

public class Book {

    //Kitabın ismi
    private String name;

    //Kitabın yazarı
    private String author;

    //Kitabın ISBN numarası
    private int isbn;

    //Kitabın kiralanma durumu
    private boolean status;

    //Kitabı oluştururken isim ve yazar bilgisini alma
    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
    //Kitap ismini döndürür
    public String getName() {
        return name;
    }

    //Kitap ismini değiştirir
    public void setName(String name) {
        this.name = name;
    }

    //Yazar ismini döndürür
    public String getAuthor() {
        return author;
    }

    //Yazar ismini değiştirir
    public void setAuthor(String author) {
        this.author = author;
    }

    //ISBN numarasını döndürür
    public int getIsbn() {
        return isbn;
    }

    //ISBN numarasını değiştirir
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    //Kitabın kiralanma durumunu döndürür
    public boolean isStatus() {
        return status;
    }

    //Kitabın kiralanma durumunu değiştirir
    public void setStatus(boolean status) {
        this.status = status;
    }

    //Kitap bilgilerini yazdırır
    @Override
    public String toString() {
        return
                "Kitap İsmi : " + name + "\n" +
                "Yazar : " + author + "\n" +
                "ISBN : " + isbn + "\n" +
                "Durum : " + (status ? "Şu an mevcut değil (Kirada)" : "Şu an mevcut") + "\n" +
                        "--------------------";
    }
}