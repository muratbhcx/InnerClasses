package Library_Management_System;

import java.util.*;

public class ManagementSystem {
    //Kullanıcıdan girişleri almak için kullanılır
    private static final Scanner scanner = new Scanner(System.in);

    //İşlemler servis sınıfı üzerinden gerçekleştirilecek
    private static final ManagementSystemService managementSystemService = new ManagementSystemService();

    public static void main(String[] args) {

        boolean running = true;

        while (running){

            //Menü seçeneklerini kullanıcıya açar
            printMenu();
            int choise = scanner.nextInt();
            scanner.nextLine();

            //kullanıcın seçimlerine göre işlemler gerçekleşir
             switch (choise) {

                 case 1:
                     addBook();
                     break;

                 case 2:
                     viewAllBooks();
                     break;

                 case 3:
                     searchForBooks();
                     break;

                 case 4:
                     bookRental();
                     break;

                 case 5:
                     bookReturn();
                     break;

                 case 6:
                     //Çıkış işlemini gerçekleştirir
                     System.out.println("Çıkış yapılıyor ...");
                     running = false;
                     break;

                 default:
                     System.out.println("Hatalı Seçim Yaptınız !!! ");
             }
        }
    }
    //Kullanıcıdan kitap ISBN değeri alınarak iade işlemi gerçekleştirilir
    private static void bookReturn() {
        System.out.println("İade etmek istediğiniz ISBN giriniz : ");
        int restitution = scanner.nextInt();
        managementSystemService.returnIt(restitution);
    }
    //Kullanıcıdan kitap ISBN değeri alınarak kiralama işlemi gerçekleşir
    private static void bookRental() {
        System.out.println("Kiralamak istediğiniz ISBN değerini giriniz : ");
        int rentedBook = scanner.nextInt();
        managementSystemService.rent(rentedBook);
    }
    //Kullanıcıdan kitap ismi alınarak arama işlemi gerçekleşir
    private static void searchForBooks() {
        System.out.println("Aramak istediğiniz kitabın ismini giriniz : ");
        String bookName = scanner.nextLine();
        managementSystemService.search(bookName);
    }
    //Tüm kitapları görüntüleme işlemi gerçekleşir
    private static void viewAllBooks() {
        List<Book> allBooks = ManagementSystemService.getAll();
        System.out.println("KİTAPLAR");
        System.out.println("--------------------");
        for (Book book : allBooks){
            System.out.println(book);
        }
    }
    //Kullanıcıdan kitap bilgilerini alarak kitap ekleme işlemi gerçekleşir
    private static void addBook() {
        System.out.println("Eklemek istediğiniz kitabın ismini giriniz : ");
        String name = scanner.nextLine();
        System.out.println("Yazarın ismini giriniz : ");
        String author = scanner.nextLine();
        managementSystemService.addBookElement(name, author);
    }
    //Ana menüyü ekrana yazdırma işlemini gerçekleştirir
    public static void printMenu() {
        System.out.println("-----Yapmak İstediğiniz İşlemi Seçiniz-----");
        System.out.println("1 - Yeni Kitap Ekle");
        System.out.println("2 - Tüm Kitapları Görüntüle");
        System.out.println("3 - Kitap Ara");
        System.out.println("4 - Kitap Kirala");
        System.out.println("5 - Kitap İade");
        System.out.println("6 - Çıkış");
    }
}