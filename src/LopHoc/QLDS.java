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
        ds = new  ArrayList<>();
    }

    @Override
    public int them(CaNhan p) {
        int l = ds.size();
        ds.add(p);
        if (ds.size()==(l+1)) {
            return 0; //no error
        } else {
            return 1; //error
        }
    }
    
    @Override
    public int xoa(String ten) {
        int l = ds.size();
        int i=0;
        while (i<l && (!ds.get(i).getHoTen().equals(ten))) {         
            i++;
        }
        if(i<l){
            ds.remove(ds.get(i));
            return 0;
        }
        else {
            return 1;
        }
    }

    @Override
    public void inDS() {
        ds.forEach((CaNhan p) -> {
            System.out.println(p.HienThiTT());
        });
    }
}
