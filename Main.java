/**
*Домашнее задание к уроку 2
* @Golovanov Igor
*/
package Fine;
public class Main {
    public static void main(String[] args) {
        int [] mass = {2,1, 9, 7, 0, -4,6, 3};
Ex5(mass);
Ex6(mass);
    }
    // Задание 5
public static void Ex5(int [] mass)
{
    int count;
    int current;
    int max = 0;
    int min = 0;
for (count = 0; count < mass.length; count = count+1)
{
current = mass[count];
    if (current > max) {
        max = current;
    }
}
    for (count = 0; count < mass.length; count = count+1)
    {
        current = mass[count];
        if (current < min) {
            min = current;
        }
    }
System.out.println("Massive max No is "+max);
    System.out.println("Massive min No is "+min);
}
// Задание 6
public static void Ex6(int [] mass) {
    int count;
    int current=0;
    int current2 = 0;
    boolean equal = false;
    for (count = 0; count < mass.length; count = count+1) {
    current = current+mass[count];
    }
    for (count = 0; count < mass.length; count = count+1) {
        current2 = current2+mass[count];
        if (current2 == current/2)
        {equal= true;
        break;}
    }
    System.out.println("Наличие в масиве медианы "+equal);
}
}
