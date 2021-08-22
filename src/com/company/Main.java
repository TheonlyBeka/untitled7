package com.company;

public class Main {

    public static void main(String[] args) {
        int age = 18;
        int temp = 15;
        String rsult = getResult(age, temp);
        System.out.println(rsult);
        getResult(18, 26);
        getResult(24, 15);
        getResult(52, -2);
        getResult(39,-12);
        getResult(12, 0);
    }

    public static String getResult(int age, int temp) {
        if (age >= 20 && age < 45 && temp >= -20 && temp <30) {
            return "Можно идти гулять !";
        }else if (age > 0 && age < 20 && temp >= 0 && temp <28){
            return "Можно идти гулять !";

        }else if (age > 45 && temp >= -10 && temp <25){
            return "Можно идти гулять !";

        }else {
            return "Нельзя идти гулять !";

        }

    }
}
