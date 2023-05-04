package lab2;

import java.util.Scanner;
 
public class main {

    static Scanner sc = new Scanner(System.in);
    static void nhapalbum(album ab) {
        System.out.print("Nhập mã CD: ");
        ab.setMaCD(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhập tên CD : ");
        ab.setTenCD(sc.nextLine());
        System.out.print("Nhập số lượng bài hát : ");
        ab.setSoBH(sc.nextInt());
        System.out.print("Nhập giá thành : ");
        ab.setGiaThanh(sc.nextFloat());
    }
    public static void main(String[] args) {
        album alb[] = null;
        int chon, n = 0;
        boolean flag = true;
        do {
 System.out.println("\n"+"-----------bảng chọn----------");
 System.out.println("hãy chọn chức năng");
 System.out.println("1.Nhập thông tin CD \n" +
                    "2.Xuất danh sách Album.\n" + 
                    "3.Tính tổng giá thành \n" + 
                    "4.Tổng số lượng CD \n" +
                    "5.Sắp xếp giảm dần theo giá thành\n"+
                    "6.Sắp xếp tăng dần theo tựa CD\n"+
                    "Nhập số khác để thoát");
 System.out.println("--------------------------------");
            chon= sc.nextInt();
            switch (chon) {
                case 1:
                    System.out.println("Nhập số lượng CD : ");
                    n = sc.nextInt();
                    alb = new album[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("CD thứ " + (i + 1)+": ");
                        alb[i] = new album();
                        nhapalbum(alb[i]);
                    }
                break;
        
                case 2:
                    System.out.printf("%-10s %-20s %-10s %-20s \n", "Mã CD", "Tên CD", "Số bài hát", "Giá thành");
                    for (int i = 0; i < n; i++) {
                    alb[i].Hienthialbum();
                    }
                break;
                case 3:
                int sum = 0;
                    for (int i = 0; i < n; i++) {
                    sum += alb[i].getGiaThanh();
                    }
                    System.out.println("" + "Tổng giá thành là : " + sum);
                break;
                case 4:
               System.out.println("Tổng số lượng CD là : " + n);
                break;
                case 5:
                album temp = alb[0];
                for (int i = 0; i < n - 1; i++) {
                   for (int j = i + 1; j < n; j++) {
                      if (alb[i].getGiaThanh() < alb[j].getGiaThanh()) {
                         temp = alb[j];
                         alb[j] = alb[i];
                         alb[i] = temp;
                      }
                    }
                }
                    System.out.println("Sắp xếp thành công, Nhập số 2 để kiểm tra!");
                break;
                case 6:
                 temp = alb[0];
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = i + 1; j < n; j++) {
                            if (alb[i].getTenCD().compareTo(alb[j].getTenCD())>0) {
                                temp = alb[j];
                                alb[j] = alb[i];
                                alb[i] = temp;
                            }
                        }
                    }
                    System.out.println("Sắp xếp thành công, Nhập số 2 để kiểm tra!");
                break;
                default:
                    System.out.println("exit chương trình");
                    flag = false;
                break;
            }
        }while (flag) ;
    }
}


