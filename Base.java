public class Base {
    //инициализация массива
    static String arr[][];
    public static void CreateMass (){
    arr = new String [100][6];}
    //печать массива
    public static void ShowArr() {
        System.out.println("База сотрудников:");
        System.out.println("Имя / Должность / Емейл / Номер тел / Размер зп / Возраст");
   for (int i = 0; i < Mass.s; ++i) {
      for (int j = 0; j < 6; ++j) {
        System.out.print(arr[i][j]+"   ");
      }
      System.out.println();
   }
   //Перпечень сотрудников старше сорока лет
        System.out.println("Сотрудники страше 40 лет:");
        for (int i = 0; i < Mass.s; ++i) {
            if (Integer.parseInt(arr[i][5])>40) {
                for (int j = 0; j < 6; ++j) {
                    System.out.print(arr[i][j]+"   ");
                }
}
            System.out.println();
        }
    }
}
