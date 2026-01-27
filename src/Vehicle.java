import java.awt.*;

abstract class Vehicle {
    private Color color;
    private String modelName;

    public Vehicle(Color color, String modelName) {
        this.color = color;
        this.modelName = modelName;
    }

    public Color getColor() {
        return this.color;
    }
}


