package rectangletest;

    class Rectangle {
        public double length;
        public double breath;

        public double area() {
            return length * breath;
        }

        public double Perimeter() {
            return 2 * (length + breath);
        }

        public boolean isSquare() {
            return length == breath;
        }
    }

    public class RectangleTest {
        public static void main(String args[]) {
            Rectangle r = new Rectangle();
            r.length = 10.5;
            r.breath = 5.5;

            System.out.println(r.area());
            System.out.println(r.Perimeter());
            System.out.println(r.isSquare());
        }
    }


