package org.example.HomeworkJAVA2;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        //    Задание 2
//    Создайте класс Converter - конвертер системы счисления.
//    У пользователя спрашивается число системы счисления, (используйте Scanner)
//    Запрашивается само число (ожидается корректный ввод)
//    У пользователя спрашивается число системы счисления в какую перевести
//    Конвертация должна быть с помощью класса обертки Long.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        String inputNumber = scanner.nextLine();

        System.out.print("Введите систему счисления исходного числа: ");
        int sourceBase = scanner.nextInt();

        System.out.print("Введите систему счисления, в которую нужно перевести число: ");
        int targetBase = scanner.nextInt();

        Converter converter = new Converter();
        String result = converter.convertNumber(inputNumber, sourceBase, targetBase);

        System.out.println("Результат конвертации: " + result);
    }

    public String convertNumber(String inputNumber, int sourceBase,int targetBase){
        try {
            Long decimalNumber =  Long.parseLong(inputNumber, sourceBase);

            return Long.toString(decimalNumber, targetBase);
        } catch (NumberFormatException e) {
         return "Ошибка: Некорректный ввод числа.Убедитесь,что введенное число соотвествует выбранной системе счисления.";
        }
    };

}
