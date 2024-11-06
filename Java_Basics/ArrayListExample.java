
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    ArrayList<Integer> list=new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    System.out.println(list);
    ArrayList<Integer> list1=new ArrayList<>();
    for(int i=0;i<5;i++)
    {
        list1.add(sc.nextInt());
    }
    for (int i = 0; i < 5; i++) {
        System.out.println(list1.get(i));
    }
    System.out.println(list1);
}
}
