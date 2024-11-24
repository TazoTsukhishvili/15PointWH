package org.example;

//task2
//შექმნით ახალი კლასი სახელად While და while ციკლით
//დაბეჭდეთ String -ში არსებული ყოველი მესამე სიმბოლო,
//ანუ 3 პოზიციაზე მდგომი, შემდეგ 6 მდგომი, შემდეგ 9
//მდგომი … თუ რომელიმე მესამე სიმბოლო იქნება პატარა z ასო,
//მაშინ ციკლი შეწყდეს


public class While {
    public static void main(String[] args) {

        String text = "Lorem ipsum dolor sit amet, consectetur adipiszzzcing elit.";

        int i = 2;

        while (i < text.length()) {
            char currentChar = text.charAt(i);

            System.out.println(currentChar);

            if (currentChar == 'z') {
                System.out.println("ციკლი შეწყდა, რადგან სიმბოლო 'z' არის.");
                break;
            }

            i += 3;
        }
    }
}
