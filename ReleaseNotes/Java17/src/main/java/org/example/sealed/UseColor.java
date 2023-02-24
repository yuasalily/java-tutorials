package org.example.sealed;

public class UseColor {
    public static void printColor(Color color) {
        // sealed classでimplementsを制限しているおかげですべて列挙されていることが保証できる
        if (color instanceof Rgb) {
            System.out.println(color);
        } else if (color instanceof Cmyk) {
            System.out.println();
        } else {
            System.out.println("null");
        }
    }
}
