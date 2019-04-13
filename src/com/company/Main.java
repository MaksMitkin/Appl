package com.company;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
System.out.println("Тестовое задание \" Калькулятор\" \n Выберите калькулятор: \n 1. Арабские числа\n 2. Римские числа");
int i = scan.nextInt();
        switch (i){
            case 1: ArabCalck();
            break;
            case 2: RomanCalck();
            break;
            default: System.out.println("Неверный ввод, повторите попытку");
            break;
        }
    }
    public static void ArabCalck(){
        int result = 0;
        System.out.println("Введите первое число:");
        int num1 = getInt();
        System.out.println("Введите второе число:");
        int num2 = getInt();
        System.out.println("Выберите операцию: \n 1. Сумма (+) \n 2. Разница (-)\n 3. Умножение(*) \n 4. Деление (/)");
        int operation = scan.nextInt();
        switch (operation){
            case 1: result = num1 + num2;
            break;
            case 2: result = num1 - num2;
            break;
            case 3: result = num1 * num2;
            break;
            case 4: result  = num1 / num2;
            break;
            default: System.out.println("Неккоректные данные!");
            break;
        }
        System.out.println(result);
    }

    public static void RomanCalck() {
        int result = 0;
        System.out.println("Введите первое число:");
        int num1 = Convect();
        System.out.println("Введите второе число:");
        int num2 = Convect();
        System.out.println("Выберите операцию: \n 1. Сумма (+) \n 2. Разница (-)\n 3. Умножение(*) \n 4. Деление (/)");
        int operation = scan.nextInt();
        switch (operation){
            case 1: result = num1 + num2;
                break;
            case 2: result = num1 - num2;
                break;
            case 3: result = num1 * num2;
                break;
            case 4: result  = num1 / num2;
                break;
            default: System.out.println("Неккоректные данные!");
                break;
        }
        ConvectRom(result);
    }
    
    public static int Convect(){

        String num = scan.next();
        switch (num){
            case "I": return 1;
            case "II": return 2;
            case "III": return 3;
            case "IV": return 4;
            case "V": return 5;
            case "VI": return 6;
            case "VII": return 7;
            case "VIII": return 8;
            case "XI": return 9;
            case "X": return 10;
            default: System.out.println("Неверный символ!");
          break;
            
        }
    return 0;
    }
    public static void ConvectRom(int result) {
        String str = "";

        if (result == 1)
            str = "I";
        if (result == 2)
            str = "II";
        if (result == 3)
            str = "III";
        if (result == 4)
            str = "IV";
        if (result == 5)
            str = "V";
        if (result == 6)
            str = "VI";
        if (result == 7)
            str = "VII";
        if (result == 8)
            str = "VIII";
        if (result == 9)
            str = "IX";
        if (result == 10)
            str = "X";
        if  (result > 10 || result < 0)
            str = "Вне диапазона чисел!";
        System.out.println(str);
    }


    public static int getInt() {

        int num;
        if (scan.hasNextInt()) {
            num = scan.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scan.next();//рекурсия
            num = getInt();
        }
        return num;
    }
}
