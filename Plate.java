package Fine;

public class Plate {
    private int food​;
    boolean s;

    public void Plat(int food) {
        this.food​ = food;
    }

    public void decreaseFood(int n) {
        if (food​ >= n) {
            food​ -= n;
            s = true;
            System.out.println(s);
        } else {
            s = false;
            System.out.println(s);
        }
        ;
    }

    public void inreaseFood(int n) {

        food​ = n + food​;
    }

    public void info() {
        System.out.println("plate: " + food​);
    }
}
