/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LopHoc;

public class TranHuyThinh_57131383_LopHoc {

    public static void main(String[] args) throws Exception {
        LopHoc lop12 = new LopHoc();
        int error = 0;
       //Tao GV 
        CaNhan giaoVienCN = new GiaoVien("Vat Ly 12", "Vat Ly", "Ngo Thi Bich", 40, "2, 2/4, Nha Trang", "090123456");
        CaNhan gvGD1 = new GiaoVien("Anh Van 12", "Anh Van", "Nguyen Hong Hanh", 32, "40, Cu Chi, Nha Trang", "0196324186");
        CaNhan gvGD2 = new GiaoVien("Tin Hoc 12", "Tin Hoc", "Le Quang Hai", 35, "23, Dien Bien Phu, Nha Trang", "0123765432");
        //Tao HS
        CaNhan hs1 = new HocSinh("lop12", "Anh Van", "Nguyen Van An", 17, "50, 2/4, Nha Trang ", "0967890123");
        CaNhan hs2 = new HocSinh("lop12", "Toan", "Tran Trung Nghia", 17, "35, Le Loi, Nha Trang", "0976543987");
        CaNhan hs3 = new HocSinh("lop12", "Hoa Hoc", "Le Ngoc Hoa", 17, "106, 2/4, Nha Trang", "0588978765");
        //ThemGV
        lop12.setGiaoVienCN(giaoVienCN);
        error += lop12.themGiaoVienGD((GiaoVien) gvGD1);
        error += lop12.themGiaoVienGD((GiaoVien) gvGD2);
        //ThemHS
        error += lop12.themHocSinh((HocSinh) hs1);
        error += lop12.themHocSinh((HocSinh) hs2);
        error += lop12.themHocSinh((HocSinh) hs3);
        
        error += lop12.inDSGVGD();
        error += lop12.inDSHS();
        if (error==0) {
            System.out.println("No error");
        } else {
            System.out.print("Error!!");
        }
    }
    
}
