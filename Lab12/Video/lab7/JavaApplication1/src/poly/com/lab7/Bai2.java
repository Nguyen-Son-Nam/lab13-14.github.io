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
public abstract class Bai2 {
    private String hoten;
    private String nganh;
    public Bai2(){
}

    public Bai2(String hoten, String nganh) {
        this.hoten = hoten;
        this.nganh = nganh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
         public void nhap(){
             Scanner nhap = new Scanner(System.in);
             System.out.println("Nhập tên: ");
             setHoten(nhap.nextLine());
             System.out.println("Nhập ngành: ");
             setNganh(nhap.nextLine());
}
          public void xuat(){
              System.out.println("=>"+getHoten()+" - "+getNganh()
                                    +" - "+getDiem()
                                    +" - "+hocLuc());
}
            public abstract double getDiem();
            public String hocLuc(){
            double diem = getDiem();
            String strHocLuc = " ";
            if(diem>9){
            strHocLuc = "Xuat Sac";
           }else if(diem>=7.5){
            strHocLuc = "Gioi";
           }else if(diem>=6.5){
            strHocLuc = "Kha";
           }else if(diem>=5){
            strHocLuc = "Trung binh";
           }else{
            strHocLuc = "Yeu";
}
        return strHocLuc;
}
}
