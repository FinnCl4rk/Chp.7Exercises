import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        while (true){
    System.out.println("Enter a number: ");
        int input = Integer.valueOf(in.nextLine());
        if (input < 0){
            System.out.println("Unsuitable number, try a new one");
            continue;
        }else if (input == 0){
            System.out.println("Exiting program....");
            break;
        }else if (input > 0){
            double square = Math.pow(input, 2);
            System.out.println(input + " squared is " + square);
            break;
        }
    }
}}