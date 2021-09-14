package Week2.oop_atm;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner;
        char choice;
        Account account = new Account();


        do {
            System.out.println("Ngan hang ABC kinh chao Quy khach " + account.getName() );
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
                    System.out.println("----------------------------------------------------------");
                    System.out.println(" So du tai khoan khach hang la: " + account.getMoney() + " VND");
                    System.out.println("----------------------------------------------------------");
                    System.out.println("\nBam nut theo menu de tiep tuc giao dich ");
                    System.out.println("======================================================");
                    break;
                case 'D':
                case 'd':
                    long recharge_money;
                    do {
                        System.out.println("----------------------------------------------------------");
                        System.out.println("Giao dich Nap tien ");
                        System.out.print("Vui long nhap so tien: ");
                        recharge_money = scanner.nextLong();
                        System.out.println("----------------------------------------------------------");
                        if (recharge_money % 1000 != 0) {
                            System.out.println("----------------------------------------------------------");
                            System.out.println("So tien nap vào phải chẵn nghìn đồng !");
                            System.out.println("----------------------------------------------------------");
                        }
                        if (recharge_money > 10000000) {
                            System.out.println("----------------------------------------------------------");
                            System.out.println("Gioi han muc nap la 10.000.000.000 Vnd !");
                            System.out.println("----------------------------------------------------------");
                        }
                    } while ((recharge_money % 1000 != 0) || (recharge_money > 10000000));
                    account.rechargeMoney(recharge_money);
                    System.out.println("----------------------------------------------------------");
                    System.out.println("So du tai khoan khach hang la: " + account.getMoney() + " VND");
                    System.out.println("----------------------------------------------------------");
                    System.out.println();
                    System.out.println("Bam nut theo menu de tiep tuc giao dich ");
                    System.out.println("======================================================");
                    break;
                case 'W':
                case 'w':
                    long withdraw_money;
                    System.out.println("----------------------------------------------------------");
                    System.out.println("Giao dich Rut tien ");
                    System.out.print("Vui long nhap so tien: ");
                    withdraw_money = scanner.nextLong();
                    System.out.println("----------------------------------------------------------");
                    if (account.getMoney() >= withdraw_money) {
                        if (withdraw_money % 1000 == 0) {
                            account.withdrawMoney(withdraw_money);
                            System.out.println("----------------------------------------------------------");
                            System.out.println("Giao dich thanh cong. Ban vua rut " + withdraw_money + "VND thanh cong.");
                            System.out.println("So du tai khoan khach hang la: " + account.getMoney() + " VND");
                            System.out.println("----------------------------------------------------------");
                        } else {
                            System.out.println("----------------------------------------------------------");
                            System.out.println("So tien rut vào phải chẵn nghìn đồng ");
                            System.out.println("----------------------------------------------------------");
                        }

                    } else {
                        System.out.println("----------------------------------------------------------");
                        System.out.println("Giao dich khong thanh cong");
                        System.out.println("So du tai khoan khach hang la: " + account.getMoney() + " VND.");
                        System.out.println("Ban khong the rut so tien hon so du tai khoan");
                        System.out.println("----------------------------------------------------------");
                    }
                    System.out.println();
                    System.out.println("Bam nut theo menu de tiep tuc giao dich");
                    System.out.println("======================================================");
                    break;
                case 'H':
                case 'h':
                    System.out.println("----------------------------------------------------------");
                    System.out.println("lich su giao dich ");
                    String str = account.transactionHistory();
                    System.out.print(str);
                    System.out.println("----------------------------------------------------------");
                    break;
                case 'x':
                case 'X':
                    System.out.println("----------------------------------------------------------");
                    System.out.println("Cam on ban da su dung dich vu ATM");
                    System.out.println("----------------------------------------------------------");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Bạn hãy chọn chức năng theo phím chọn !");
                    System.out.println("======================================================");
                    break;
            }
        } while ((choice != 'X') || (choice != 'x'));
    }
}
