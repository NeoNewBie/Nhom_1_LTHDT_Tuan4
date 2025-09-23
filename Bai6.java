import java.util.Scanner;
public class Bai6 {
    public static int UCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int BCNN(int a, int b) {
        return (a * b) / UCLN(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen thu nhat: ");
        int x = sc.nextInt();
        System.out.print("Nhap so nguyen thu hai: ");
        int y = sc.nextInt();
        System.out.println("UCLN cua " + x + " va " + y + " la: " + UCLN(x, y));
        System.out.println("BCNN cua " + x + " va " + y + " la: " + BCNN(x, y));
    }
}
