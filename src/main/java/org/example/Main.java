package org.example;

public class Main {
    public static void main(String[] args) {
        int number = 5;
        useNestedIF(number);
        useSwitch(number);

}
private  static  void useNestedIF(int number) {
    String num = null;
    if (0 == number) {
        num = "zero";
    } else if (1 == number) {
        num = "one";
    } else if (2 == number) {
        num = "two";
    } else if (3 == number) {
        num = "three";
    } else if (4 == number) {
        num = "four";
    } else if (5 == number) {
        num = "five";
    } else if (6 == number) {
        num = "six";
    } else if (7 == number) {
        num = "seven";
    } else if (8 == number) {
        num = "eight";

    } else if (9 == number) {
        num = "nine";
    }
    System.out.println("enter a number: "+num);

}
private static void  useSwitch(int number){
        String num = null;
        switch (number){
            case 0:
                num = "zero";
                break;
            case 1: num = "0ne"; break;
            case 2: num = "two"; break;
            case 3: num = "three"; break;
            case 4: num = "four"; break;
            case 5: num = "five"; break;
            case 6: num = "six"; break;
            case 7: num = "seven"; break;
            case 8: num = "eight"; break;
            case 9: num = "nine"; break;
        }
    System.out.println("enter a number: " +num);
}
}