package org.example.tasks;

public class task1 {
    public static void main(String[] args) {
        double[] temperatures = {25.5, 30.0, 33.5, 36.6, 35.0, 28.8, 40.0};

        double highest = temperatures[0];
        double lowest = temperatures[0];

        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] > highest) {
                highest = temperatures[i];
            }
            if (temperatures[i] < lowest) {
                lowest = temperatures[i];
            }
        }

        System.out.println("Highest temperature of the week: " + highest+"°C");
        System.out.println("Lowest temperature of the week: " + lowest+"°C");

    }
}


