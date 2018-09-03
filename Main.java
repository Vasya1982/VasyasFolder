package Fine;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static int mass = 0;

    public static void main(String[] args) {
        int kitten = 0;
        int k2;
        String k3;
        Plate plate = new Plate();
        Base base = new Base();
        base.CreateMass();
        plate.Plat(100);
        plate.info();
        do {
            System.out.println("Дайте коту имя");
            k3 = sc.next();
            base.arr[mass][0] = k3;
            System.out.println("Укажите аппетит кота");
            k2 = Integer.parseInt(sc.next());
            base.arr[mass][1] = Integer.toString(k2);
            Cat cat = new Cat(k3, k2);
            cat.eat(plate);
            plate.info();
            base.arr[mass][2] = Boolean.toString(plate.s);
            System.out.println("Хотите добавить еды в тарелку? 0=да, 1-нет");
            kitten = Integer.parseInt(sc.next());
            if (kitten == 0) {
                plate.inreaseFood(20);
                plate.info();
            }
            System.out.println("Хотите покормить еще одного кота? 0=да, 1-нет");
            kitten = Integer.parseInt(sc.next());
            mass = mass + 1;
        }
        while (kitten == 0);
        base.ShowArr();
    }
}

