import java.util.Scanner;

public class MadLibs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How old are you?: ");
        int age = scanner.nextInt();
        System.out.println(age);

        System.out.print("What is your name?: ");
        String name = scanner.nextLine();

        

        scanner.close();
    }

}