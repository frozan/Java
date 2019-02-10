package ClassesAndObjects;

public class Rectangle {
    private final int MAX_LEVEL = 100;
    private final int MIN_LEVEL = 0;
    private int length, width, shade;

    public Rectangle ( int side1, int side2, int level) {
        length = side1;
        width = side2;
        shade = level;
    }

    public int area() {
        return length * width;
    }

    public void set_shade(int adjustment) {
        int new_level = shade + adjustment;

        if (new_level >= MIN_LEVEL)
            if (new_level <= MAX_LEVEL)
                shade = new_level;
            else
                System.out.println("New shading level is too high");
        else
            System.out.println("New shading level is too low");
    }
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(1,2,100);
        rec.area();
        rec.set_shade(15);
    }
}
