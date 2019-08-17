package vn.edu.poly.listview;

public class Sinhvien {

    String id;
    String ten;
    String lop;

    public Sinhvien(String id, String ten, String lop) {
        this.id = id;
        this.ten = ten;
        this.lop = lop;
    }
    public Sinhvien() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
}
