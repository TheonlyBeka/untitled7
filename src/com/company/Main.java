package com.company;

public class Main {
    public static void main(String[] args) {


        class Cat {
            public static void num() {
                double[] array = {1.5, -2.4, 1.2, 5.5, -5.1, 1.8, 6.3, -8, 7, -5, 6, 15.2, 12.12, 20., 7.7, 8.6, 18.8};
                int counter = 0;
                int sum = 0;
                boolean firstNegitiveNum = false;

                for (double num : array) {
                    if (num < 0) {
                        firstNegitiveNum = true;
                    }

                    if (firstNegitiveNum) {
                        if (num > 0) {
                            counter++;
                            sum += num;
                        }
                    }
                }
                System.out.println("Сумма пол чис " + sum);
                System.out.println("Среднее ариф " + sum / counter);

            }
        }

    }
}