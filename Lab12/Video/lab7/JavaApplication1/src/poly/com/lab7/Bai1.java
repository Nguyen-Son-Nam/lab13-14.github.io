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
public class Bai1 {
     private double chieudai;
     private double chieurong;
   public Bai1(){
}
   public Bai1(double chieudai, double chieurong){
        this.chieudai = chieudai;
         this.chieurong = chieurong;
}
    public double getChieudai() {
        return chieudai;
    }

    public void setChieudai(double chieudai) {
        this.chieudai = chieudai;
    }

    public double getChieurong() {
        return chieurong;
    }

    public void setChieurong(double chieurong) {
        this.chieurong = chieurong;
    }
     

   
     public double getchuvi(){
         return 2*(getChieudai()+getChieurong());
}
     public double getdientich(){
      return getChieudai() + getChieurong();
}
     public void xuat(){
         Scanner nhap = new Scanner(System.in);
         System.out.println("Chiều dài: "+getChieudai());
         System.out.println("Chiều rộng: "+getChieurong());
         System.out.println("Chu vi: "+getchuvi());
         System.out.println("Diện tích: "+getdientich());
}
}
