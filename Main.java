package assignment3;

public class Main {
    public static void main(String[] args) {
    User sv1 = new User();
    User sv2= new User();
    Room p1=new Room();
    sv1.insert();
    sv2.insert();
    p1.insert();
    System.out.println("thêm sv 1");
    p1.add(sv1.getSotienhienco(),sv1.getTen());
    p1.print();
    System.out.println("xóa sv 1");
    p1.remove(sv1.getTen());
    p1.print();
    }
}
