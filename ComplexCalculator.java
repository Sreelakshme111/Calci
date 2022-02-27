package com.example.java;
import java.util.Scanner;

public class ComplexCalculator 
{
	
	    public static void main(String[] args) {
		
	        Scanner sn = new Scanner(System.in);
	        
	            System.out.print("ENter a numeric value s1 : ");
	            String s1 = sn.nextLine();
	        double d1=0;
	        try {
	           d1= Double.parseDouble(s1);
	        }
	        catch (NumberFormatException e) {
	            System.out.println("enter allowable format");
	        }

	            System.out.print("Enter a numeric value s2 : ");
	            String s2 = sn.nextLine();

	        double d2 = 0;
	        try {
	            d2 = Double.parseDouble(s2);
	        } catch (NumberFormatException e) {
	            System.out.println("Enter allowable format");
	        }
	        
	        System.out.print("chosse an operation +-*/ :");
	        String s3 = sn.nextLine();

	    switch (s3) {
	        case "+":
	            double result1 = d1 + d2;
	            System.out.println("result is:" + result1);
	            break;
	        case "-":
	            double result2 = d1 - d2;
	            System.out.println("result is:" + result2);
	            break;
	        case "*":
	            double result3 = d1 * d2;
	            System.out.println("result is:" + result3);
	            break;
	        case "/":
	            double result4 = d1 / d2;
	            
	            System.out.println("result is:" + result4);
	            break;
	        default:
	            System.out.println("unauthorized operator");         
	}
	    }
	}

