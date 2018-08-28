package Fine;
public class AnimalParent {
    protected int run;
    protected int swim;
    protected double jump;
    boolean check;
    public void Run(int a) {
        if (a <= run) {
            check = true;
        } else check = false;
        System.out.println(check);
    }
    public void Swim(int b) {
        if (b <= swim) {
            check = true;
        } else check = false;
        System.out.println(check);
    }
    public void Jump(double c) {
        if (c <= jump) {
            check = true;
        } else check = false;
        System.out.println(check);
    }
}
