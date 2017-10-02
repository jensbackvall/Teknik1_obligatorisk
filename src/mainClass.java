import java.util.*;

public class mainClass {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        // creating our menu
        menu mainMenu = new menu(scan);

        // set input variable for validation
        String input = "0";
        // menu loop
        while (!input.equals("6")) {

            // showing standard menu
            mainMenu.stdMenu();
            // set input variable
            input = mainMenu.getInput();
            // take input and perform action
            mainMenu.menuController(input);

        }


    }
}

class menu {

    private String command;
    private Scanner in;

    menu(Scanner in) {
        this.in = in;
    }

    public void stdMenu() {
        System.out.println("");
        System.out.println("DBMS v1.0 by Arthur Dent");
        System.out.println("________________________");
        System.out.println("1) Insert new user");
        System.out.println("2) Display all users");
        System.out.println("3) Update user");
        System.out.println("4) Delete user");
        System.out.println("5) Raw query (sql)");
        System.out.println("6) Exit program");
        System.out.println("-------------------------");
        System.out.print("Choose a nr: ");
    }

    public String getInput() {
        return in.nextLine();
    }

    public void menuController(String command) {
        if (command.equals("1")) {
            System.out.println("Insert it baby: ");
        } else if (command.equals("2")) {
            System.out.println("Display it for me: ");
        } else if (command.equals("3")) {
            System.out.println("Update me now: ");
        } else if (command.equals("4")) {
            System.out.println("delete me COMPLETELY: ");
        } else if (command.equals("5")) {
            System.out.println("Give me the RAW deal: ");
        } else if(command.equals("6")){
            System.out.println("GOODBYE!");
        } else {
            System.out.println("TRY AGAIN!");
        }
    }

}
