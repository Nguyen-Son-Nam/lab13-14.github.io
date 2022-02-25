/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASM;

import java.util.Scanner;

/**
 *
 * @author yutub
 */
public class ASM1 {
    public static void nhapVN() {
        System.out.println("Nhập danh sách nhân viên");
    }
    public static void xuatTT() {
        System.out.println("2. Xuất thông tin các nhân viên");
    }
    public static void timNV() {
        System.out.println("3. Xuất thông tin các nhân viên");
    }
     public static void xoaNV() {
        System.out.println("4. Xóa nhân viên theo mã");
    }
     public static void capnhatTT() {
       System.out.println("5. Cập nhật thông tin nhân viên theo mã");
    }
     public static void timTKL() {
        System.out.println("6. Tìm các nhân viên theo khoảng lương");
    }
     public static void sapxepTHVA() {
        System.out.println("7. Sắp xếp nhân viên theo họ và tên");
    }
     public static void sapxapTTN() {
        System.out.println("8. Sắp xếp nhân viên theo thu nhập");
    }
    public static void xuat5NV() {
         System.out.println("9. Xuất 5 nhân viên có thu nhập cao nhất");
    }
    public void menu() {
        Scanner s = new Scanner(System.in);
        int chon = 0;
        do {
            System.out.println("\nMenu chuong trinh");
            System.out.println("1. Nhập danh sách nhân viên");
            System.out.println("2. Xuất thông tin các nhân viên");
            System.out.println("3. Tìm và hiển thị nhân viên theo mã");
            System.out.println("4. Xóa nhân viên theo mã");
            System.out.println("5. Cập nhật thông tin nhân viên theo mã");
            System.out.println("6. Tìm các nhân viên theo khoảng lương");
            System.out.println("7. Sắp xếp nhân viên theo họ và tên");
            System.out.println("8. Sắp xếp nhân viên theo thu nhập");
            System.out.println("9. Xuất 5 nhân viên có thu nhập cao nhất");
            System.out.print("Moi ban chon: ");

            chon = s.nextInt();
            if (chon != 0) {
                switch (chon) {
                    case 0:
                        break;
                    case 1:
                        nhapVN();
                        break;
                    case 2:
                        xuatTT();
                        break;
                    case 3:
                        timNV();
                        break;
                    case 4:
                        xoaNV();
                        break;
                    case 5:
                        capnhatTT();
                        break;
                    case 6:
                       timTKL();
                        break;
                    case 7:
                        sapxepTHVA();
                        break;
                    case 8:
                        sapxapTTN();
                        break;
                    case 9:
                        xuat5NV();
                        break;
                    default:
                        System.out.println("Nhap sai, nhap lai!");
                }
            }

        } while (chon != 0);

 }
}
