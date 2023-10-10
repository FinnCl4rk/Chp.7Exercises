import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the number 6");
            int userInput = Integer.valueOf(input.nextLine());
            if (userInput != 6){
                System.out.println("Wrong number, try again");
                continue;
            }else if (userInput == 6){
                System.out.println("You did it, good job");
                break;
            }else {
                System.out.println("I don't even know what you put in but it isn't 6, try again");
            }
        }
        System.out.println("Thanks for entering the number 6");
    }
}
