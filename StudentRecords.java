import java.util.ArrayList;
import java.util.Scanner;

public class StudentRecords {
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("\n1. Add Student");
            System.out.println("2. Display All students");
            System.out.println("3. Search by Roll Number");
            System.out.println("4. Exit");
            System.out.println("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                     System.out.print("Enter name: ");
                     String name = sc.nextLine();

                      System.out.print("Enter roll number: ");
                      int roll = sc.nextInt();
                      sc.nextLine();
                      boolean exists = false;
                      for(Student s : students){
                        if(s.getRollNumber() == roll){
                            exists = true;
                            break;
                        } 
                      }
                      if(exists) {
                         System.out.println("Roll number already exists!");
                      } else{
                        students.add(new Student(name, roll));
                         System.out.println("Student added successfully!");
                      }
                      break;
                      case 2:
                        if(students.isEmpty()){
                            System.out.println("No student records found.");
                        } else{
                            for(Student s : students){
                                 System.out.println(s);
                            }
                        }
                        break;
                        case 3:
                             System.out.print("Enter roll number: ");
                             int searchRoll = sc.nextInt();
                             sc.nextLine();
                             boolean found = false;
                             for(Student s : students){
                                if(s.getRollNumber() == searchRoll){
                                     System.out.println(s);
                                     found = true;
                                     break;
                                }
                             }
                             if(!found){
                                 System.out.println("Student not found!");
                             }
                             break;
                             case 4:
                                 System.out.println("Program exited.");
                                 sc.close();
                                 return;
                                 default:
                                     System.out.println("Invalid choice!");

            }
        }
    }
}
