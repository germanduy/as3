package assignment3;

import java.util.Scanner;

public class User {
    String ten, email;
    int dienthoai, tuoi, sotienhienco;

    public String getTen() {
        return ten;
    }

    public String getEmail() {
        return email;
    }

    public int getDienthoai() {
        return dienthoai;
    }

    public int getTuoi() {
        return tuoi;
    }

    public int getSotienhienco() {
        return sotienhienco;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDienthoai(int dienthoai) {
        this.dienthoai = dienthoai;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setSotienhienco(int sotienhienco) {
        this.sotienhienco = sotienhienco;
    }

    public void insert(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tên: ");
        setTen(sc.nextLine());
        System.out.println("Email: ");
        setEmail(sc.nextLine());
        System.out.println("Điện thoại:  ");
        setDienthoai(sc.nextInt());
        System.out.println("Tuổi: ");
        setTuoi(sc.nextInt());
        System.out.println("Số tiền hiện có: ");
        setSotienhienco(sc.nextInt());
    }
}
