public class Base {
    //������������� �������
    static String arr[][];
    public static void CreateMass (){
    arr = new String [100][6];}
    //������ �������
    public static void ShowArr() {
        System.out.println("���� �����������:");
        System.out.println("��� / ��������� / ����� / ����� ��� / ������ �� / �������");
   for (int i = 0; i < Mass.s; ++i) {
      for (int j = 0; j < 6; ++j) {
        System.out.print(arr[i][j]+"   ");
      }
      System.out.println();
   }
   //������� ����������� ������ 40 ���
        System.out.println("���������� ������ 40 ���:");
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
