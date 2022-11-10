import java.sql.*;
import java.text.ParseException;
import java.util.*;

public class PAS {

    public static void main(String[] args) throws SQLException, ParseException {

        CustomerAcc cust = new CustomerAcc();
        Scanner sc = new Scanner(System.in);
        String fName, lName, address;
        System.out.println("1. Create a new Customer Account");
        System.out.println("2. Get a policy quote and buy the policy");
        System.out.println("3. Cancel a specific policy");
        System.out.println("4. File an accident claim against a policy");
        System.out.println("5. Search for a Customer account");
        System.out.println("6. Search for and display a specific policy");
        System.out.println("7. Search for and display a specific claim");
        System.out.println("8. Exit the PAS System.");
        System.out.print("Enter Choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
            sc.nextLine();
                System.out.print("Enter first name: ");
                fName = sc.nextLine();

                System.out.print("Enter last name: ");
                lName = sc.nextLine();

                System.out.print("Enter Address: ");
                address = sc.nextLine();

                try {
                    cust.addCustomer(fName, lName, address);
                    System.out.printf("Welcome %s %s your account has been succesfully created!",fName ,lName );

                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case 2:
            case 3:
            case 4:

            case 5:
                System.out.print("Enter first name: ");
                fName = sc.nextLine();
                sc.nextLine();
                System.out.print("Enter last name: ");
                lName = sc.nextLine();
                cust.searchName(fName, lName);
                break;

            case 6:
            case 7:
            default:
                break;
        }

        sc.close();
    }
}
