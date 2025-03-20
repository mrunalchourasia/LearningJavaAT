package Switch;

public class SwitchProg2 {
    public static void main(String[] args) {

        int day= Integer.parseInt(args[0]);

        System.out.println("Enter the day");

        //int day=args[0];

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
