package Switch;

import java.util.Scanner;

public class TakeInputFrmUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name");
        String name= sc.nextLine();

        System.out.println("Enter age");
        int age = sc.nextInt();

        System.out.println("Enter salary");
        double salary = sc.nextDouble ();


        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);




    }
}
