import java.util.ArrayList;

public class Bai_9 {
    public static void main(String[] args) 
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println("Danh sach so nguyen la:");
        for (int num : numbers) 
            System.out.print(num + " "); 
    }
}
