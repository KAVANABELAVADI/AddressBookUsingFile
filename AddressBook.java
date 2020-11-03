import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddressBook
{
    public static void main(String args[]) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int choice;
        FileWriter file = new FileWriter("addressbook.txt");
        do
        {
        System.out.println("Enter First Name");
        String firstName = scanner.nextLine();
        System.out.println("Enter Last Name");
        String lastName = scanner.nextLine();
        System.out.println("Enter Address");
        String address = scanner.nextLine();
        System.out.println("Enter City");
        String city = scanner.nextLine();
        System.out.println("Enter State");
        String state = scanner.nextLine();
        System.out.println("Enter ZIP Code");
        String zip = scanner.nextLine();
        System.out.println("Enter Phone Number");
        String phoneNumber = scanner.nextLine();

        file.write(firstName+""+lastName+"\n"+address+"\n"+city+"\n"+state+"-"+zip+"\n"+phoneNumber+"\n\n");
                    
        System.out.println("Do you want to continue \n 1.Yes \n 2.No");
        choice=scanner.nextInt();
    }while(choice == 1);
    file.close();
    }
}