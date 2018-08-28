package Fine;
public class Dog extends AnimalParent {
    public Dog() {
        //Выбор дистанции для разных пород
        if (Main.x == 0)
            run = 600;
        else
            run = 400;
        swim = 10;
        jump = 0.5;
    }
}
