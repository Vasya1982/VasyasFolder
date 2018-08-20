/**
 *  Geekbrains. Java Level 1
* @ Домашнее задание к уроку 3
* @ Golovanov Igor
*/

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

   public static Scanner sc = new Scanner(System.in);
   public static Random rand = new Random();
    
public static void main(String[] args) {
Ex1();
    }

//Задание 1

public static void Ex1(){
    int e;
    int d=-1;
    int m;
    e=rand.nextInt(10);
    
    for (m=0; m<3; m=m+1) {
        System.out.println("Insert numeral 0-9, please");
        d = sc.nextInt();
        
        if (d == e) {
        System.out.println("True ))");
        break;
        }
        
        if (d > e) {
        System.out.println("The number is less");
        }
        
        if (d < e) {
        System.out.println("The number is greater");
        }

    }
        
    if (d!=e){
    System.out.println("False (( \n The number was " + e);
    }
    
    Ex1add();
    
    }
    
    public static void Ex1add() {
    
    int fin;
    System.out.println("Wanna repeat? \n 1 - yes, \n 0 (or other) - no");
    fin=sc.nextInt();
    
    if (fin==1){
    Ex1();
    }
    
    else{
    System.exit(0);
    }
    
    }

}