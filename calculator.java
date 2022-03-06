package com.company;
import java.util.*;

 class calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number ");
        int a = sc.nextInt();
        System.out.print("Enter second number ");
        int b = sc.nextInt();
        System.out.println("Choose operator:\n 1 = + \n 2 = - \n 3 = * \n 4 = / \n 5 = % ");
        int c = sc.nextInt();
        int sum = a+b;
        int dif = a-b;
        int mul = a*b;
        int div = a/b;
        int mol = a%b;

        switch(c){
            case 1:
                System.out.println("addition of two numbers is : "+ sum);
                break;
            case 2:
                System.out.println("subtraction of two numbers is : "+ dif);
                break;
            case 3:
                System.out.println("multiplication of two numbers is : "+ mul);
                break;
            case 4:
                System.out.println("division of two numbers is : "+ div);
                break;
            case 5:
                System.out.println("modulo of two numbers is : "+ mol);
                break;
            default:
                System.out.println("invalid input");
        }
    }
 }