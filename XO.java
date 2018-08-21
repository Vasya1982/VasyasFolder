/**
 *  Geekbrains. Java Level 1
* @ Домашнее задание к уроку 4
* @ Golovanov Igor
*/


import java . util . Random ;
import java . util . Scanner ;

public  class  XO  {
    public  static  int  SIZE;
    public  static  final  char  DOT_EMPTY  =  '•' ;
    public  static  final  char  DOT_X  =  'X' ;
    public  static  final  char  DOT_O  =  'O' ;
    public  static  char [][]  map ;
    public  static  Scanner  sc  =  new  Scanner ( System . in);
    public  static  Random  rand  =  new  Random ();
    public  static  void main ( String [] args )  {
        // Размер поля меняется динамически, право за пользователем
        System . out . println ( "Введите размеры поля" );
        SIZE  =  sc . nextInt ();
        initMap ();
        printMap ();
        while  ( true )  {
            humanTurn ();
            printMap ();
            if  ( Summa ( DOT_X ))  {
                System . out . println ( "Победил человек" );
                break ;              }
            if  ( isMapFull ())  {
                System . out . println ( "Ничья" );
                break ;              }
            aiTurn ();
            printMap ();
            if  ( Summa ( DOT_O ))  {
                System . out . println ( "Победил Искуственный Интеллект" );
                break ;              }
            if  ( isMapFull ())  {
                System . out . println ( "Ничья" );
                break ;              }          }
        System . out . println ( "Игра закончена" );      }
    public  static  boolean isMapFull ()  {
        for  ( int i  =  0 ; i  <  SIZE ; i ++)  {
            for  ( int j  =  0 ; j  <  SIZE ; j ++)  {
                if  ( map [ i ][ j ]  ==  DOT_EMPTY )  return  false ;              }          }
        return  true ;      }
    public  static  void aiTurn ()  {
        int x , y ;
        do  {
            x  =  rand. nextInt ( SIZE);
            y  =  rand . nextInt ( SIZE);          }
        while  (! isCellValid( x , y ));
        System . out . println ( "Компьютер походил в точку "  +  ( x  +  1 )  +  " "  +  ( y  +  1 ));
        map [ y ][ x ]  =  DOT_O ;      }
    public  static  void humanTurn ()  {
        int x , y ;
        do  {
            System . out . println ( "Введите координаты в формате X Y" );
            x  =  sc . nextInt ()  -  1 ;
            y  =  sc . nextInt ()  -  1 ;          }
        while  (! isCellValid ( x , y ));
        // while(isCellValid(x, y) == false)
        map [ y ][ x ]  =  DOT_X ;     }
    public  static  boolean isCellValid ( int x ,  int y )  {
        if  ( x  <  0  || x  >=  SIZE  || y  <  0  || y  >=  SIZE)  return  false ;
        if  ( map [ y ][ x ]  ==  DOT_EMPTY)  return  true ;
        return  false ;     }
    public  static  void initMap ()  {
        map  =  new  char [ SIZE][ SIZE ];
        for  ( int i  =  0 ; i  <  SIZE ; i ++)  {
            for  ( int j  =  0 ; j  <  SIZE; j ++)  {
                map [ i ][ j ]  =  DOT_EMPTY ;              }          }     }
    public  static  void printMap ()  {
        for  ( int i  =  0 ; i  <=  SIZE ; i ++)  {
            System . out . print ( i  +  " " );          }
        System . out . println ();
        for  ( int i  =  0 ; i  <  SIZE ; i ++)  {
            System . out . print (( i  +  1 )  +  " " );
            for  ( int j  =  0 ; j  <  SIZE ; j ++)  {
                System . out . print ( map [ i ][ j ]  +  " " );              }
            System . out . println ();          }
        System . out . println ();      }

        //новый метод посчета результатов

public static boolean Summa (char q1) {
        int w1;
        int w2;
        int sumF;
        int map2[][];
        map2 = new int[SIZE][SIZE]; //вспомогательный целочисленный массив для счета
    // замена нулей в массиве единицами, которые соответствуют крестикам
    for (w1 = 0; w1 < SIZE; w1 = w1 + 1) {
        for (w2 = 0; w2 < SIZE; w2 = w2 + 1) {
            if (map[w1][w2] == q1) {
                map2[w1][w2] = 1;
            }
        }
    }
    //подсчет сумм по строкам, столбцам и диагоналям
    //строки
    for (w1 = 0; w1 < SIZE; w1 = w1 + 1) {
        sumF = 0;
        for (w2 = 0; w2 < SIZE; w2 = w2 + 1) {
            sumF = sumF + map2[w1][w2];
        }
        if (sumF==SIZE)
            return true;
}
    //столбцы
    for (w1 = 0; w1 < SIZE; w1 = w1 + 1) {
        sumF = 0;
        for (w2 = 0; w2 < SIZE; w2 = w2 + 1) {
            sumF = sumF + map2[w2][w1];
        }
        if (sumF==SIZE)
            return true;
    }
    //диагональ 1
    sumF=0;
    for (w1 = 0; w1 < SIZE; w1 = w1 + 1) {
        sumF=sumF+map2[w1][w1];
        }
    if (sumF==SIZE)
        return true;
    //диагональ 2
    sumF=0;
    for (w1 = 0; w1 < SIZE; w1 = w1 + 1) {
        sumF=sumF+map2[w1][SIZE-(w1+1)];
    }
    if (sumF==SIZE)
        return true;
        return false;
}
}


