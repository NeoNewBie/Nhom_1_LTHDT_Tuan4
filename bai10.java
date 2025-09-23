import java.util.ArrayList;
import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ds = new ArrayList<>();
        System.out.print("Nhap so luong phan tu ban dau: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i+1) + ": ");
            ds.add(sc.nextInt());
        }
        System.out.println("Danh sach ban dau: " + ds);
        System.out.print("Nhap vi tri can them: ");
        int viTriThem = sc.nextInt();
        System.out.print("Nhap gia tri can them: ");
        int giaTriThem = sc.nextInt();

        if (viTriThem >= 0 && viTriThem <= ds.size()) {
            ds.add(viTriThem, giaTriThem);
            System.out.println("Danh sach sau khi them: " + ds);
        } else {
            System.out.println("Vi tri khong hop le!");
        }
        System.out.print("Nhap vi tri can xoa: ");
        int viTriXoa = sc.nextInt();
        if (viTriXoa >= 0 && viTriXoa < ds.size()) {
            ds.remove(viTriXoa);
            System.out.println("Danh sach sau khi xoa: " + ds);
        } else {
            System.out.println("Vi tri khong hop le!");
        }
    }
}
