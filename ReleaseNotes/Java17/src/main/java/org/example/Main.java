package org.example;

import org.example.sealed.Rgb;
import org.example.sealed.UseColor;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- sealed class ---");
        UseColor.printColor(new Rgb(0,0,0));
        System.out.println("--- sealed class ---");
    }
}