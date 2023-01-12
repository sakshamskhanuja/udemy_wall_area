public class Main {
    public static void main(String[] args) {
        Wall wall = new Wall(5, 4);

        // Prints the area.
        System.out.println("area= " + wall.getArea());

        // Setting a negative height.
        wall.setHeight(-1.5);

        // Prints the width, height and area.
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}