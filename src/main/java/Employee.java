import java.util.Scanner;

public class Employee {
    public static void main(String[] args){
        Scanner name = new Scanner(System.in);
        System.out.println("Enter Employee Name: ");
        String EmployName = name.nextLine();
        if(EmployName.length() < 5){
            throw new IllegalArgumentException("Name is too Short, Change it!: ");
        }
        else {
            Scanner Surname = new Scanner(System.in);
            System.out.println("Enter Employee Surname: ");
            String EmploySurname = Surname.nextLine();
        }
        Scanner EmployeeNumber = new Scanner(System.in);
        System.out.println("Enter Employee Number: ");
        String EmployNo = EmployeeNumber.nextLine();

        System.out.println("Employee Details are: ");
    }

}
