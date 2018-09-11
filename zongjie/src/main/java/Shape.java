import java.io.Serializable;

class Shape {
    public String name;
}

class Circle extends Shape implements Serializable {
    private float radius;
    transient int color;
    public static String type = "Circle";
}
