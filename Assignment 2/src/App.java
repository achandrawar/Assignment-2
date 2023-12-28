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
                    break;
            }

        }while(choice == 7);
        
            

        // String str="2001-01-01";  
        // Date date=Date.valueOf(str);
        // Student student = new Student(10, "Daniel", "Sakpal", date, "ramskpal@gmail.com", "44336345");
        // Payment payment = new Payment(714,student,450.0,date);
        // student.enrollInCourse(0,504,614);
        // // student.updateStudentInfo("Ayush", "Chandrawar", date, "ayuchandrawar@gmail.com", "7582969935");
        // // student.makePayment(500);
        // //student.getEnrolledCourses();
        // //student.displayStudentInfo(9);
        // // student.getPaymentHistory();
        // payment.getStudent(10);
        // payment.getPaymentAmount();
        // payment.getPaymentDate();
        // System.out.println("\n\n---------------------------PAYMENT INFO-------------------------------\n\n");
        // Enrollment enrollment = new Enrollment();
        // enrollment.getStudent(602);
        // System.out.println("\n\n---------------------------TEACHER INFO-------------------------------\n\n");
        // Teacher teacher = new Teacher();
        // teacher.displayTeacherInfo(101);

        // System.out.println("\n\n---------------------------COURSE INFO-------------------------------\n\n");
        // Course course = new Course(503,"", 0, 0);
		// Teacher teacher1 = new Teacher(108,"","","","");   
		// course.AssignTeacher(teacher1, 108);

        //  //Method 2 UpdateCourseInfor method in course
		// Course course2 = new Course(504,"Biology", 0, 0);
		// course2.UpdateCourseInfo(504,"Biology");
		// //course method 3 display-course-info
		//   Teacher teacher2 = new Teacher(102,"","","","");
		//  Course course3 = new Course(508,"Pscycology", 0, 0);
		// course3.DisplayCourseInfo(teacher2);
		
		// //method 4 
		//  Course course4 = new Course(508,"", 0, 0);
		//  Teacher teacher3= new Teacher(508, null, null, null,null);
		//  course4.GetEnrollments(teacher3);
		 
		//  //method 5
		//  Course course5 = new Course(102,"", 0, 0);
		//  Teacher teacher4= new Teacher(102, null, null, null,null);
		//  course5.GetTeacher(teacher4);

        // System.out.println("\n\n---------------------------Student Enrollment INFO-------------------------------\n\n");
        // StudentEnrollment studentEnrollment = new StudentEnrollment();
        // studentEnrollment.createNewStudent("John", "Doe", Date.valueOf("1995-08-15"),
        //         "john.doe@example.com", "123-456-7890");

        // System.out.println("\n\n---------------------------payment Enrollment INFO-------------------------------\n\n");
        // PaymentRecord paymentRecord = new PaymentRecord();
        // int studentId = 1;
        // double paymentAmount = 500.00;
        // paymentRecord.recordPayment(studentId, paymentAmount, date);

        // System.out.println("\n\n---------------------------Enrollment Report INFO-------------------------------\n\n");
        // EnrollmentReport enrollmentReport = new EnrollmentReport();

        // // Example usage
        // String courseName = "Biology";
        // enrollmentReport.generateEnrollmentReport(courseName);

        }
        public static void displayInfo(){
            System.out.println("1: Add a New Student");
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

