import java.util.Scanner;

public class EmployeeWage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("กรุณาป้อนอัตราต่อชั่วโมง (n):");
        double n = scanner.nextDouble();
        System.out.println("กรุณาป้อนจำนวนชั่วโมงที่ทำงาน (m):");
        double m = scanner.nextDouble();

        double wage;
        if (m > 40) {
            double overtimeHours = m - 40;
            wage = (40 * n) + (overtimeHours * n * 1.5);
        } else {
            wage = m * n;
        }

        System.out.println("ค่าจ้างทั้งหมดคือ: " + wage);
    }
}
