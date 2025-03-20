package Ternary;

public class NestedTernary {
    public static void main(String[] args) {
        int age=38;

        String result= (age>30)? (age>=38 ? "N>30" : "N>80") : "B";
        System.out.println(result);
    }
}
