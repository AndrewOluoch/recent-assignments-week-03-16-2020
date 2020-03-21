package homework;

import java.util.Scanner;

public class LoanShark {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your income?");

        int userInput = scanner.nextInt();


        System.out.println("How many years have you been with your company?");
        int years = scanner.nextInt();


        if ((userInput > 79999) && (years <2)){
                System.out.println("Yay, you qualify for a loan");
        }else {
            System.out.println("You are " + (80000 - userInput) + " short of getting a loan" + " you are " + (3-years) + " years short");
    }
    }
    }

