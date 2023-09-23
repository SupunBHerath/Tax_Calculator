/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
//package com.mycompany.coursew6;

import java.util.Scanner;

/**
 *
 * @author supun
 */
public class CourseW6 {

    public static void ClearConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c",
                        "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            e.printStackTrace();
        }

    }

    public static void Home() {
        Scanner sc = new Scanner(System.in);

        ClearConsole();
        try {
            System.out.println("""
                           \t\t\t\t \t\t __  ______  ________ ________
                           \t\t\t\t\t\t|  \\/      \\|        |        \\
                           \t\t\t\t\t \t\\$|  $$$$$$| $$$$$$$$\\$$$$$$$$
                           \t\t\t\t\t\t|  | $$   \\$| $$__       |$$
                           \t\t\t\t\t\t| $| $$     | $$  \\      |$$
                           \t\t\t\t\t\t| $| $$     | $$$$$      |$$
                           \t\t\t\t\t\t| $| $$     | $$_____    |$$
                           \t\t\t\t\t\t| $$\\$$    $| $$     \\   |$$
                           \t\t\t\t\t\t \\$$ \\$$$$$$ \\$$$$$$$$   \\$$""");

            System.out.println("\n");
            System.out.println(
                    "  _______             __   __   _____              _         _____   _    _   _                   _______    ____    _____  \n"
                    + " |__   __|     /\\     \\ \\ / /  / ____|     /\\     | |       / ____| | |  | | | |          /\\     |__   __|  / __ \\  |  __ \\ \n"
                    + "    | |       /  \\     \\ V /  | |         /  \\    | |      | |      | |  | | | |         /  \\       | |    | |  | | | |__) |\n"
                    + "    | |      / /\\ \\     > <   | |        / /\\ \\   | |      | |      | |  | | | |        / /\\ \\      | |    | |  | | |  _  / \n"
                    + "    | |     / ____ \\   / . \\  | |____   / ____ \\  | |____  | |____  | |__| | | |____   / ____ \\     | |    | |__| | | | \\ \\ \n"
                    + "    |_|    /_/    \\_\\ /_/ \\_\\  \\_____| /_/    \\_\\ |______|  \\_____|  \\____/  |______| /_/    \\_\\    |_|     \\____/  |_|  \\_\\");

            System.out.println(
                    "\n==================================================================================================================================\n\n");

            System.out.println("\t[1] Withtholding Tax\n");
            System.out.println("\t[2] Payable Tax\n");
            System.out.println("\t[3] Icome Tax\n");
            System.out.println("\t[4] Social Security Contribution levy (SSCL) Tax\n");
            System.out.println("\t[5] Leasing Payment\n");
            System.out.println("\t[6] Exit\n");

            System.out.print("Enter an option to continue -> ");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    WithholdingTax();
                    break;
                case 2:
                    PayableTax();
                    break;
                case 3:
                    IncomeTax();
                    break;
                case 4:
                    SSCL();
                    break;
                case 5:
                    LeasingPayment();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    while (true) {
                        System.out.print("\nInvalid option... Do you want to enter correct option(Y/N) : ");
                        char x = sc.next().charAt(0);
                        if (x == 'y' || x == 'Y') {
                            Home();
                        } else if (x == 'n' || x == 'N') {
                            System.exit(0);

                        } else {
                            System.out.println("\n\t\tInvalid option...");
                            continue;
                        }
                    }
            }
        } catch (final Exception e) {
            Home();
        }

    }

    public static void WithholdingTax() {
        Scanner sc = new Scanner(System.in);

        ClearConsole();
        try {

            System.out.println("+----------------------------------------------------------------+");
            System.out.println("|                       WITHHOLDING TAX                          |");
            System.out.println("+----------------------------------------------------------------+");

            System.out.println("\n");
            System.out.println("\t[1] Rent Tax \n");
            System.out.println("\t[2] Bank Interest Tax \n");
            System.out.println("\t[3] Dividend Tax \n");
            System.out.println("\t[4] Exit \n");
            System.out.print("Enter an option to continue -> ");
            int op1 = sc.nextInt();
            switch (op1) {
                case 1:
                    RentTax();
                    break;
                case 2:
                    BankInterestTax();
                    break;
                case 3:
                    DividendTax();
                    break;
                case 4:
                    Home();
                    break;
                default:
                    while (true) {
                        System.out.print("\nInvalid option... Do you want to enter correct option(Y/N) : ");
                        char x = sc.next().charAt(0);
                        if (x == 'y' || x == 'Y') {
                            WithholdingTax();
                        } else if (x == 'n' || x == 'N') {
                            Home();
                        } else {
                            System.out.println("\n\t\tInvalid option...");
                            continue;
                        }
                    }
            }
        } catch (Exception e) {
            System.out.println(e);
            WithholdingTax();

        }

    }

    public static void RentTax() {
        Scanner sc = new Scanner(System.in);

        ClearConsole();
        try {
            System.out.println("+----------------------------------------------------------------+");
            System.out.println("|                           RENT TAX                             |");
            System.out.println("+----------------------------------------------------------------+");

            LR1:
            while (true) {
                System.out.print("\nEnter your rent             : ");
                double rent = sc.nextDouble();

                if (rent > 0) {

                    if (rent > 100000) {
                        double amount = (rent - 100000) * 10 / 100;

                        double Amount = Math.round(amount);
                        System.out.printf("\nYou have to pay Rent Tax    : %.2f%n", amount);
                    } else {
                        System.out.println("\n\tYou dont have to pay rent tax ...");
                    }

                } else {

                    System.out.println("\n\tInvalid Value...");
                    while (true) {

                        System.out.print("\nDo you want to enter the correct value again (Y/N) : ");
                        char x1 = sc.next().charAt(0);

                        if (x1 == 'y' || x1 == 'Y') {
                            continue LR1;
                        } else if (x1 == 'n' || x1 == 'N') {
                            WithholdingTax();

                        } else {
                            System.out.println("\n\t\tInvalid option...");
                            continue;
                        }
                    }
                }
                while (true) {

                    System.out.print("\nDo you want to calculate another Rent Tax (Y/N) : ");
                    char x1 = sc.next().charAt(0);
                    if (x1 == 'y' || x1 == 'Y') {
                        RentTax();

                    } else if (x1 == 'n' || x1 == 'N') {
                        WithholdingTax();

                    } else {
                        System.out.println("\n\t\tInvalid option...");
                        continue;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error ..." + e);
            RentTax();
        }

    }

    public static void BankInterestTax() {
        Scanner sc = new Scanner(System.in);

        ClearConsole();
        try {
            System.out.println("+----------------------------------------------------------------+");
            System.out.println("|                       BANK INTEREST TAX                        |");
            System.out.println("+----------------------------------------------------------------+");
            LB1:
            while (true) {
                System.out.print("\nEnter your bank interest per year\t\t: ");
                double interest = sc.nextDouble();
                if (interest > 0) {
                    double amount = interest * 5 / 100;
                    double Amount = Math.round(amount);

                    System.out.printf("\nYou have to pay Bank Interest Tax per year\t: %.2f", Amount);
                } else {
                    System.out.println("\n\tInvalid Interest per...");

                    while (true) {
                        System.out.print("\nDo you want to enter the correct value again (Y/N) : ");
                        char x1 = sc.next().charAt(0);

                        if (x1 == 'y' || x1 == 'Y') {
                            continue LB1;

                        } else if (x1 == 'n' || x1 == 'N') {
                            BankInterestTax();

                        } else {
                            System.out.println("\n\t\tInvalid option...");
                            continue;
                        }
                    }
                }

                while (true) {
                    System.out.print("\n\nDo you want to calculate another Bank Interest Tax (Y/N) : ");
                    char x1 = sc.next().charAt(0);
                    if (x1 == 'y' || x1 == 'Y') {
                        BankInterestTax();

                    } else if (x1 == 'n' || x1 == 'N') {
                        WithholdingTax();

                    } else {
                        System.out.println("\n\t\tInvalid option...");
                        continue;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error ..." + e);
            BankInterestTax();
        }
    }

    public static void DividendTax() {
        Scanner sc = new Scanner(System.in);

        ClearConsole();
        try {
            System.out.println("+----------------------------------------------------------------+");
            System.out.println("|                       DIVIDEND TAX                             |");
            System.out.println("+----------------------------------------------------------------+");

            LD1:
            while (true) {
                System.out.print("\nEnter you total dividend per year\t: ");
                double dividend = sc.nextDouble();
                if (dividend > 0) {
                    if (dividend > 100000) {
                        double dAmount = (dividend - 100000) * 14 / 100;
                        double DAmount = Math.round(dAmount);

                        System.out.printf("\nYou have to pay Dividend Tax per year\t: %.2f", DAmount);
                    } else {
                        System.out.println("\n\tYou dont have to pay Dividend Tax...");
                    }

                } else {

                    System.out.println("\n\tInvalid Dividend Per...");
                    while (true) {
                        System.out.print("\nDo you want to enter the correct value again (Y/N) : ");
                        char x1 = sc.next().charAt(0);
                        if (x1 == 'y' || x1 == 'Y') {
                            continue LD1;
                        } else if (x1 == 'n' || x1 == 'N') {
                            WithholdingTax();
                        } else {
                            System.out.println("\n\t\tInvalid option...");
                            continue;
                        }
                    }
                }
                while (true) {
                    System.out.print("\nDo you want to calculate another Dividend Tax (Y/N) : ");
                    char x1 = sc.next().charAt(0);
                    if (x1 == 'y' || x1 == 'Y') {
                        DividendTax();
                    } else if (x1 == 'n' || x1 == 'N') {
                        WithholdingTax();
                    } else {
                        System.out.println("\n\t\tInvalid option...");
                        continue;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error ..." + e);
            DividendTax();
        }
    }

    public static void PayableTax() {
        Scanner sc = new Scanner(System.in);

        ClearConsole();
        try {
            System.out.println("+----------------------------------------------------------------+");
            System.out.println("|                        PAYBLE TAX                              |");
            System.out.println("+----------------------------------------------------------------+");

            Lp1:
            while (true) {
                System.out.print("\nEnter your employee payment per month\t: ");
                double emPayment = sc.nextDouble();
                double Tax;
                if (emPayment < 0) {
                    System.out.println("\n\tInvalid payment Amount...");
                    while (true) {
                        System.out.print("\nDo you want to enter the correct value again (Y/N) : ");
                        char x1 = sc.next().charAt(0);
                        if (x1 == 'y' || x1 == 'Y') {
                            continue Lp1;
                        } else if (x1 == 'n' || x1 == 'N') {
                            Home();
                        } else {
                            System.out.println("\n\t\tInvalid option...");
                            continue;
                        }
                    }
                } else {
                    if (emPayment <= 100000) {
                        System.out.println("\n\tYou don't have to pay Payable Tax...");
                    } else {

                        if (emPayment <= 141667) {
                            Tax = (emPayment - 100000) * 0.06;
                        } else if (emPayment <= 183333) {
                            Tax = (41667 * 0.06) + (emPayment - 141667) * 0.12;
                        } else if (emPayment <= 225000) {
                            Tax = (41667 * 0.06) + (41667 * 0.12) + (emPayment - 183333) * 0.18;
                        } else if (emPayment <= 266667) {
                            Tax = (41667 * 0.06) + (41667 * 0.12) + (41667 * 0.18) + (emPayment - 225000) * 0.24;
                        } else if (emPayment <= 308333) {
                            Tax = (41667 * 0.06) + (41667 * 0.12) + (41667 * 0.18) + (41667 * 0.24) + (emPayment - 266667) * 0.30;
                        } else {
                            Tax = (41667 * 0.06) + (41667 * 0.12) + (41667 * 0.18) + (41667 * 0.24) + (41667 * 0.30) + (emPayment - 308333) * 0.36;
                        }
                        double RTax = Math.round(Tax);

                        System.out.printf("\nYou have to pay Payable Tax per month\t: %.2f", RTax);

                    }
                }
                while (true) {
                    System.out.print("\n\nDo you want to calculate anther Payable Tax (Y/N) : ");
                    char x1 = sc.next().charAt(0);
                    if (x1 == 'y' || x1 == 'Y') {
                        PayableTax();
                    } else if (x1 == 'n' || x1 == 'N') {
                        Home();
                    } else {
                        System.out.println("\n\t\tInvalid option...");
                        continue;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error ..." + e);
            PayableTax();
        }
    }

    public static void IncomeTax() {
        Scanner sc = new Scanner(System.in);

        ClearConsole();
        try {
            System.out.println("+----------------------------------------------------------------+");
            System.out.println("|                        INCOME TAX                              |");
            System.out.println("+----------------------------------------------------------------+");

            Li:
            while (true) {
                System.out.print("\nEnter your total income per year\t: ");
                double income = sc.nextDouble();
                double Income;

                if (income < 0) {
                    System.out.println("\n\tInvalid Income Amount...");

                    while (true) {
                        System.out.print("\nDo you want to enter the correct value again (Y/N) : ");
                        char x1 = sc.next().charAt(0);
                        if (x1 == 'y' || x1 == 'Y') {
                            continue Li;
                        } else if (x1 == 'n' || x1 == 'N') {
                            Home();
                        } else {
                            System.out.println("\n\t\tInvalid option...");
                            continue;
                        }
                    }
                } else {

                    if (income <= 1200000) {
                        System.out.println("\n\tYou don't have to Income Tax...");

                    } else {

                        if (income <= 1700000) {
                            Income = (income - 1200000) * 0.06;

                        } else if (income <= 2200000) {
                            Income = 500000 * 0.06 + (income - 1700000) * 0.12;

                        } else if (income <= 2700000) {
                            Income = 500000 * 0.06 + 500000 * 0.12 + (income - 2200000) * 0.18;

                        } else if (income <= 3200000) {
                            Income = 500000 * 0.06 + 500000 * 0.12 + 500000 * 0.18 + (income - 2700000) * 0.24;

                        } else if (income <= 3700000) {
                            Income = 500000 * 0.06 + 500000 * 0.12 + 500000 * 0.18 + 500000 * 0.24 + (income - 3200000) * 0.30;

                        } else {
                            Income = 500000 * 0.06 + 500000 * 0.12 + 500000 * 0.18 + 500000 * 0.24 + 500000 * 0.30 + (income - 3700000) * 0.36;

                        }

                        double RIncome = Math.round(Income);
                        System.out.printf("\nYou have to pay Income Tax per year\t: %.2f%n", RIncome);

                    }
                    while (true) {
                        System.out.print("\nDo you want to calculate anther Incomee Tax (Y/N) : ");
                        char x1 = sc.next().charAt(0);
                        if (x1 == 'y' || x1 == 'Y') {
                            IncomeTax();
                        } else if (x1 == 'n' || x1 == 'N') {
                            Home();
                        } else {
                            System.out.println("\n\t\tInvalid option...");
                            continue;
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error ..." + e);
            IncomeTax();
        }

    }

    public static void SSCL() {
        Scanner sc = new Scanner(System.in);

        ClearConsole();
        try {
            System.out.println("+----------------------------------------------------------------+");
            System.out.println("|          SOCIAL SECURITY CONTRIBUTION LEVY (SSCL) TAX          |");
            System.out.println("+----------------------------------------------------------------+");

            Ls:
            while (true) {
                System.out.print("\nEnter value of Good or Service\t : ");
                double value = sc.nextDouble();
                if (value < 0) {
                    System.out.println("\n\tInvalid Value...");

                    while (true) {
                        System.out.print("\nDo you want to enter the correct value again (Y/N) : ");
                        char x1 = sc.next().charAt(0);
                        if (x1 == 'y' || x1 == 'Y') {
                            continue Ls;
                        } else if (x1 == 'n' || x1 == 'N') {
                            Home();
                        } else {
                            System.out.println("\n\t\tInvalid option...");
                            continue;
                        }
                    }
                } else {
                    double saleTax = value * 0.025;
                    double Value = value + saleTax;
                    double vat = Value * 0.15;
                    double totalTax = vat + saleTax;
                    double RtotalTax = Math.round(totalTax);
                    System.out.printf("\nYou have to pay SSCL Tax\t : %.2f", RtotalTax);
                    System.out.println(" ");
                }

                while (true) {
                    System.out.print("\nDo you want to calculate anther SSCL Tax (Y/N) : ");
                    char x1 = sc.next().charAt(0);
                    if (x1 == 'y' || x1 == 'Y') {
                        SSCL();
                    } else if (x1 == 'n' || x1 == 'N') {
                        Home();
                    } else {
                        System.out.println("\n\t\tInvalid option...");
                        continue;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error ..." + e);
            SSCL();
        }
    }

    public static void LeasingPayment() {
        Scanner sc = new Scanner(System.in);

        ClearConsole();
        try {
            System.out.println("+----------------------------------------------------------------+");
            System.out.println("|                     Leasing Payment                            |");
            System.out.println("+----------------------------------------------------------------+");
            System.out.println(" ");

            System.out.println("\t[1] Calculate Monthly Installment \n");
            System.out.println("\t[2] Search Leasing Category\n");
            System.out.println("\t[3] Find Leasing Amount \n");
            System.out.println("\t[4] Exit \n");

            System.out.print("Enter an option to continue -> ");
            int op2 = sc.nextInt();

            switch (op2) {
                case 1:
                    CMI();
                    break;
                case 2:
                    SLC();
                    break;
                case 3:
                    FLA();
                    break;
                case 4:
                    Home();
                    break;
                default:
                    while (true) {
                        System.out.print("\nInvalid option... Do you want to enter correct option(Y/N) : ");
                        char x = sc.next().charAt(0);
                        if (x == 'y' || x == 'Y') {
                            LeasingPayment();
                        } else if (x == 'n' || x == 'N') {
                            Home();
                        } else {
                            System.out.println("\n\t\tInvalid option...");
                            continue;
                        }
                    }
            }
        } catch (Exception e) {
            System.out.println("Error ..." + e);
            LeasingPayment();
        }
    }

    public static void CMI() {
        Scanner sc = new Scanner(System.in);

        ClearConsole();
        try {
            System.out.println("+----------------------------------------------------------------+");
            System.out.println("|                Calculate Leasing Payment                       |");
            System.out.println("+----------------------------------------------------------------+");

            Lc1:
            while (true) {
                System.out.print("");
                System.out.printf("%-40s%3s", "\nEnter lease amount", ": ");

                double lamount = sc.nextDouble();
                Lr:
                while (true) {
                    if (lamount < 0) {
                        System.out.println("\n\tInvalid Lease Amount..");

                        while (true) {
                            System.out.print("\n\nDo you want to enter the correct value again (Y/N) : ");
                            char x1 = sc.next().charAt(0);
                            if (x1 == 'y' || x1 == 'Y') {
                                continue Lc1;
                            } else if (x1 == 'n' || x1 == 'N') {
                                LeasingPayment();
                            } else {
                                System.out.println("\n\t\tInvalid option...");
                                continue;
                            }

                        }
                    } else {

                        System.out.printf("%-40s%3s", "\nEnter annual interest rate", ": ");

                        double rate = sc.nextDouble();
                        Ly:
                        while (true) {
                            if (rate > 0) {
                                System.out.print("");
                                System.out.printf("%-40s%3s", "\nEnter number of year", ": ");

                                int year = sc.nextInt();

                                if (year > 0 && year < 6) {
                                    int n = year * 12;
                                    double i = rate / 1200;
                                    double X = 1 + i;
                                    double N = Math.pow(X, n);
                                    double mInstallment = lamount * i / (1 - (1 / N));

                                    System.out.printf("%-40s%3s%.2f", "\nYour monthly instalment", ": ", mInstallment);

                                    System.out.println(" ");
                                    while (true) {
                                        System.out.printf("%-40s%3s", "\n\nDo you want to calculate anther Leasing(Y/N)", ": ");

                                        char x1 = sc.next().charAt(0);
                                        if (x1 == 'y' || x1 == 'Y') {
                                            CMI();
                                        } else if (x1 == 'n' || x1 == 'N') {
                                            LeasingPayment();
                                        } else {
                                            System.out.println("\n\t\tInvalid option...");
                                            continue;
                                        }
                                    }
                                } else {

                                    System.out.println("\n\tInvalid number of year..Enter the correct value again...");
                                    continue Ly;
                                }
                            } else {
                                System.out.println("\n\tInvalid number of rate..Enter the correct value again...");
                                continue Lr;
                            }
                        }
                    }
                }

            }
        } catch (Exception e) {
            System.out.println("Error ..." + e);
            CMI();
        }
    }

    public static void SLC() {
        Scanner sc = new Scanner(System.in);
        ClearConsole();
        try {
            System.out.println("+----------------------------------------------------------------+");
            System.out.println("|                 Search Leasing Category                        |");
            System.out.println("+----------------------------------------------------------------+");

            LS1:
            while (true) {
                System.out.printf("%-40s%3s", "\nEnter lease amount", ": ");
                double Lamount = sc.nextDouble();

                LR:
                while (true) {
                    if (Lamount > 0) {
                        System.out.printf("%-40s%3s", "\nEnter annual interest rate", ": ");

                        double Rate = sc.nextDouble();
                        if (Rate > 0) {
                            double i = Rate / 1200;
                            double X = 1 + i;
                            i = Rate / 1200;
                            double N1 = Math.pow(X, 36);
                            double N2 = Math.pow(X, 48);
                            double N3 = Math.pow(X, 60);
                            double mInstallment1 = Lamount * i / (1 - (1 / N1));
                            double mInstallment2 = Lamount * i / (1 - (1 / N2));
                            double mInstallment3 = Lamount * i / (1 - (1 / N3));

                            System.out.println("\n");

                            System.out.printf("Your monthly instalment for 3 year leasing plan - %.2f", mInstallment1);
                            System.out.printf("\nYour monthly instalment for 4 year leasing plan - %.2f", mInstallment2);
                            System.out.printf("\nYour monthly instalment for 5 year leasing plan - %.2f", mInstallment3);
                            System.out.println(" ");
                            while (true) {
                                System.out.print("\nDo you want to Search anther Leasing(Y/N) : ");
                                char x1 = sc.next().charAt(0);
                                if (x1 == 'y' || x1 == 'Y') {
                                    SLC();
                                } else if (x1 == 'n' || x1 == 'N') {
                                    LeasingPayment();
                                } else {
                                    System.out.println("\n\t\tInvalid option...");
                                    continue;
                                }
                            }
                        } else {
                            System.out.println("\n\tInvalid Rate..");
                            while (true) {
                                System.out.print("\nDo you want to enter the correct value again (Y/N) : ");
                                char x1 = sc.next().charAt(0);
                                if (x1 == 'y' || x1 == 'Y') {
                                    continue LR;
                                } else if (x1 == 'n' || x1 == 'N') {
                                    LeasingPayment();
                                } else {
                                    System.out.println("\n\t\tInvalid option...");
                                    continue;
                                }
                            }
                        }
                    } else {
                        System.out.println("\n\tInvalid Lease Amount...");
                        while (true) {
                            System.out.print("\nDo you want to enter the correct value again (Y/N) : ");
                            char x1 = sc.next().charAt(0);
                            if (x1 == 'y' || x1 == 'Y') {
                                continue LS1;
                            } else if (x1 == 'n' || x1 == 'N') {
                                LeasingPayment();
                            } else {
                                System.out.println("\n\t\tInvalid option...");
                                continue;
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error ..." + e);
            SLC();
        }
    }

    public static void FLA() {
        Scanner sc = new Scanner(System.in);

        ClearConsole();
        try {
            System.out.println(" ");
            System.out.println("+----------------------------------------------------------------+");
            System.out.println("|                 Find the Leasing Amount                        |");
            System.out.println("+----------------------------------------------------------------+");

            Lf1:
            while (true) {
                System.out.printf("%-55s%3s", "\nEnter the monthly lease payment amount you can afford", ": ");

                double pamount = sc.nextDouble();
                Lf2:
                while (true) {
                    if (pamount > 0) {
                        System.out.printf("%-55s%3s", "\nEnter number of year", ": ");

                        int Year = sc.nextInt();
                        Lf3:
                        while (true) {
                            if (Year < 6 && Year > 0) {

                                System.out.printf("%-55s%3s", "\nEnter annual interest rate", ": ");
                                double Rate = sc.nextDouble();

                                if (Rate > 0) {
                                    int n = Year * 12;
                                    double i = Rate / 1200;
                                    double X = 1 + i;
                                    double N = Math.pow(X, n);
                                    double leaseAmount = pamount / (i / (1 - (1 / N)));

                                    double L = Math.round(leaseAmount);
                                    System.out.printf("%-55s%3s%.2f", "\nyou can get Lease Amount", ": ", L);

                                    while (true) {
                                        System.out.printf("%-56s%3s", "\n\nDo you want to find anther Leasing(Y/N)", ": ");
                                        char x1 = sc.next().charAt(0);
                                        if (x1 == 'y' || x1 == 'Y') {
                                            FLA();
                                        } else if (x1 == 'n' || x1 == 'N') {

                                            LeasingPayment();
                                        } else {
                                            System.out.println("\n\t\tInvalid option...");
                                            continue;
                                        }
                                    }
                                } else {
                                    System.out.println("\n\tInvalid number of rate..Enter the correct value again...");
                                    continue Lf3;
                                }

                            } else {
                                System.out.println("\n\tInvalid number of year (max = 5)..Enter the correct value again...");
                                continue Lf2;
                            }
                        }

                    } else {
                        System.out.println("\n\tInvalid Lease Amount...");

                        System.out.print("\nDo you want to enter the correct value again (Y/N) : ");
                        char x1 = sc.next().charAt(0);
                        if (x1 == 'y' || x1 == 'Y') {
                            continue Lf1;
                        } else {
                            LeasingPayment();
                        }
                    }
                }

            }
        } catch (Exception e) {
            System.out.println("Error ..." + e);
            FLA();
        }
    }

    public static void main(String[] args) {

        System.out.println("\t\t\t                         .....SUPUN B HERATH.....");
        Home();
    }
}
