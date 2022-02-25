/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.com.lab7;

/**
 *
 * @author THANH SON
 */
public class Hinhvuong extends Bai1 {
     public Hinhvuong(){

}
           public Hinhvuong(double chieudai){
             super(chieudai, chieudai);
}
           @Override
           public void xuat(){
          System.out.println("Cạnh hình vuông: "+getChieudai());
         System.out.println("Chu vi: "+getchuvi());
         System.out.println("Diện tích: "+getdientich());
}
}
