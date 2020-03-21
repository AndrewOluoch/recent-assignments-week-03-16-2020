import java.util.Scanner;

public class ArrayDrills
{
    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        String a = "(6, [1,2,6])";
        boolean condition =true;
        while (condition)
        {
            System.out.println("enter array");
            String answer = input.nextLine();
            if ( answer.equals(a) );
            {
                System.out.println("correct");
                condition = false;
            }
        }


    }
}
