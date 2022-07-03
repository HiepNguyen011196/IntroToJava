import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number (max 3 digits):");
        int number = scanner.nextInt();

        int ones = number % 100;
        int tens = number % 10;
        if (number < 10 && number >= 0) {
            switch (ones) {
                case 0 -> System.out.println("");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
            }
        } else if (number < 20) {
            switch (tens) {
                case 0 -> System.out.println("");
                case 1 -> System.out.println("Eleven");
                case 2 -> System.out.println("Twelves");
                case 3 -> System.out.println("Thirteen");
                case 4 -> System.out.println("Fourteen");
                case 5 -> System.out.println("Fifteen");
                case 6 -> System.out.println("Sixteen");
                case 7 -> System.out.println("Seventeen");
                case 8 -> System.out.println("Eighteen");
                case 9 -> System.out.println("Nineteen");
            }
        } else if (number < 100) {
            int tens1 = number / 10;
            int ones1 = number % 10;
            String result = "";
            switch (tens1) {
                case 2 -> result += "Twenty ";
                case 3 -> result += "Thirty ";
                case 4 -> result += "Forty ";
                case 5 -> result += "Fifty ";
                case 6 -> result += "Sixty ";
                case 7 -> result += "Seventy ";
                case 8 -> result += "Eighty ";
                case 9 -> result += "Ninety ";
            }
            switch (ones1) {
                case 1 -> result += "One";
                case 2 -> result += "Two";
                case 3 -> result += "Three";
                case 4 -> result += "Four";
                case 5 -> result += "Five";
                case 6 -> result += "Six";
                case 7 -> result += "Seven";
                case 8 -> result += "Eight";
                case 9 -> result += "Nine";
            }
            System.out.println(result);
        } else if (number < 1000) {
            int hundreds = number / 100;
            int tens2 = number % 100 / 10;
            int ones2 = number % 10;
            String result1 = "";
            switch (hundreds) {
                case 1 -> result1 += "One hundred and ";
                case 2 -> result1 += "Two hundreds and ";
                case 3 -> result1 += "Three hundreds and ";
                case 4 -> result1 += "Four hundreds and ";
                case 5 -> result1 += "Five hundreds and ";
                case 6 -> result1 += "Six hundreds and ";
                case 7 -> result1 += "Seven hundreds and ";
                case 8 -> result1 += "Eight hundreds and ";
                case 9 -> result1 += "Nine hundreds and ";
            }
            switch (tens2) {
                case 1 -> result1 += "Ten ";
                case 2 -> result1 += "Twenty ";
                case 3 -> result1 += "Thirty ";
                case 4 -> result1 += "Forty ";
                case 5 -> result1 += "Fifty ";
                case 6 -> result1 += "Sixty ";
                case 7 -> result1 += "Seventy ";
                case 8 -> result1 += "Eighty ";
                case 9 -> result1 += "Ninety ";
            }
            switch (ones2) {
                case 1 -> result1 += "One";
                case 2 -> result1 += "Two";
                case 3 -> result1 += "Three";
                case 4 -> result1 += "Four";
                case 5 -> result1 += "Five";
                case 6 -> result1 += "Six";
                case 7 -> result1 += "Seven";
                case 8 -> result1 += "Eight";
                case 9 -> result1 += "Nine";
            }
            System.out.println(result1);
        } else System.out.println("Out of Ability");
    }
}
