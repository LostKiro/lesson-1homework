package ru.geekbrains.lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
    printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 200;
        int b = 20;
        if(a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
            }
        }

    public static void printColor() {
        int value = 0;
        if(value <= 0) {
            System.out.println("Красный");
        } if(value >= 1 && value <= 100) {
            System.out.println("Жёлтый");
        } if(value > 100) {
            System.out.println("Зелёный");
        }
    }

    public static void compareNumbers() {
        int a = 30;
        int b = 20;
        if(a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
    }








