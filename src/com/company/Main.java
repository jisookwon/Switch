package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String month="";
        System.out.print("Enter the number of days(28/29/30/31) : ");
        int days = scan.nextInt();
        switch(days){
            case 28:{ month="February";
                //System.out.println("February");
                break;}
            case 29:{ month="February";
                //System.out.println("February");
                break;}
            case 31:{ month="January, March, May, July, August, October, December";
                //System.out.println("January, March, May, July, August, October, December");
                break;}
            case 30:{ month="April, June, September, November";
                //System.out.println("April, June, September, November");
                break;}
            default:{
                System.out.println("There's no months that have " + days + " days");
                break;}
        }
        if (28<=days && days<=31){
            System.out.println ("The "+days+" days month is "+month);// write your code here
        }
    }
}
