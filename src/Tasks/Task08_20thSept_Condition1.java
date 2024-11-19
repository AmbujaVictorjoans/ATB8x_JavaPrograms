package Tasks;

import java.sql.SQLOutput;

public class Task08_20thSept_Condition1 {
    public static void main(String[] args) {
        // Write a program that classifies a triangle based on its side lengths.

// Given three input values representing the lengths of the sides, determine

// if the triangle is equilateral (all sides are equal),

// isosceles (exactly two sides are equal), or

// scalene (no sides are equal).

// Use an if-else statement to classify the triangle.

// side1, side2, side3 ->

        int side1 = 5;
        int side2 = 8;
        int side3 = 9;

        if ((side1==side2) && (side2==side3)) {
            System.out.println("Triangle is an Equilateral Triangle");
        }
            else if ((side1 == side2)||(side2==side3)||(side3==side1)){
            System.out.println("Triangle is an Isosceles Triangle");
            }
            else if ((side1!= side2) && (side2!= side3) && (side3!=side1)) {
            System.out.println("Triangle is an Scalene Triangle");
        }


    }
}
