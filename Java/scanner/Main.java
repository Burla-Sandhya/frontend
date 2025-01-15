import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System value = new Scanner(System.in); //if i replace at "Scanner" to String or Double --> it accepts only alphts or numbrs//
        System.out.println("Enter Input: ");
        System.err.println(value.nextLine());
    }
}