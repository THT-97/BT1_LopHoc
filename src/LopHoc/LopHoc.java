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
        qldsGVGD = new QLDS();
        qldsHS = new QLDS();
    }

    public CaNhan getGiaoVienCN() {
        return giaoVienCN;
    }

    public void setGiaoVienCN(CaNhan giaoVienCN) {
        this.giaoVienCN = giaoVienCN;
    }
    
    public int themHocSinh(HocSinh hs){
        return qldsHS.them(hs);
    }
    public int themGiaoVienGD(GiaoVien gv){
       return qldsGVGD.them(gv);
    }
    public int inDSHS(){
        qldsHS.inDS();
        return 0;
    }
    public int inDSGVGD(){
        
        qldsGVGD.inDS();
        return 0;
    }
}
