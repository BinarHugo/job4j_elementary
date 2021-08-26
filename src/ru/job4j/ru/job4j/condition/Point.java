package ru.job4j.ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2){

//        double one = x2 - x1;
//        double two = y2 - y1;
//        double three = Math.pow(one, 2);
//        double four = Math.pow(two, 2);
//        double five = three + four;
//        double six = Math.sqrt(five);
//        double rsl = six;

        double rsl = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        return rsl;
    }
    public static void main(String[] args) {
        double result = Point.distance (1, 1, 5, 5);
        System.out.println("distance for (1, 1) to (5, 5) is " + result);
    }
}
