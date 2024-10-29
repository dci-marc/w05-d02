package org.digitalcareerinstitute;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Employee {
    void getEmployeeDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter job description: ");
        String job = sc.nextLine().toLowerCase();
        double bonus = 0;

        switch (job) {
            case "sales":
                double sales = querySales(sc);
                bonus = calculateBonus(sales);
                break;
            case "engineer":
                int unitsSold = querySoldUnits(sc);
                bonus = calculateBonus(unitsSold);
                break;
            case "technician":
                int partsAssembled = queryPartsAssembled(sc);
                int employeeType = queryEmployeeStatus(sc);
                bonus = calculateBonus(partsAssembled, employeeType);
                break;
            default:
                System.out.println("Error! Bad input.");
        }
        System.out.println("Your bonus for this month is: " + bonus);
    }

    private int queryPartsAssembled(Scanner scanner) {
        System.out.print("Enter number of parts completed: ");
        return scanner.nextInt();
    }

    private int queryEmployeeStatus(Scanner scanner) {
        System.out.print("Are you working Full-time (1) or Part-Time (2)? ");
        return scanner.nextInt();
    }

    private int querySoldUnits(Scanner scanner) {
        System.out.print("Enter number of units sold: ");
        return scanner.nextInt();
    }

    double querySales(Scanner scanner) {
        System.out.print("Enter your sales amount: ");
        return scanner.nextDouble();
    }

    /**
     * Calculate bonus based on sales amount
     *
     * @param sales sales amount
     * @return bonus or no bonus
     */
    public static double calculateBonus(double sales) {
        if (sales <= 10000) {
            return sales;
        }

        return sales * 0.1;
    }

    /**
     * Calculate bonus based on units sold
     *
     * @param unitsSold units sold
     * @return bonus or no bonus
     */
    public static double calculateBonus(int unitsSold) {
        int unitsExtraDifference = unitsSold - 100;
        int salaryBonus = 0;

        for (int i = 0; i < unitsSold; i++) {
            salaryBonus += 20;
        }

        if (unitsExtraDifference > 0) {
            for (int i = 0; i <= unitsExtraDifference; i++) {
                salaryBonus += 10;
            }
        }

        return salaryBonus;
    }

    /**
     * Calculate bonus based on parts assembled
     *
     * @param partsAssembled parts assembled
     * @param employeeType   employee type
     * @return bonus or no bonus
     */
    public static double calculateBonus(int partsAssembled, int employeeType) {
        float bonus = 0.025F;
        float salaryBonus = 0;

        switch (employeeType) {
            case 1:
                if (partsAssembled > 700) {
                    for (int i = 700-partsAssembled; i < 0; i++) {
                        salaryBonus += bonus;
                    }
                }
            case 2:
                if (partsAssembled > 300) {
                    for (int i = 300-partsAssembled; i < 0; i++) {
                        salaryBonus += bonus;
                    }
                }
                break;
        }

        DecimalFormat df = new DecimalFormat("#.00");
        return Float.parseFloat(df.format(salaryBonus));
    }
}
