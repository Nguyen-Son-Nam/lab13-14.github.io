/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.com.lab7;

import java.util.Scanner;

/**
 *
 * @author THANH SON
 */
public class Sinhvien extends Bai2 {
     private double diemMarketting;
     private double diemSales;
    public Sinhvien(){
} 

    public Sinhvien(String hoten, String nganh, double diemMarketing, double diemSales) {
        super(hoten, nganh);
        this.diemMarketting = diemMarketting;
        this.diemSales = diemSales;
       
    }

    public double getDiemMarketting() {
        return diemMarketting;
    }

    public void setDiemMarketting(double diemMarketting) {
        this.diemMarketting = diemMarketting;
    }

    public double getDiemSales() {
        return diemSales;
    }

    public void setDiemSales(double diemSales) {
        this.diemSales = diemSales;
    }

   
    
    @Override
       public void nhap(){
        super.nhap();
        Scanner nhap = new Scanner(System.in);
        System.out.println("Marketing: ");
        setDiemMarketting(nhap.nextDouble());
         System.out.println("Sales: ");
        setDiemSales(nhap.nextDouble()); 
        
}
     

    @Override
       public double getDiem(){
        return (2*getDiemMarketting()+getDiemSales())/3;
}
    public static void main(String[] args) {
        Sinhvien sv = new Sinhvien();
       sv.nhap();
      sv.xuat();
    }
}

