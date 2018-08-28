/**
 * Geekbrains. Java Level 1
 *
 * @ Домашнее задание к уроку 6
 * @ Golovanov Igor
 */
package Fine;
import java.util.Scanner;
public class Main {
    public static int x;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a;
        double b;
        //тест кошки
        AnimalParent c = new Cat();
        System.out.println("Input Cat Run dist (int)");
        c.Run(a = Integer.parseInt(sc.next()));
        System.out.println("Input Cat Swim dist (int)");
        c.Swim(a = Integer.parseInt(sc.next()));
        System.out.println("Input Cat Jump dist (double)");
        c.Jump(b = Double.parseDouble(sc.next()));
        //тест собаки
        System.out.println("Please, choose Dog: 0 - hound, 1 - other breed");
        x = Integer.parseInt(sc.next());
        AnimalParent d = new Dog();
        System.out.println("Input Dog Run dist (int)");
        d.Run(a = Integer.parseInt(sc.next()));
        System.out.println("Input Dog Swim dist (int)");
        d.Swim(a = Integer.parseInt(sc.next()));
        System.out.println("Input Dog Jump dist (double)");
        d.Jump(b = Double.parseDouble(sc.next()));
    }
}
