package b1;

import java.util.Scanner;

public class month {
	public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return -1; 
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
    
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String monthInput;
        int year;

        while (true) {
            System.out.print("Enter the month: ");
            monthInput = keyboard.nextLine().trim().toLowerCase();

            System.out.print("Enter the year: ");
            if (keyboard.hasNextInt()) {
                year = keyboard.nextInt();
                if (year < 0) {
                    System.out.println("Please enter a valid year.");
                    keyboard.nextLine();  
                    continue;
                }
            } else {
                System.out.println("Please try again.");
                keyboard.nextLine(); 
                continue;
            }

            int monthNumber = getMonthNumber(monthInput);
            if (monthNumber == -1) {
                System.out.println("Please try again.");
                keyboard.nextLine(); 
            } else {
                int days = getDaysInMonth(monthNumber, year);
                System.out.println(days + " days.");
                break;
            }
        }
        keyboard.close();
    }

    public static int getMonthNumber(String monthInput) {
        switch (monthInput) {
            case "January": case "Jan.": case "Jan": case "1":
                return 1;
            case "February": case "Feb.": case "Feb": case "2":
                return 2;
            case "March": case "Mar.": case "Mar": case "3":
                return 3;
            case "April": case "Apr.": case "Apr": case "4":
                return 4;
            case "May": case "5":
                return 5;
            case "June": case "Jun.": case "Jun": case "6":
                return 6;
            case "July": case "Jul.": case "Jul": case "7":
                return 7;
            case "August": case "Aug.": case "Aug": case "8":
                return 8;
            case "September": case "Sept.": case "Sep": case "9":
                return 9;
            case "October": case "Oct.": case "Oct": case "10":
                return 10;
            case "November": case "Nov.": case "Nov": case "11":
                return 11;
            case "December": case "Dec.": case "Dec": case "12":
                return 12;
            default:
                return -1;
        }
    }
}

