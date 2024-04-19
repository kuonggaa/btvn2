import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhập vào một số nguyên dương: ");
            int number = scanner.nextInt();

            if (isPositiveNumber(number)) {
                System.out.println("Các số từ 1 đến " + number + " là:");
                System.out.println(generateSequence(number));
            } else {
                System.out.println("Số bạn nhập không phải là số nguyên dương.");
            }
        }
    }

    public static boolean isPositiveNumber(int number) {
        return number > 0;
    }

    public static String generateSequence(int number) {
        StringBuilder sequence = new StringBuilder();
        for (int i = 1; i <= number; i++) {
            sequence.append(i).append(" ");
        }
        return sequence.toString();
    }
}
