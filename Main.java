/**
 *  Geekbrains. Java. Level 1
 *  �������� ������� � ����� 5
 * @ author Golovanov Igor
 * @ version Aug 26, 2018
 */

import java . util . Scanner ;
public class Main {
    // � ������ Mass ���������� �����, ����������� ����������� ���� ������ � ����������
    // � ����������������� �����������, ������� �������� ������ � ���������� � �������� � ���� ������
    // � ������ Base ��������� ������, ����������� ������� �� ���������� ������ Mass
    public  static  Scanner  sc  =  new  Scanner ( System . in);
    public static void main(String[] args) {
        //������������� ���������� � main
        Base.CreateMass();
        Mass.Ins ();
        int m = 0;
        int n = 0;
        //���������� �����������
        do{
        System.out.println("������ �������� ��� ����������? 0-��, 1 - ���");
        m = Integer.parseInt(sc.next());
        if (m==0){
            Mass.Ins ();
        }}
        while (m==0);
        //�������� ������� ������
        System.out.println("������ ���������� ����? 0-��, 1 - ���");
        n=Integer.parseInt(sc.next());
        if (n==0)
           { Base.ShowArr();}
        else 
           {System.exit(0);}
        }
    }


