import java.util.Scanner;
import entity.SIS;

public class App {
    static Scanner scanner = new Scanner(System.in);
    static SIS sis = new SIS();
    public static void main(String[] args) {
        int choice = 0;
        do{
            displayInfo();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    sis.enrollNewStudent();
                    break;
                case 2:
                    sis.AssignTeacherToCourse();
                    break;
                case 3:
                    sis.MakePayment();
                    break;
                case 4:
                    sis.generateEnrollmentReport();
                    break;
                case 5:
                    sis.GeneratePaymentReport();
                    break;
                case 6:
                    sis.GetEnrollmentHistory();
                    break;
                case 7 :
                    sis.displayInfo();
                    break;
                case 8 :
                    System.exit(0);
                default:
                    System.out.println("Invalid Entry , Please try Code !");
            }

        }while(choice == 7);
        
    }
        public static void displayInfo(){
            System.out.println("1: Enroll a New Student");
            System.out.println("2: Assign Teacher To Course");
            System.out.println("3: Make Payment");
            System.out.println("4: Generate Enrollment Report");
            System.out.println("5: Generate Payment Report");
            System.out.println("6: Get Enrollment History");
            System.out.println("7: Show Students' Information");
            System.out.println("8: Exit");
            System.out.println("Enter Your Choice : ");
        }
    }

