import java.util.Random;

public class grading {

    public static void main(String[] args) {
        int num = 100;
        Random rnd = new Random();
        System.out.println("Your grade is ");
        int n2 = rnd.nextInt(num);
        System.out.println(n2);
        if  (n2 >= 90) {
            System.out.println("You got an A");
        } else if (n2 <= 89 && n2 >= 80) {
            System.out.println("You got a B");
        } else if (n2 <= 79 && n2 >= 70) {
            System.out.println("you got a C");
        } else if (n2 <= 69 && n2 >= 60) {
            System.out.println("You got a D");
        } else {
            System.out.println("You Failed");
        }

    }
}
