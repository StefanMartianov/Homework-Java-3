package org.example.HomeworkJAVA2;

import java.util.Scanner;

public class Pizza {
    public static void main(String[] args) {
        //    Дополнительное задание.
//    Напишите программу, которая вычисляет, сколько лишних калорий будет, если вместо пиццы диаметром 24 см вы купите пиццу диаметром 28 см.
//    Чтобы решить эту проблему, предположим, что каждый квадратный сантиметр пиццы содержит 40 калорий.
        double diameterSmallPizza = getUserInput("Введите диаметр маленькой пиццы (в см): ");
        double diameterLargePizza = getUserInput("Введите диаметр большой пиццы (в см): ");

        double areaSmallPizza = calculatePizzaArea(diameterSmallPizza);
        double areaLargePizza = calculatePizzaArea(diameterLargePizza);

        int extraCalories = calculateExtraCalories(areaLargePizza - areaSmallPizza);

        System.out.println("Лишних калорий: " + extraCalories + "ккал");
    }

    private static double getUserInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextDouble();
    }

    private static double calculatePizzaArea(double diameter){
        double radius = diameter / 2;
        return Math.PI * Math.pow(radius, 2);
    }

    private static int calculateExtraCalories(double area){
        int caloriesPerSquareCentimeter = 40;
        return (int) (area * caloriesPerSquareCentimeter);
    }
}
