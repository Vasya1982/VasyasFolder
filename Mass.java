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

    //������������ ������� �����������
    public Mass(String psName, String psPos, String psMail, String psPhone, String psSalary, String psAge) {
        this.psName = psName;
        this.psPos = psPos;
        this.psMail = psMail;
        this.psPhone = psPhone;
        this.psSalary = psSalary;
        this.psAge = psAge;
        System.out.println("�� ����� ��������� ������:" + "\n" +
                        "���  - " + psName + "\n" +
                        "��������� - " + psPos + "\n" +
                        "����� - " + psMail + "\n" +
                        "����� ��� - " + psPhone + "\n" +
                        "������ �/� - " + psSalary + "\n" +
                        "������� - " + psAge);
        //�������� ������ ���������� � ������ ������
        Base.arr[s][0] = psName;
        Base.arr[s][1] = psPos;
        Base.arr[s][2] = psMail;
        Base.arr[s][3] = psPhone;
        Base.arr[s][4] = psSalary;
        Base.arr[s][5] = psAge;
        s=s+1;
    }

    //����� ����� ������
    public static void Ins() {
        String psName;
        String psPos;
        String psMail;
        String psPhone;
        String psSalary;
        String psAge;
        System.out.println("������� ������ � ����������");
        System.out.println("������� ���");
        psName = sc.next();
        System.out.println("������� ���������");
        psPos = sc.next();
        System.out.println("������� �����");
        psMail = sc.next();
        System.out.println("������� ����� ���");
        psPhone = sc.next();
        System.out.println("������� ������ �/�");
        psSalary = sc.next();
        System.out.println("������� �������");
        psAge = sc.next();
        //�������� ����������
        Mass Mass1 = new Mass(psName, psPos, psMail, psPhone, psSalary, psAge);
    }
}


