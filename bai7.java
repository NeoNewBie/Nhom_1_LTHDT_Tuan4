import java.util.Scanner;
public class bai7 
{   
    public static Scanner sc = new Scanner(System.in);
    public static int []A;
public static void Nhapmang(int n)
{
    A=new int[n];
    for(int i=0; i<n; i++)
    {
        System.out.print("A["+i+"]=");
            A[i]=sc.nextInt();
    }
}
public static void Xuat(int n)
{
    System.out.println("Cac phan tu trong mang");
    for(int i=0;i<n;i++)
        System.out.println("A["+i+"]="+A[i]);
}
public static int Tinhtong(int n)
{
    int tong=0;
    for(int i=0;i<n;i++)
        tong+=A[i];
    return tong;
}
public static void main(String[] args)
{
    System.out.print("Nhap so phan tu: ");
    int n=sc.nextInt();
    Nhapmang(n);
    Xuat(n);
    int tong= Tinhtong(n);
    System.out.print("Tong cac phan tu trong mang la: "+tong);
}
}
