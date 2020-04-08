/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LopHoc;

public class LopHoc {
    CaNhan giaoVienCN;
    QLDS qldsGVGD;
    QLDS qldsHS;

    public LopHoc() {
    }

    public CaNhan getGiaoVienCN() {
        return giaoVienCN;
    }

    public void setGiaoVienCN(CaNhan giaoVienCN) {
        this.giaoVienCN = giaoVienCN;
    }
    
    public int themHocSinh(HocSinh hs){throw new UnsupportedOperationException("Not supported yet.");}
    public int themGiaoVienGD(GiaoVien gv){throw new UnsupportedOperationException("Not supported yet.");}
    public int inDSHS(){throw new UnsupportedOperationException("Not supported yet.");}
    public int inDSGVGD(){throw new UnsupportedOperationException("Not supported yet.");}
}
