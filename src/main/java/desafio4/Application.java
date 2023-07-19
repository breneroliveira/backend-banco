package desafio4;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine();
            String decipheredLine = decipherLine(line);
            System.out.println(decipheredLine);
        }
    }

    public static String decipherLine(String line) {
        int halfLength = line.length() / 2;
        StringBuilder decipheredLine = new StringBuilder();

        for (int i = halfLength - 1; i >= 0; i--) {
            decipheredLine.append(line.charAt(i));
        }

        for (int i = line.length() - 1; i >= halfLength; i--) {
            decipheredLine.append(line.charAt(i));
        }

        return decipheredLine.toString();
    }
}