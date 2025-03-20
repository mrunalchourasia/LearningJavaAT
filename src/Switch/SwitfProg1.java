package Switch;

import java.util.Scanner;

public class SwitfProg1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day number");
        int day= sc.nextInt();
        switch (day){
            case 1:
            System.out.println("Mon");
            break;

            case 2:
            System.out.println("Tue");
            break;

            case 3:
                System.out.println("Wed");
                break;

            default:
                System.out.println("Will execute default if not matching");
        }



    }
}
