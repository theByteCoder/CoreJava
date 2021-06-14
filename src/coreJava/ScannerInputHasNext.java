package coreJava;

import java.util.Scanner;
public class ScannerInputHasNext {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter an Integer : ");
        int i = scan.nextInt();
        System.out.println("Int: " + i);
        
        System.out.println("Enter a double : ");
        double d = scan.nextDouble();
        System.out.println("Double: " + d);

        String s="";
        System.out.println("Enter a String : ");
        while(scan.hasNext())
        {
            s=scan.nextLine();
        System.out.println("String: " +s);
        }
        scan.close();
    }
}

