package Assigment5;

public class Keyboard extends Gadget {

    private String color;
    private boolean isMechanical;

    public Keyboard(String brand, int price, String color, boolean isMechanical) {
        super(brand, price);
        this.color = color;
        this.isMechanical = isMechanical;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isMechanical() {
        return isMechanical;
    }

    public void setMechanical(boolean mechanical) {
        isMechanical = mechanical;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "color='" + color + '\'' +
                ", isMechanical=" + isMechanical +
                '}';
    }
}
