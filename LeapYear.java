import java.util.Scanner;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ใส่ปีมาจ้าพ่อหนุ่ม: ");
        int year = scanner.nextInt();
        if (isLeapYear(year)) {
            System.out.println(year + " เป็นปีอธิกสุรทิน");
        } else {
            System.out.println(year + " ไม่เป็นปีอธิกสุรทิน");
        }
    }
}
