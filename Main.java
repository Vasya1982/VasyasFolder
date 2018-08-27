/**
 *  Geekbrains. Java. Level 1
 *  Домашнее задание к уроку 5
 * @ author Golovanov Igor
 * @ version Aug 26, 2018
 */

import java . util . Scanner ;
public class Main {
    // В классе Mass содержатся метод, позволяющий осуществить ввод данных о сотруднике
    // и параметризованный конструктор, который получает данные о сотруднике и помещает в базу данных
    // В классе Base содежится массив, наполняемый данными от экзепляров класса Mass
    public  static  Scanner  sc  =  new  Scanner ( System . in);
    public static void main(String[] args) {
        //инициализация переменных в main
        Base.CreateMass();
        Mass.Ins ();
        int m = 0;
        int n = 0;
        //добавление сотрудников
        do{
        System.out.println("Хотите добавить еще сотрудника? 0-да, 1 - нет");
        m = Integer.parseInt(sc.next());
        if (m==0){
            Mass.Ins ();
        }}
        while (m==0);
        //просмотр массива данных
        System.out.println("Хотите посмотреть базу? 0-да, 1 - нет");
        n=Integer.parseInt(sc.next());
        if (n==0)
           { Base.ShowArr();}
        else 
           {System.exit(0);}
        }
    }


