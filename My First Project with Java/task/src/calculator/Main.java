package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("""
                Earned amount:
                Bubblegum: $202
                Toffee: $118
                Ice Cream: $2250
                Milk chocolate: $1680
                Doughnut: $1075
                Pancake: $80

                """);
        int income = 5405;
        System.out.printf("Income: $%d\n", income);
        System.out.println("Staff expenses:");
        Scanner scanner1 = new Scanner(System.in);
        int staffExpenses = scanner1.nextInt();
        System.out.println("Other expenses:");
        Scanner scanner2= new Scanner(System.in);
        int otherExpenses = scanner2.nextInt();
        int netIncome = income - (staffExpenses + otherExpenses);
        System.out.printf("Net income: $%d", netIncome);
    }
}