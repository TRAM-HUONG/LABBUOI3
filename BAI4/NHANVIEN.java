package bai4;

import java.util.Scanner;

public class NHANVIEN {
    private String maso;
    private String hoten;
    private double luongcoban;
    private double hesoluong;
    private static int soluongnv = 0;

    public NHANVIEN() {
        maso = "";
        hoten = "";
        luongcoban = 0;
        hesoluong = 0;
        soluongnv++;
    }

    public NHANVIEN(String maso, String hoten, double luongcoban, double hesoluong) {
        this.maso = maso;
        this.hoten = hoten;
        this.luongcoban = luongcoban;
        this.hesoluong = hesoluong;
        soluongnv++;
    }

    public NHANVIEN(NHANVIEN nv) {
        this.maso = nv.maso;
        this.hoten = nv.hoten;
        this.luongcoban = nv.luongcoban;
        this.hesoluong = nv.hesoluong;
        soluongnv++;
    }

    public String getmaso() {
        return maso;
    }

    public String gethoten() {
        return hoten;
    }

    public double gethesoluong() {
        return hesoluong;
    }

    public void setmaso(String maso) {
        this.maso = maso;
    }

    public void sethoten(String hoten) {
        this.hoten = hoten;
    }

    public void sethesoluong(double hesoluong) {
        this.hesoluong = hesoluong;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ma so: ");
        maso = sc.nextLine();
        System.out.print("nhap ho ten: ");
        hoten = sc.nextLine();
        System.out.print("nhap luong co ban: ");
        luongcoban = sc.nextDouble();
        System.out.print("nhap he so luong: ");
        hesoluong = sc.nextDouble();
    }

    public void xuat() {
        System.out.println("ma: " + maso + ", ten: " + hoten + ", lcb: " + luongcoban + ", he so: " + hesoluong + ", luong: " + tinhluong());
    }

    public double tinhluong() {
        return luongcoban * hesoluong;
    }

    public static int getsoluongnv() {
        return soluongnv;
    }

    public static void main(String[] args) {
        NHANVIEN nv1 = new NHANVIEN();
        NHANVIEN nv2 = new NHANVIEN("nv02", "Hoa Thien Cot", 1500, 2.5);
        NHANVIEN nv3 = new NHANVIEN(nv2);
        nv3.sethoten("Bach Tu Hoa");

        System.out.println(" 3 nhan vien khoi tao khac nhau ");
        nv1.nhap();
        nv1.xuat();
        nv2.xuat();
        nv3.xuat();

        System.out.println("nhap danh sach nhan vien");
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so nhan vien: ");
        int n = sc.nextInt();
        sc.nextLine();

        NHANVIEN[] ds = new NHANVIEN[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhan vien " + (i + 1));
            ds[i] = new NHANVIEN();
            ds[i].nhap();
        }

        System.out.println("xuat danh sach nhan vien ");
        for (NHANVIEN nv : ds) {
            nv.xuat();
        }

        double maxhe = ds[0].gethesoluong();
        String tenmax = ds[0].gethoten();
        for (NHANVIEN nv : ds) {
            if (nv.gethesoluong() > maxhe) {
                maxhe = nv.gethesoluong();
                tenmax = nv.gethoten();
            }
        }
        System.out.println("nhan vien co he so luong cao nhat: " + tenmax);

        ds[0].sethoten("ten moi nhan vien 1");
        System.out.println("ten nhan vien dau tien sau khi doi:");
        ds[0].xuat();

        System.out.println("tong so nhan vien: " + NHANVIEN.getsoluongnv());
    }
}

    
