import java.util.Scanner;
public class bai_3
{
    public static void main(String[] args)
    {
        while(true)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("nhap phep toan ban muon: ");
            String s = sc.nextLine();
            System.out.print("nhap so thu nhat: ");
            double a = sc.nextDouble();
            System.out.print("nhap so thu hai: ");
            double b = sc.nextDouble();
            sc.nextLine();
            switch(s)
            {
                case "+":
                        System.out.println("ket qua la: "+(a+b));
                        break;
                case "-":
                        System.out.println("ket qua la: "+(a-b));
                        break;
                case "*":
                        System.out.println("ket qua la: "+(a*b));
                        break;
                case "/":
                        if(b==0)
                            System.out.println("loi phep tinh!");
                        else
                            System.out.println("ket qua la: "+(a/b));
                        break;  
                default:
                        System.out.println("loi phep tinh!");
                        break;         
            }
        }
    }
}
