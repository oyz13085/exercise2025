package W05;

import java.util.Scanner;

public class W05E03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice;
        do{
            System.out.print("Do you want to continue? (yes/no): ");
            choice = input.nextLine();
        }while(!choice.equals("yes") && !choice.equals("no"));

    }
}