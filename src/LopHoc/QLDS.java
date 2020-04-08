/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LopHoc;

import java.util.ArrayList;

public class QLDS implements IQLDS{
    ArrayList<CaNhan> ds;

    public QLDS() {
    }

    @Override
    public int them(CaNhan p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int xoa(CaNhan p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inDS() {
        ds.forEach((p) -> p.HienThiTT());
    }
}
