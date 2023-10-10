import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Shall we carry on? ");
            String userInput = input.nextLine();
            if (userInput.equals("yes")) {
                System.out.println("Sounds great, here we go!");
            } else if (userInput.equals("no")) {
                break;
            }
        }System.out.println("Okay :(");
    }
}