/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.com.asm;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author THANH SON
 */
public class Menu {
        static int soluong;
        static String[] code,ten,mail;
        static double[] luong;
        // Nhập nhân viên
        public static void  nhap(){
          Scanner nhap = new Scanner(System.in);
            System.out.println("Nhập số lượng nhân viên");
            soluong= Integer.parseInt(nhap.nextLine());
            code = new String[soluong];
            ten= new String[soluong];
            mail = new String[soluong];
            luong = new double[soluong];
             for(int i=0;i<soluong;i++){
                 System.out.println("Mã nhân viên: ");
                 code[i]= nhap.nextLine();
                 System.out.println("Tên nhân viên: ");
                 ten[i]=nhap.nextLine();
                 System.out.println("Mail: ");
                 mail[i]=nhap.nextLine();
                 System.out.println("Lương: ");
                 luong[i]=Double.parseDouble(nhap.nextLine());
}
           
}
       // Xuất nhân viên
       public static void xuat(){
           System.out.println("Xuất nhân viên");
            for(int i=0;i<soluong;i++){
                System.out.printf("Mã: %s\n",code[i]);
                System.out.printf("Tên: %s\n",ten[i]);
               System.out.printf("Mail: %s\n",mail[i]);
               System.out.printf("Lương: %s\n",luong[i]);
}
}
 public static void timkiem(){
             System.out.println("Tìm theo mã nhân viên");
             Scanner nhap = new Scanner(System.in);
             String ma = nhap.nextLine();
             for(int i=0;i<soluong;i++){
                 if(code[i].equalsIgnoreCase(ma)){ //nếu ma=ma
                      System.out.println("Thông tin nhân viên cần tìm");
                      System.out.printf("Mã: %s\n; Tên: %s\n; Mail: %s\n; Lương: %.1f\n",code[i],ten[i],mail[i],luong[i]);
}
}
}
         // Xóa nhân viên
public static void xoanhanvien(){
           System.out.println("Xóa theo mã nhân viên");
           Scanner nhap = new Scanner(System.in);
           String ma = nhap.nextLine();
for(int i =0; i<soluong;i++){
            if(code[i].equalsIgnoreCase(ma)){
               removeItemString(code,i); // xóa mảng code
               removeItemString(ten,i);
               removeItemString(mail,i);
               removeItemDouble(luong,i);
}
}
}
         // xóa mảng theo chỉ số
  static String[] removeItemString(String[] arr, int index){
     if(arr==null || index<0 || index>arr.length){//ktra dieu kien chi so mang   
           return arr;
}
             String[] anotherArray = new String[arr.length-1]; // mảng tạm
             for(int i =0,k=0;i<arr.length;i++){
                 if(i==index){
                     continue;
}
                       anotherArray[k++]=arr[i]; // nhận lại mãng mới sau xóa
}
                       return anotherArray;
}
       // xóa mảng double
   static double[] removeItemDouble(double[] arr, int index){
     if(arr==null || index<0 || index>arr.length){//ktra dieu kien chi so mang   
           return arr;
}
             double[] anotherArray = new double[arr.length-1]; // mảng tạm
             for(int i =0,k=0;i<arr.length;i++){
                 if(i==index){
                     continue;
}
                       anotherArray[k++]=arr[i]; // nhận lại mãng mới sau xóa
}
                       return anotherArray;
}
     // cập nhật nhân viên theo code
public static void capnhat(){
         System.out.println("Cập nhật nhân viên theo code");
         Scanner nhap = new Scanner(System.in);
         String ma = nhap.nextLine();
         for(int i =0;i<soluong;i++){
           if(code[i].equalsIgnoreCase(ma)){
               System.out.println("Cập nhật thông tin mới: Tên, Mail, Lương");
               ten[i] = nhap.nextLine();
               mail[i] = nhap.nextLine();
               luong[i] = Double.parseDouble(nhap.nextLine());
} 
}
}
          // tìm nhân viên theo mức lương
public static void timnhanvien(){
        
         System.out.println("Tìm theo mức lương");
         Scanner nhap = new Scanner(System.in);
         System.out.println("Nhập lương min: ");
         double luongmin= Double.parseDouble(nhap.nextLine());
         System.out.println("Nhập lương max: ");
         double luongmax= Double.parseDouble(nhap.nextLine());
          for(int i =0;i<soluong;i++){
                if(luongmin <= luong[i] && luong[i]<=luongmax){
                    System.out.printf("Code: %s\n",code[i]);
                    System.out.printf("Tên: %s\n",ten[i]);
                    System.out.printf("Mail: %s\n",mail[i]);
                    System.out.printf("Lương: %s\n",luong[i]);
}
}
}

//sắp xếp theo tên
public static void hoten(){
         System.out.println("Sắp xếp theo tên");
          for(int i=0;i<soluong;i++){
                 for(int j=i+1;j<soluong;j++){
                   if(ten[i].charAt(0)>ten[j].charAt(0)){
                       String tentemp=ten[i];
                       ten[i] = ten[j];
                       ten[j] = tentemp;
                    
                        String codetemp=code[i];
                       code[i] = code[j];
                       code[j] = tentemp;
                         
                         String mailtemp=mail[i];
                       mail[i] = mail[j];
                       mail[j] = tentemp;
                        
                        double luongtemp=luong[i];
                         luong[i] = luong[j];
                        luong[j] = luongtemp;
}
}
}
}
//sắp xếp theo thu nhập
public static void thunhap(){
           System.out.println("Sắp xếp theo thu nhập");
          for(int i=0;i<soluong;i++){
                 for(int j=i+1;j<soluong;j++){
                   if(luong[i]>luong[j]){
                       String tentemp=ten[i];
                       ten[i] = ten[j];
                       ten[j] = tentemp;
                    
                        String codetemp=code[i];
                       code[i] = code[j];
                       code[j] = tentemp;
                         
                         String mailtemp=mail[i];
                       mail[i] = mail[j];
                       mail[j] = tentemp;
                        
                        double luongtemp=luong[i];
                         luong[i] = luong[j];
                        luong[j] = luongtemp;
}
}
}
}
        // 5 nhân viên thu nhaập cao nhất
public static void namnhanvien(){
      System.out.println("Xuất 5 nhân viên thu nhập cao nhất");   
      thunhap();
      if(soluong>5){
         for(int i=0;i<5;i++){
      System.out.printf("Code: %s\n",code[i]);
                    System.out.printf("Tên: %s\n",ten[i]);
                    System.out.printf("Mail: %s\n",mail[i]);
                    System.out.printf("Lương: %s\n",luong[i]);
      

} 
} else{
        xuat();
}
}
    public static void main(String[] args) {
        do{
        System.out.println("1. Nhập danh sách nhân viên");
        System.out.println("2. Xuất danh sách nhân viên");
        System.out.println("3. Tìm và hiển thị nhân viên");
        System.out.println("4. Xóa nhân viên theo mã");
        System.out.println("5. Cập nhật thông tin nhân viên theo mã");
        System.out.println("6. Tìm các nhân viên theo khoảng lương");
        System.out.println("7. Sắp xếp nhân viên theo họ tên");
        System.out.println("8. Sắp xếp nhân viên theo thu nhập");
        System.out.println("9. Xuất 5 nhân viên có thu nhập cao nhất");
    
        System.out.println("Chọn chức năng: ");
        Scanner nhap = new Scanner(System.in);
        int select = nhap.nextInt();
        switch (select) {
            case 1:
              nhap();
                break;
              case 2:
               xuat();
                break;
            case 3:
                timkiem();
                break;
            case 4:
                xoanhanvien();
                break;
case 5:
                capnhat();
                break;
case 6:
                timnhanvien();
                break;
case 7:
                hoten();
                break;
case 8:
                thunhap();
                break;
case 9:
                namnhanvien();
                break;
            default:
                System.out.println("Vui lòng chọn đúng");
                break; 
        }
       
         Scanner nhapx = new Scanner(System.in);
         String tt;
         System.out.println("Bạn có muốn chọn chức năng khác không? y/n");
         tt=nhapx.nextLine();
         if (tt.equalsIgnoreCase("n")){
           break;}
} while(true);
}

    
}
