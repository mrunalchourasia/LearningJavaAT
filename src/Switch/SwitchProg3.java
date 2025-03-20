package Switch;

import java.util.Scanner;

public class SwitchProg3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter browser");
        String browser= sc.next() ;

        switch (browser)
        {
            case "Chrome" :
                System.out.println("chrome invoked");
                break;

            case "edge":
                System.out.println("edge");
                break;

        }
    }
}
