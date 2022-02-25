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
public class Bai3 extends Bai2{
     private double diemJava;
     private double diemCss;
     private double diemHtml;
    public Bai3(){
} 

    public Bai3(String hoten, String nganh, double diemJava, double diemCss, double diemHtml) {
        super(hoten, nganh);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public double getDiemCss() {
        return diemCss;
    }

    public void setDiemCss(double diemCss) {
        this.diemCss = diemCss;
    }

    public double getDiemHtml() {
        return diemHtml;
    }

    public void setDiemHtml(double diemHtml) {
        this.diemHtml = diemHtml;
    }
    
    @Override
       public void nhap(){
        super.nhap();
        Scanner nhap = new Scanner(System.in);
        System.out.println("Java: ");
        setDiemJava(nhap.nextDouble());
         System.out.println("CSS: ");
        setDiemCss(nhap.nextDouble()); 
         System.out.println("HTML: ");
        setDiemHtml(nhap.nextDouble());
}
     

    @Override
       public double getDiem(){
        return (2*getDiemJava()+getDiemCss()+getDiemHtml())/4;
}
    public static void main(String[] args) {
        Bai3 sv = new Bai3();
       sv.nhap();
      sv.xuat();
    }
}
