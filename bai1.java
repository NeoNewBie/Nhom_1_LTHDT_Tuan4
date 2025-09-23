import java.util.Scanner;

public class bai1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap so n vao : ");
        n = sc.nextInt();
        if (n == 0) {
            System.out.println(" n là so 0");
        }
        else if (n < 0) {
            System.out.print(" n là so am ");
        }
            else{
                System.out.println(" n là so duong ");
            }
        sc.close();
        }
    }