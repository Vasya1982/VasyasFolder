package Fine;

public class Base {
    //инициализация массива
    static String arr[][];

    public static void CreateMass() {
        arr = new String[100][3];
    }

    //печать массива
    public static void ShowArr() {
        System.out.println("История кормления котов:");
        System.out.println("Имя / Аппетит / Сытость ");
        for (int i = 0; i < Main.mass; ++i) {
            for (int j = 0; j < 3; ++j) {
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
        }


    }
}
