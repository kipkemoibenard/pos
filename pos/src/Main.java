import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        int age = 30;
        age = 37;
        System.out.println("Your age is " + age);

        int x = 1;
        int y = 2;
        System.out.println(x <= y);

        int love = 4;
        String trueLove = love > 5 ? "Marry" : "Run very fast";
        System.out.println(trueLove);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        if (number % 5 == 0) {

            System.out.println("Divisible by 5");
        } else if (number % 3 == 0) {

            System.out.println("Divisible by 3");
        } else {

            System.out.println("Number neither divisible by 3 nor 5");
        }
        Scanner sd = new Scanner(System.in);
        System.out.println("Enter a number");
        String numb = sd.next();
        System.out.println("Your number is " + numb);
        int z = Integer.parseInt(numb);
        System.out.println(z);

     for (int j=0; j<3; j++){
         System.out.println(j);
     }
     Set<Integer> s=new HashSet<Integer>();
     s.add(2);
        s.add(2);
        s.add(23);
        s.add(12);
        s.add(27);
        s.add(100);
        s.remove(12);//removes an element from a set
        s.isEmpty();
        System.out.println(s);
        boolean l=s.contains(100);//checks if an element is contained in a set.
        System.out.println(l);
       boolean f=s.isEmpty();
        System.out.println(f);

    }

}
