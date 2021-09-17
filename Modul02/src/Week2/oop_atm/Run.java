package Week2.oop_atm;

import java.sql.SQLOutput;
import java.text.DecimalFormat;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner;
        char choice;
        Account account = new Account();
        Atm atm = new Atm();
        do {
            System.out.println("Ngan hang ABC kinh chao Quy khach " + account.getName());
            System.out.println("----------------------------------------------------------");
            System.out.println("| Menu                                                    |");
            System.out.println("|   1. Nhan phim A de kiem tra tai khoan                  |");
            System.out.println("|   2. Nhan phim D de nạp tien                            |");
            System.out.println("|   3. Nhan phim W de rut tien                            |");
            System.out.println("|   4. Nhan phim H  de xem lich su 5 lan gan day          |");
            System.out.println("|   5. Nhan phim X de thoat                               |");
            System.out.println("|                                                         |");
            System.out.println("----------------------------------------------------------");
            System.out.println("======================================================");
            System.out.print(" Nhap lua chon cua ban:  ");
            scanner = new Scanner(System.in);
            choice = scanner.nextLine().charAt(0);

            switch (choice) {
                case 'A':
                case 'a':
                    displayTotalMoney(account);
                    break;
                case 'D':
                case 'd':
                    displayRechargeMoney(account, atm);
                    break;
                case 'W':
                case 'w':
                    displayWithdrawMoney(account, atm);
                    break;
                case 'H':
                case 'h':
                    displayHistory(account);
                    break;
                case 'x':
                case 'X':
                    System.out.println("----------------------------------------------------------");
                    System.out.println("Cam on ban da su dung dich vu ATM");
                    System.out.println("----------------------------------------------------------");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ban hay chon chuc nang theo phim chon !");
                    System.out.println("======================================================");
                    break;
            }
        } while ((choice != 'X') && (choice != 'x'));
    }

    public static void displayTotalMoney(Account obj) {
        DecimalFormat formatter = new DecimalFormat("###,###,###");
        System.out.println("----------------------------------------------------------");
        System.out.println(" So du tai khoan khach hang la: " + formatter.format(obj.getMoney()) + " VND");
        System.out.println("----------------------------------------------------------");
        System.out.println("\nBam nut theo menu de tiep tuc giao dich ");
        System.out.println("======================================================");
    }

    public static void displayRechargeMoney(Account obj, Atm atm) {
        DecimalFormat formatter = new DecimalFormat("###,###,###");
        long recharge_money;
        final long MAX_RECHARGE = 1000000000 * 10;
        boolean isRechargeDivisible1000, isBigger10Billion, isNotLong;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("----------------------------------------------------------");
            System.out.println("Giao dich Nap tien ");
            System.out.print("Vui long nhap so tien: ");
            recharge_money = scanner.nextLong();
            System.out.println("----------------------------------------------------------");
            isRechargeDivisible1000 = recharge_money % 1000 != 0;
            isBigger10Billion = recharge_money > MAX_RECHARGE;
            isNotLong = recharge_money / 2 + obj.getMoney() / 2 >= Long.MAX_VALUE / 2;
            if (isRechargeDivisible1000) {
                System.out.println("----------------------------------------------------------");
                System.out.println("So tien nap vào phai chan nghin dong !");
                System.out.println("----------------------------------------------------------");
            }
            if (isBigger10Billion) {
                System.out.println("----------------------------------------------------------");
                System.out.println("Gioi han muc nap la 10,000,000,000 VND !");
                System.out.println("----------------------------------------------------------");
            }
            if (isNotLong) {
                System.out.println("So tien qua lon so voi muc hien thi cua may cua ngan hang !");
            }
        } while ((isRechargeDivisible1000) || (isBigger10Billion) || (isNotLong));
        obj.rechargeMoney(recharge_money);
        atm.setMoney(atm.getMoney() + recharge_money);
        System.out.println("----------------------------------------------------------");
        System.out.println("So du tai khoan khach hang la: " + formatter.format(obj.getMoney()) + " VND");
        System.out.println("----------------------------------------------------------");
        System.out.println();
        System.out.println("Bam nut theo menu de tiep tuc giao dich ");
        System.out.println("======================================================");
    }


    public static void displayWithdrawMoney(Account obj, Atm atm) {
        DecimalFormat formatter = new DecimalFormat("###,###,###");
        Scanner scanner = new Scanner(System.in);
        long withdraw_money;
        System.out.println("----------------------------------------------------------");
        System.out.println("Giao dich Rut tien ");
        System.out.print("Vui long nhap so tien: ");
        withdraw_money = scanner.nextLong();
        System.out.println("----------------------------------------------------------");
        boolean isTotalMoneyBiggerWithdraw = obj.getMoney() >= withdraw_money;
        boolean isWithdrawDivisible1000 = withdraw_money % 1000 == 0;
        boolean isMaxWithdraw = withdraw_money <= 5000000;
        boolean isMoneyAtmBiggerWithdraw = atm.getMoney() >= withdraw_money;//tien Atm du rut
        boolean isMinWithdraw = withdraw_money >= 50000;
        boolean isMinAtm = atm.getMoney() <= 50000;

        if (isMinAtm) {
            System.out.println("Tien trong Atm khong du rut ! Mong quy khach thong cam !");
        } else {
            if (isMinWithdraw) {
                if (isMoneyAtmBiggerWithdraw) {
                    if (isTotalMoneyBiggerWithdraw) {
                        if (isWithdrawDivisible1000) {
                            if (isMaxWithdraw) {
                                obj.withdrawMoney(withdraw_money);
                                atm.setMoney(atm.getMoney() - withdraw_money);
                                System.out.println("----------------------------------------------------------");
                                System.out.println("Giao dich thanh cong. Ban vua rut " + formatter.format(withdraw_money) + "VND thanh cong.");
                                System.out.println("So du tai khoan khach hang la: " + formatter.format(obj.getMoney()) + " VND");
                                System.out.println("----------------------------------------------------------");
                            } else {
                                System.out.println("----------------------------------------------------------");
                                System.out.println("So tien rut 1 lan khong duoc qua 5,000,000 VND!");
                                System.out.println("----------------------------------------------------------");
                            }
                        } else {
                            System.out.println("----------------------------------------------------------");
                            System.out.println("So tien rut vào phai chan nghin dong !");
                            System.out.println("----------------------------------------------------------");
                        }
                    } else {
                        System.out.println("----------------------------------------------------------");
                        System.out.println("Giao dich khong thanh cong");
                        System.out.println("So du tai khoan khach hang la: " + formatter.format(obj.getMoney()) + " VND.");
                        System.out.println("Ban khong the rut so tien hon so du tai khoan");
                        System.out.println("----------------------------------------------------------");
                    }
                } else {
                    System.out.println("So tien trong Atm khong du de ban rut !");
                    System.out.println(atm);
                    System.out.println("So tien ban chi co the rut la " + formatter.format(atm.getMoney()));
                }
            } else {
                System.out.println("So tien rut phai lon hon 50,000 VND !");
            }
        }
        System.out.println();
        System.out.println("Bam nut theo menu de tiep tuc giao dich");
        System.out.println("======================================================");
    }

    public static void displayHistory(Account obj) {
        System.out.println("----------------------------------------------------------");
        System.out.println("lich su giao dich ");
        String str = obj.transactionHistory();
        System.out.print(str);
        System.out.println("----------------------------------------------------------");
    }

}
