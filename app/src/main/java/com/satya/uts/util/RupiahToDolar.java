package com.satya.uts.util;

public class RupiahToDolar {

    private double rupiah;
    private  double index;


    public RupiahToDolar (double rupiah){
        this.rupiah = rupiah;
        this.index = hitung();
    }

    public  double getIndex(){
        return index;
    }
    private double hitung(){
        return (rupiah * 0.000071) ;
    }

}
