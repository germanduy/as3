package assignment3;

import java.util.Scanner;

public class Room {
    String tenphong,vitri;
    int dsnguoidung,giathuephong;

    public String getTenphong() {
        return tenphong;
    }

    public String getVitri() {
        return vitri;
    }

    public int getDsnguoidung() {
        return dsnguoidung;
    }

    public int getGiathuephong() {
        return giathuephong;
    }

    public void setTenphong(String tenphong) {
        this.tenphong = tenphong;
    }

    public void setVitri(String vitri) {
        this.vitri = vitri;
    }

    public void setDsnguoidung(int dsnguoidung) {
        this.dsnguoidung = dsnguoidung;
    }

    public void setGiathuephong(int giathuephong) {
        this.giathuephong = giathuephong;
    }

    // insert
    public void insert(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên phòng, vị trí, giá phòng, danh sách người dùng");
        setTenphong(sc.nextLine());
        setVitri(sc.nextLine());
        setGiathuephong(sc.nextInt());
        setDsnguoidung(sc.nextInt());

    }
    //thêm người
    public void add(int tien, String user ){
        if (tien> this.giathuephong){
            setDsnguoidung(this.dsnguoidung+1);
        }else {
            System.out.println("không đủ tiền");
        }
    }
    //xóa
    public void remove(String user){
        setDsnguoidung(this.dsnguoidung-1);

    }
    public void print(){
        System.out.println("tên phòng: "+getTenphong());
        System.out.println("vị trí: "+ getVitri());
        System.out.println("giá phòng: "+ getGiathuephong());
        System.out.println("Ds thuê phòng: "+ getDsnguoidung());
    }
}
