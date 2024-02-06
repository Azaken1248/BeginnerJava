class Rectangle {
    private int width;
    private int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public String toString() {
        return "(" + width + "x" + height + ")";
    }
}

public class RectanglesMain {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3, 4);

        System.out.println(r1.toString());
    }
}
