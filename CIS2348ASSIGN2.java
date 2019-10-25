import java.util.Scanner;
//alan nguyen cis 2348-18618 assign 2
public class CIS2348ASSIGN2 {
    public static void main(String[]args) {
        int size;
        Scanner input = new Scanner(System.in);
        System.out.println("How many students' information do you want to enter?");
        size = input.nextInt();//Initialize array size for student inputs

        Student[] students = new Student[size];//initialize array size to user input
        for (int i = 0; i < size; i++){
            students[i]=new Student();
            //user input variables
            System.out.println("Enter the student's first name : ");
            String firstname=input.next();
            System.out.println("Enter the student's last name : ");
            String lastname=input.next();
            System.out.println("Enter the student's ID : ");
            int studentID=input.nextInt();
            System.out.println("Enter the student's year standing : ");
            String standing=input.next();
            System.out.println("Enter in their email : ");
            String email=input.next();
            System.out.println("Enter in their address : ");//building # and st name works desirably without using a space, new programmer in tow here
            String address=input.next();
            System.out.println("Enter the city of residence : ");
            String city=input.next();
            System.out.println("Enter the state of residence : ");
            String state=input.next();
            System.out.println("Enter in the zipcode : ");
            int zipcode=input.nextInt();
            students[i].setValues(firstname,lastname,studentID,standing,email,address,city,state,zipcode);
        }
        for (int i = 0; i < size; i++) {
        System.out.println("Student  "+Student.incrementcount()+":");
        students[i].displayInfo();

        }

        }}


