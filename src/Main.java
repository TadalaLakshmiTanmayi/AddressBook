import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        AddressBook a1 = new AddressBook();
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Address book");
        do{
            System.out.println("Enter 1 to create contact \n Enter 2 to display al contacts");
            int input = sc.nextInt();
            switch (input){
                case 1 -> a1.createContact();
                case 2 ->  a1.display();
                default -> System.out.println("Wrong input");
            }
            System.out.println("Enter 0 to exit");
            i = sc.nextInt();

        }while(i!=0);

        System.out.println("Thank you for using address book");
        sc.close();


    }



}