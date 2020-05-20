package Homework;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        /**
         * * 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
         * С помощью цикла и условия заменить 0 на 1, 1 на 0;
         */
        int[] a1 = {0, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1};
        System.out.println("Задание 1");
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] == 1) {
                a1[i] = 0;
            } else a1[i] = 1;
            System.out.println(" " + a1[i]);
        }
        System.out.println();

        /**
         * 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
         */
        int[] a2 = new int[8];
        System.out.println("Задание 2");
        for (int i = 0; i < a2.length; i++) {
            a2[i] = i * 3;
            System.out.println(" " + a2[i]);
        }
        System.out.println();

        /**
         * 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
         */
        int a3[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Задание 3");
        for (int i = 0; i < a3.length; i++) {
            if (a3[i] < 6) {
                a3[i] = a3[i] * 2;
            } else a3[i] = a3[i];
            System.out.println(" " + a3[i]);
        }
        System.out.println();


        /**
         * 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
         *  и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
         */
        int[][] a4 = new int[11][11];
        System.out.println("Задание 4");
        for (int i = 0; i < a4.length; i++) {
            for (int j = 0; j < a4.length; j++) {
                if (i == j){
                    a4[i][j] = 1;}
                else if (i == a4.length -(j+1)) {
                    a4[i][j] = 1;}
                else a4 [i][j] = 0;
                System.out.println(a4[i][j] + " ");
            }
            System.out.println();
        }

        /**
         * 5. Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета)
         */
        System.out.println("Задание 5");
        int[] a5 = {21, 3, 1, 5, 8, 14, 11, 4, 17};
        int min = a5[0];
        int max = a5[0];
        for (int i = 0; i < a5.length; i++) {
            if (a5[i] > max) {
                max = a5[i];
            }
            if (a5[i] < min) {
                min = a5[i];
            }
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        /**
         *  6. Написать метод, в который передается не пустой одномерный целочисленный массив,
         *  метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
         */
        int[] a6 = {5, 3, 9, 1, 15, 8, 5, 6, 4, 8, 1, 1};
        System.out.println("Задание 6 ");
        System.out.println("Результат = " + check(a6));
    }
        private static boolean check(int[] a6) {
        int sumLeft, sumRight;
        for (int i = 0; i < a6.length + 1; i++) {
            sumLeft = 0;
            sumRight = 0;
            for (int j = 0; j < i; j++) {
                sumLeft += a6[j];
            }
            for (int j = i; j < a6.length; j++) {
                sumRight += a6[j];
            }
            if (sumRight == sumLeft) return true;
        }
        return false;
        }






}
