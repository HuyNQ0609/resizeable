public class Main {
    public static void main(String[] args) {
//        Shape[] shapes = new Shape[10];
//        shapes[0] =
//        shapes[1] =
//        shapes[2] =
//        shapes[3] =
//        shapes[4] =
//        shapes[5] =
//        shapes[6] =
//        shapes[7] =
//        shapes[8] =
//        shapes[9] =
        Shape[] shapes = new Shape[3];
        Main main = new Main();
        shapes[0] = new Circle("yellow",  false, 10);
        shapes[1] = new Rectangle("black", true, 10, 10);
        shapes[2] = new Square("orange", true, 10);
        for (Shape i : shapes) {
            System.out.println(i);
        }
        System.out.println(" ");
        main.Resize(shapes);
    }
    public void Resize(Shape[] array) {
        for (Shape i : array) {
            i.resize(Math.random() * 100);
            System.out.println(i);
        }
    }
}