package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Прописываем сканер для чтения вводимых данных с клавиатура
        System.out.print("Введите a: "); // Выводим текст о том, что пользователю надо ввести а
        int a = scanner.nextInt(); // Принимаем полученные данные
        System.out.print("Введите b: "); // Выводим текст о том, что пользователю надо ввести b
        int b = scanner.nextInt(); // Принимаем полученные данные
        System.out.print("Введите c: "); // Выводим текст о том, что пользователю надо ввести c
        int c = scanner.nextInt(); // Принимаем полученные данные
        // Прописываем условия, которые были даны в ТЗ.
        if (a == b && b == c) {
            System.out.println("Являются сторонами равностороннего треугольника");
        } else if (a == b || b == c || c == a) {
            System.out.println("Это стороны равнобедренного треугольника");
        } else if (a + b <= c || b + c <= a || c + a <= b) {
            System.out.println("Из этих сторон не образуется треугольник");
        } else if (a*a + b*b == c*c || b*b + c*c == a*a || c*c + a*a == b*b) {
            System.out.println("Являются сторонами прямоугольного треугольника");
        } else {
            System.out.println("Являются сторонами обычного треугольника");
        }
    }
}