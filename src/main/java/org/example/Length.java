package org.example;


//task3
//შექმენით Length კლასი და ამ კლასში შექმენით String ტიპის
//სტრიქონი. თუ არსებული სტრიქონის სიგრძე არის ლუწი დაწერეთ
//რომ ლუწია, თუ კენტია დაწერეთ რომ კენტია

public class Length {
    public static void main(String[] args) {

        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit";

        int length = text.length();

        if (length % 2 == 0) {
            System.out.println("სტრიქონის სიგრძე ლუწია");
        } else {
            System.out.println("სტრიქონის სიგრძე კენტია");
        }
    }
}
