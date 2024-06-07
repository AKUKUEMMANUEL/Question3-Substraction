/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akuku
 */
import java.util.Scanner;

public class Subtraction {
    public static void main(String[]args){
        int number1 = (int)(Math.random()*10);
         int number2 = (int)(Math.random()*10);
         
         if (number1<number2){
             int temp = number1;
             number1 = number2;
             number2 = temp;
         }
         System.out.print("What is" +number1+ "-" +number2+ "?");
         
         Scanner scanner = new Scanner(System.in);
         int answer = scanner.nextInt();
         
         if(answer ==(number1-number2)){
             System.out.println("Correct!");
         }
         else{
             System.out.println("Incorrect"+(number1-number2)+"'");
         }
    }
}
