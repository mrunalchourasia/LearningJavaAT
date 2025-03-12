package ex_01_Java_Basic;

public class ex03_Concat {
    public static void main(String[] args) {
        String first_name = "Pramod";
        String last_name = "Dutta";

        int a = 10;
        int b = 10;

        System.out.println(first_name + last_name + a + b);
        // // PramodDutta1010 - first operator - + performed as Concatenation

        System.out.println(a + b + first_name + last_name);


        System.out.println(first_name + last_name + (a + b));
    }

}
