import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    @DisplayName("Första testet")
    void notMovingWhenEngineOff() {
        Car bil = new Car(Color.GREEN,"V70",new Engine(90,true), 4);
        double startX = bil.getxPos();
        double startY = bil.getYPos();

        bil.stopEngine();
        bil.move();
        System.out.println("Kontrollerar om bilen rör sig när motorn är av från början...");
        assertEquals(startX, bil.getxPos());
        assertEquals(startY, bil.getYPos());

        System.out.println("Kontrollerar om den rör sig om motorn stängs av");
        bil.incrementSpeed(10);
        bil.move();
        startX = bil.getxPos();
        startY = bil.getYPos();
        bil.stopEngine();
        bil.move();
        assertEquals(startX, bil.getxPos());
        assertEquals(startY, bil.getYPos());




    }
}