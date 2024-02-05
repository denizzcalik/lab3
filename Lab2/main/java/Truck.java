package Lab2.main.java;

import java.awt.*;

public abstract class Truck extends Car{

    public Attachment attachment;
    public Truck(int doors, int horsepower, Color carcolor, String model, double x, double y, Attachment attachment) {
        super(doors, horsepower, carcolor, model, x, y, CarSize.LARGE);
        this.attachment = attachment;

    }
    @Override
    protected double speedFactor() {
        if (!this.attachment.attachmentInUse()) {
            return getEnginePower() * 0.01;
  }
        return 0;
    }
}





