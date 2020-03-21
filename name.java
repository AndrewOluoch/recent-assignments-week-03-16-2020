import java.util.Scanner;
public class name
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        boolean input = true;
        while(input)
        {
            System.out.println("What's your name?");
            String name = scanner.nextLine();

            if(name.equalsIgnoreCase("Alice" ) )
            {
                System.out.println("Welcome " + name);

            }else if (name.equalsIgnoreCase("Bob"))
            {
                System.out.println("welcome " + name);
                input =false;
            }
        }
    }
}