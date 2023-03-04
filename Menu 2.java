import java.util.Scanner;

import static java.lang.System.exit;

public class Menu {
    boolean exit;
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("+-------------------------------------------------------+");
            System.out.println("|                  Welcome To Our                       |");
            System.out.println("|                    Job Agency                         |");
            System.out.println("+-------------------------------------------------------+");

            System.out.println("\nPlease make a selection");
            int choice = 1;
            while (choice == 1) {

                System.out.println("1) Log-In");
                System.out.println("2) Jobs Available");
                System.out.println("3) Job Seekers");
                System.out.println("4) Discover");
                System.out.println("5) Learning");
                System.out.println("0) Exit");
                int ch = in.nextInt();
                switch (ch) {
                    case 1:
                        System.out.println("+-------------------------------------------------------+");
                        System.out.println("|                  Welcome To Your                       |");
                        System.out.println("|               Professional Community                   |");
                        System.out.println("|                                                        |");
                        System.out.println("|    ((Sign with Google / New to Agency?)) Join Now      |");
                        System.out.println("+-------------------------------------------------------+");
                        break;
                    case 2:
                        System.out.println("+-------------------------------------------------------+");
                        System.out.println("|           Search For The Jobs Available               |");
                        System.out.println("+-------------------------------------------------------+");
                        break;
                    case 3:
                        System.out.println("+-------------------------------------------------------+");
                        System.out.println("|            List Of All The Job Seekers                |");
                        System.out.println("|                                                       |");
                        System.out.println("|             Add / Remove From List                    |");
                        System.out.println("+-------------------------------------------------------+");
                        break;
                    case 4:
                        System.out.println("+-------------------------------------------------------+");
                        System.out.println("|            Explore Agency / Careers                   |");
                        System.out.println("+-------------------------------------------------------+");
                        break;
                    case 5:
                        System.out.println("+-------------------------------------------------------+");
                        System.out.println("|            Browse Most Popular Courses                |");
                        System.out.println("+-------------------------------------------------------+");
                        break;
                    case 6:
                        System.out.println("+-------------------------------------------------------+");
                        System.out.println("|            Thank You For Using Our Application        |");
                        System.out.println("+-------------------------------------------------------+");
                        exit(0);
                }
                break;
            }
            int a = 1;
            while (a == 1) {
                System.out.println("Enter Choice - ");
                int c = in.nextInt();
                if (c == 1) {
                    System.out.println("+-------------------------------------------------------+");
                    System.out.println("|            Enter E-Mail -                             |");
                    System.out.println("|            Enter Password -                           |");
                    System.out.println("+-------------------------------------------------------+");
                } else if (c==2) {
                    System.out.println("1. ORACLE");
                    System.out.println("2. WIPRO");
                    System.out.println("3. GOOGLE");
                    System.out.println("4. FACEBOOK");
                    int b1= in.nextInt();
                } else if (c==3) {
                    System.out.println("1. See The Job Seekers");
                    System.out.println("2. Add The Job Seekers");
                    System.out.println("3. Remove The Job Seekers");
                    int b2= in.nextInt();
                } else if (c==4) {
                    System.out.println("1. Salary Compensation");
                    System.out.println("2. Internships");
                    System.out.println("3. Retirement");
                    System.out.println("4. Freelancer");
                    int b3= in.nextInt();
                } else if (c==5) {
                    System.out.println("1. Search Skills, subjects,...........");
                    System.out.println("2. Browse Most Popular Cases          ");
                    System.out.println("3. Google Certification Courses       ");
                    System.out.println("4. Professional Development            ");
                    int b4= in.nextInt();
                    break;
                }
            }
        }
    }

