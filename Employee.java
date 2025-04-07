package Hafta_5.Haftalik_Teknik_İcerik_1;

import java.util.Scanner;

public class Employee {

    String name;
    String surname;
    ContactInfo contactInfo;

    public Employee(String name, String surname, String phone, String email) {
        this.name = name;
        this.surname = surname;
        this.contactInfo = new ContactInfo(phone, email);
    }

    public void displayEmployeeInfo(){
        System.out.println("Çalışan adı : " + name + "\n" + "Soyadı : " + surname);
        contactInfo.displayContactInfo();
    }

    class ContactInfo{

        String phoneNumber;
        String emailAd;

        public ContactInfo(String phoneNumber, String emailAd) {
            this.phoneNumber = phoneNumber;
            this.emailAd = emailAd;
        }

        public void displayContactInfo(){
            System.out.println("Telefon : " + phoneNumber);
            System.out.println("Email : " + emailAd);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Adınızı giriniz : ");
        String name = scanner.nextLine();
        System.out.println("Soyadınızı giriniz : ");
        String surname = scanner.nextLine();
        System.out.println("Telefon numaranızı giriniz : ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Email adresinizi giriniz : ");
        String emailAd = scanner.nextLine();

        Employee employee = new Employee(name, surname, phoneNumber, emailAd);
        employee.displayEmployeeInfo();
    }
}
