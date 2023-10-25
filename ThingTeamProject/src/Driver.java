import java.util.Scanner;

public class Driver {

    private Scanner input = new Scanner(System.in);
    private Shop shop;



    public static void main(String[] args) {

        System.out.println("Thing Team Project V1.1");

        Driver driver = new Driver();
        driver.runMenu();
    }

    ///////////////////////////////////////////////////////
    private int mainMenu(){
        System.out.print("""
               Shop Menu
               ---------
                  1) Add a Thing
                  2) List the Things
                  0) Exit
               ==>> """);
        int option = input.nextInt();
        return option;
    }
///////////////////////////////////////////////////////
private void runMenu(){
    int option = mainMenu();

    while (option != 0){

        switch (option){
            case 1 -> addAThing();
            case 2 -> listAllThings();

            default -> System.out.println("Invalid option entered: " + option);
        }

        //pause the program so that the user can read what we just printed to the terminal window
        System.out.println("\nPress enter key to continue...");
        input.nextLine();
        input.nextLine(); //second read is required - bug in Scanner class; a String read is ignored straight after reading an int.

        //display the main menu again
        option = mainMenu();
    }

    //the user chose option 0, so exit the program
    System.out.println("Exiting...bye");
    System.exit(0);
}
///////////////////////////////////////////////////////
    private void addAThing() {
        System.out.println("Calling addAThing....");
    }
///////////////////////////////////////////////////////
    private void listAllThings() {
        System.out.println("Calling listAllThings....");
    }
///////////////////////////////////////////////////////
}