import java.util.Scanner; // Imports the Scanner class for user input.
import static java.lang.System.exit; // Imports the exit() method to terminate the program.
class Student
{
int id;
String name;
String department ;
public Student(int id , String name ,String department)
{
    this.id = id;
    this.name = name;
    this.department = department;
}
public void displayInfo()
{
    System.out.println("ID : "+id + " Name : " +name+" Department : "+department);
}
}
class StudentRegestrationSystem{
    private Student[] students ;
    int counter;
    public StudentRegestrationSystem(int capacity)
   {students  = new Student[capacity];
    counter = 0;
    } 
    public void Register(int id, String name, String department)
    {
        if(counter<students.length)
        {
            students[counter]= new Student(id, name, department);
            counter ++;
            System.out.println("The student is registered successfully !");
        }
        else 
        {
            System.out.println("Sorry! the registration is full you can't add any student.");
        }
    }
    public void viewStudents(){
if (counter==0)
{
    System.out.println("You don't have any registered student in this system.");
}
else 
{
   for(int i = 0;i<counter;i++)
  {
        students[i].displayInfo();
    }
}
    }
}

public class Arrayimp {
    public static void main(String[] args) {
       

        Scanner s = new Scanner(System.in); // Creates a Scanner object for user input.
        StudentRegestrationSystem srs = new StudentRegestrationSystem(100); // Creates a StudentRegistrationSystem object with a capacity of 100 students.

        while (true) { // Starts an infinite loop to run the menu.
            System.out.println("\n--- Student Management System ---"); // Prints the menu header.
            System.out.println("Press 1: To Register a Student"); // Prints the register option.
            System.out.println("Press 2: To View All Students"); // Prints the view students option.
            System.out.println("Press 3: To Exit the System"); // Prints the exit option.
            System.out.print("Enter your choice: "); // Prompts the user for input.
            int choice = s.nextInt(); // Reads the user's choice.

            switch (choice) { // Starts a switch statement to handle the user's choice.
                case 1: // If the user chooses 1 (register student).
                    System.out.print("Please enter the ID of the student: "); // Prompts for student ID.
                    int id = s.nextInt(); // Reads the student ID.
                    s.nextLine(); // Consume leftover newline
                    System.out.print("Please enter the name of the student: "); // Prompts for student name.
                    String name = s.nextLine(); // Reads the student name.
                    System.out.print("Please enter the department of the student: "); // Prompts for student department.
                    String department = s.nextLine(); // Reads the student department.

                    srs.Register(id, name, department); // Registers the student.
                    break;

                case 2: // If the user chooses 2 (view students).
                    srs.viewStudents(); // Displays the registered students.
                    break;

                case 3: // If the user chooses 3 (exit).
                    System.out.println("Exiting... Goodbye!"); // Prints an exit message.
                    s.close(); // Closes the scanner.
                    exit(0); // Exits the program.

                default: // If the user enters an invalid choice.
                    System.out.println("You entered an incorrect choice. Please try again."); // Prints an error message.
            }
        }



        }
   
    }

