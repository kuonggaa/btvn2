import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một số: ");
        int number = scanner.nextInt();

        // Sử dụng lệnh rẽ nhánh để kiểm tra số nhập vào là số chẵn hay số lẻ
        if (number % 2 == 0) {
            System.out.println(number + " là số chẵn.");
        } else {
            System.out.println(number + " là số lẻ.");
        }

        // Sử dụng vòng lặp để in ra các số từ 1 đến số nhập vào
        System.out.println("Các số từ 1 đến " + number + " là:");
        for (int i = 1; i <= number; i++) {
            System.out.print(i + " ");
        }
    }
}
