package metodos_abstratos;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Shape #" + (i + 1) + " data");

            System.out.print("Rectangle or circle (r/c)?");
            char ch = sc.next().charAt(0);

            System.out.print("Color (BLACK/BLUE/RED); ");
            Color color = Color.valueOf(sc.next());

            if (ch == 'r') {
                System.out.print("Width: ");
                Double width = sc.nextDouble();

                System.out.print("Height: ");
                Double height = sc.nextDouble();

                list.add(new Rectangle(color, width, height));
            } else if (ch == 'c') {

                System.out.print("Radius: ");
                Double radius = sc.nextDouble();
                list.add(new Circle(color, radius));

            }
        }


        System.out.println("SHAPE AREAS: ");

        for (Shape l :
                list) {


            System.out.println(String.format("%.2f", l.area()));
        }


    }
}
