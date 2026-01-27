import java.awt.*;

public class Main {
    static void main(String[] args) {
        Car bil = new Car(Color.GREEN,"V70",new Engine(90,true), 4);

        bil.startEngine();
        bil.incrementSpeed(20);
        bil.turnRight();
        bil.move();
    }
}
