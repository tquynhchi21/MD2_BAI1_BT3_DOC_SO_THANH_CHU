import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to translate to string :");
        int number = scanner.nextInt();
        int hundreds = number / 100;
        int dozens = number % 100 / 10;
        int ones = number % 10;
        String strUnit = "";
        String strDozens = "";
        String strDozens1 = "";
        String strHundreds = "";
        if (number == 0) {
            System.out.println("Zero");
        }
        switch (ones) {
            case 1:
//                System.out.print(" One");
                strUnit = "One ";
                break;
            case 2:
//                System.out.print(" Two ");
                strUnit = "Two";
                break;
            case 3:
//                System.out.print(" Three ");
                strUnit = "Three";
                break;
            case 4:
//                System.out.print(" Four ");
                strUnit = "Four";
                break;
            case 5:
//                System.out.print(" Five ");
                strUnit = "Five";
                break;
            case 6:
//                System.out.print(" Six ");
                strUnit = "Six";
                break;
            case 7:
//                System.out.print(" Seven ");
                strUnit = "Seven";
                break;
            case 8:
//                System.out.print(" Eight ");
                strUnit = "Eight";
                break;
            case 9:
//                System.out.print(" Nine ");
                strUnit = "Nine";
                break;

        }

        switch (dozens) {
            case 2:
//                System.out.print(" Twenty");
                strDozens1 = "Twenty";
                break;
            case 3:
//                System.out.print(" Thirty");
                strDozens1 = "Thirty";
                break;
            case 4:
//                System.out.print(" Forty");
                strDozens1 = "Forty";
                break;
            case 5:
//                System.out.print(" Fifty");
                strDozens1 = "Fifty";
                break;
            case 6:
//                System.out.print(" Sixty");
                strDozens1 = "Sixty";
                break;
            case 7:
//                System.out.print(" Seventy");
                strDozens1 = "Seventy";
                break;
            case 8:
//                System.out.print(" Eighty");
                strDozens1 = "Eighty";
                break;
            case 9:
//                System.out.print(" Ninety");
                strDozens1 = "Ninety";
                break;
        }
        switch (hundreds) {
            case 1:
//                System.out.print(" One");
                strHundreds = "One";
                break;
            case 2:
                strHundreds = "Two";
                break;
            case 3:
//                System.out.print(" Three ");
                strHundreds = "Three";
                break;
            case 4:
//                System.out.print(" Four ");
                strHundreds = "Four";
                break;
            case 5:
//                System.out.print(" Five ");
                strHundreds = "Five";
                break;
            case 6:
//                System.out.print(" Six ");
                strHundreds = "Six";
                break;
            case 7:
//                System.out.print(" Seven ");
                strHundreds = "Seven";
                break;
            case 8:
//                System.out.print(" Eight ");
                strHundreds = "Eight";
                break;
            case 9:
//                System.out.print(" Nine ");
                strHundreds = "Nine";
                break;
        }
        switch (number % 100) {
            case 10:
                strDozens = "Ten";
                break;
            case 11:
//                System.out.print(" Eleven");
                strDozens = "Eleven";
                break;
            case 12:
//                System.out.print(" Twelve");
                strDozens = "Twelve";
                break;
            case 13:
//                System.out.print(" Thirteen");
                strDozens = "Thirteen";
                break;
            case 14:
//                System.out.print(" Fourteen");
                strDozens = "Fourteen";
                break;
            case 15:
//                System.out.print(" Fifteen");
                strDozens = "Fifteen";
                break;
            case 16:
//                System.out.print(" Sixteen");
                strDozens = "Sixteen";
                break;
            case 17:
//                System.out.print(" Seventeen");
                strDozens = "Seventeen";
                break;
            case 18:
//                System.out.print(" Eighteen");
                strDozens = "Eighteen";
                break;
            case 19:
//                System.out.print(" Nineteen");
                strDozens = "Nineteen";
                break;
        }
        if (number < 10) {
            System.out.println(strUnit);
        } else if (number < 20) {
            System.out.println(strDozens);
        } else if (number < 100) {
            System.out.println(strDozens1 + " " + strUnit);
        } else if (hundreds != 0) {
        } else if (number < 999) {
            System.out.println(strHundreds + " Hundreds");
        }
    }
}