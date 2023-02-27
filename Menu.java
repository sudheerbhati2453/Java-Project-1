import java.util.Scanner;

public class Menu {
    boolean exit;
        public static void main(String[] args)
        {
            Menu menu=new Menu();
            menu.runMenu();
        }
        public void runMenu()
        {
            printHeader();
            while(!exit)
            {
                printMenu();
                int choice = getInput();
               // performAction(choice);
            }
        }
        private void printHeader()
        {
            System.out.println("+-------------------------------------------------------+");
            System.out.println("|                  Welcome To Our                       |");
            System.out.println("|                    Job Agency                         |");
            System.out.println("+-------------------------------------------------------+");
        }
        private void printMenu() {
            System.out.println("\nPlease make a selection");
            System.out.println("1) Log-In");
            System.out.println("2) Job Available");
            System.out.println("3) Job Seekers");
            System.out.println("4) Discover");
            System.out.println("5) Learning");
            System.out.println("0) Exit");
        }
        private int getInput()
        {
            Scanner in = new Scanner(System.in);
            int choice = -1;
            while(choice <0 || choice >2)
            {
                try{
                    System.out.print("\nEnter Your Choice:  ");
                    choice = Integer.parseInt(in.nextLine());
                }
                catch (NumberFormatException e) {
                    System.out.println("Invalid Selection. Please Try Again");
                }
            }
            return choice;
        }
        /*private void performAction(int choice)
        {
            switch (choice){
                case 0:
                    exit =true;
                    System.out.println("Thank You For Using Our Application");
                    break;
                case 1:
                    LogIn();
                    break;
                case 2:
                    Jobs();
                    break;
                case 3:
                    JobSeekers();
                    break;
                case 4:
                    DiscoverPage();
                    break;
                case 5:
                    Reports();
                    break;
                default:
                    System.out.println("An Unknown error has occured.");
            }
        }*/

    }

