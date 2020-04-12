/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LopHoc;

public class HocSinh extends CaNhan {
    private String lop;
    private String nangKhieu;

    public HocSinh() {}

    public HocSinh(String lop, String nangKhieu, String hoTen, int tuoi, String diaChi, String sdt) {
        super(hoTen, tuoi, diaChi, sdt);
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNangKhieu() {
        return nangKhieu;
    }

    public void setNangKhieu(String nangKhieu) {
        this.nangKhieu = nangKhieu;
    }

    @Override
    public String HienThiTT() {
        String tt = this.getHoTen()+"\t"+ this.getLop() +"\t"+ this.getNangKhieu() +"\t\t"+ this.getTuoi();
        return tt +"\t"+ this.getDiaChi() +"\t"+ this.getSdt();
    }
        
}
