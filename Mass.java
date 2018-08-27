import java . util . Scanner ;

public class Mass {
    String psName;
    String psPos;
    String psMail;
    String psPhone;
    String psSalary;
    String psAge;
    public  static  Scanner  sc  =  new  Scanner ( System . in);
    static int s=0;

    //формирование шаблона экземпляров
    public Mass(String psName, String psPos, String psMail, String psPhone, String psSalary, String psAge) {
        this.psName = psName;
        this.psPos = psPos;
        this.psMail = psMail;
        this.psPhone = psPhone;
        this.psSalary = psSalary;
        this.psAge = psAge;
        System.out.println("Вы ввели следующие данные:" + "\n" +
                        "Имя  - " + psName + "\n" +
                        "Должность - " + psPos + "\n" +
                        "Емейл - " + psMail + "\n" +
                        "Номер тел - " + psPhone + "\n" +
                        "Размер з/п - " + psSalary + "\n" +
                        "Возраст - " + psAge);
        //передача данных экземпляра в массив данных
        Base.arr[s][0] = psName;
        Base.arr[s][1] = psPos;
        Base.arr[s][2] = psMail;
        Base.arr[s][3] = psPhone;
        Base.arr[s][4] = psSalary;
        Base.arr[s][5] = psAge;
        s=s+1;
    }

    //Метод ввода данных
    public static void Ins() {
        String psName;
        String psPos;
        String psMail;
        String psPhone;
        String psSalary;
        String psAge;
        System.out.println("Введите данные о сотруднике");
        System.out.println("Введите имя");
        psName = sc.next();
        System.out.println("Введите должность");
        psPos = sc.next();
        System.out.println("Введите емейл");
        psMail = sc.next();
        System.out.println("Введите номер тел");
        psPhone = sc.next();
        System.out.println("Введите размер з/п");
        psSalary = sc.next();
        System.out.println("Введите возраст");
        psAge = sc.next();
        //создание экземпляра
        Mass Mass1 = new Mass(psName, psPos, psMail, psPhone, psSalary, psAge);
    }
}


