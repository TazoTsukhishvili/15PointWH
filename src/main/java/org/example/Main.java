package org.example;

//task1
//Main კლასის main მეთოდში შექმენით მასივი რიცხვითი
//მნიშვნელობებით და თუ ამ მასივში არ არის ლუწი რიცხვი,
//მაშინ დაიბეჭდოს “მასივში არ არის ლუწი რიცხვი ”. თუ ამ
//მასივში არის ლუწი რიცხვი (მაგალითად 5 ლუწი რიცხვია)
//მაშინ დაბეჭდოს “ამ მასივში არის 5 ლუწი რიცხვი ”


//task4
//Main კლასში შექმენით void -იანი მეთოდი სახელად
//checkNumber, რომელიც პარამეტრად მიიღებს int ტიპის ცვლადს.
//მეთოდმა დაბეჭდოს “დადებითი” თუ დადებით რიცხვს გადავცემთ,
//დაბეჭდოს “უარყოფითი” თუ უარყოფით რიცხვს გადავცემთ და
//დაბეჭდოს “ნოლი” თუ 0 -ს გადავცემთ


//task5
//Main კლასსი შექმენით void -იანი მეთოდი სახელად hasTeen,
//რომელიც პარამეტრად მიიღებს სამ ცალ int ტიპის ცვლადს.
//მეთოდმა დაბეჭდოს “True” თუ რომელიმე პარამეტრი მაინც იქნება
//მინიმუმ 13 და მაქსიმუმ 19. მეთოდმა დაბეჭდოს “False” თუ
//არც ერთი პარამეტრი არ იქნება 13 - 19 დიაპაზონში

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // task1
        int[] numbers = {3, 7, 15, 16, 20};

        int evenCount = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            }
        }

        if (evenCount == 0) {
            System.out.println("მასივში არ არის ლუწი რიცხვი");
        } else {
            System.out.println("ამ მასივში არის " + evenCount + " ლუწი რიცხვი");
        }


        //task4
        checkNumber(5);
        checkNumber(-3);
        checkNumber(0);

        //task5
        hasTeen(1, 30, 14);
        hasTeen(11, 24, 40);
        hasTeen(17, 3, 35);
    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("დადებითი");
        } else if (number < 0) {
            System.out.println("უარყოფითი");
        } else {
            System.out.println("ნოლი");
        }
    }

    public static void hasTeen(int a, int b, int c) {

        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}