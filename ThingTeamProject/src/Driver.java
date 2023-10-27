import java.util.Scanner;

public class Driver {

    private Scanner input = new Scanner(System.in);
    private Shop shop;



    public static void main(String[] args) {

        System.out.println("Thing Team Project V1.1");
        Driver driver = new Driver();
        driver.setup();
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
    private void setup(){
        //find out from the user how many products they would like to order
        System.out.print("How many Things would you like to have in your Store?  ");
        int numThings = input.nextInt();

        shop = new Shop(numThings);

    }
    ///////////////////////////////////////////////////////
    //gather the product data from the user and create a new product object.
    private void addAThing(){
        input.nextLine();  //dummy read of String to clear the buffer - bug in Scanner class.

        System.out.print("Enter the Thing Name:  ");
        String thingName = input.nextLine();
        System.out.print("Enter the Price:  ");
        double thingPrice = input.nextDouble();

        Thing temp = new Thing(thingName, thingPrice);

        boolean isAdded = shop.add(temp);
        if (isAdded){
            System.out.println("Thing Added Successfully");
        }
        else{
            System.out.println("No Thing Added");
        }
    }
    ///////////////////////////////////////////////////////
    //print the product (the toString method is automatically called).
    private void listAllThings(){
        System.out.println("List of Products are:");
        System.out.println(shop.list());
    }
///////////////////////////////////////////////////////
}