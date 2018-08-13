package Fine;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        // назначение переменных

        byte a1 = 1;
        short a2 = 10000;
        int a3 = 100000;
        long a4 = 5L;
        float a5 = 4.0f;
        double a6 = 3.14;
        boolean a7 = true;
        char a8 = 'd';

    System.out.println(met1(1,2,6,3));
    System.out.println(met2(13,4));
    System.out.println(met3(-2));
    System.out.println(met4(-4));
    met5("Vasya");
met6();







    }
       //метод 1

      public static int met1(int a,int b,int c,int d)
        {  int x;
                x=c/d;
                x=b+x;
                x=a*x;
        return x;}

        //метод2

    public static boolean met2(int a,int b)
    {int x= a+b;
    boolean z;
    if (10<=x&20>=x)
    {z=true;}
    else
    {z=false;}
        return z; }

        //метод 3

    public static char met3(int a)
    {  char x;
        if (a>0)
        {x='+';}
        else
        {x='-';}
        return x;}

    //метод 4

    public static boolean met4(int a)
    {  boolean x;
        if (a>0)
        {x=false;}
        else
        {x=true;}
        return x;}

    //метод 5

    public static String met5(String a)
    { String x = a;
        System.out.println("Привет,"+x);
        return x;
        }

        //метод 6
//немного не успел дописать про 100 и 400 лет, но логика сохраняется:
// формируется массив исключений и два дополнительных логических оператора
    public static void met6(){
    Date d = new Date();
    SimpleDateFormat format1 = new SimpleDateFormat("yyyy");
    int year = Integer.parseInt(format1.format(d));
    System.out.println(year);
    int qx;
    int alt=0;
    int [] qt= new int[750];
        for (qx=0; qx<750; qx=qx+1) {
            qt[qx] = qx * 4;
            if (year == qt[qx]) {
                System.out.println("Високосный");
alt =1;}
            }
if (alt !=1)
{System.out.println("Не високосный");
        }

}}
