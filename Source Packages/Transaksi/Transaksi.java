/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transaksi;

import java.util.*;
/**
 *
 * @author Irham Rizady
 */

public class Transaksi{
    private final String code; // variabel untuk menyimpan kode transaksi
    private ArrayList<Item> items = new ArrayList<>(); // variabel item untuk menyimpan item
    private float total; // variabel total
    
    // Konstruktor
    public Transaksi(String code, ArrayList<Item> items) {
        this.code = code;
        this.items = items;
    }
    
    // Total Setter
    public void setTotal(){
        float total = 0;
        for (Item item : this.items) {
            total += item.getTotal();
        }
        this.total = total;
    }
    
    //Output Transaksi
    public String prtDetail(){
        setTotal();
        String str = "";
        str += "Kode\t\t: "+ this.code +"\n";
        str += "Daftar Belanja : \n";
        for(Item item : this.items){
            str += "\t"+ item.getName() +"(x"+ item.getQty() +") : "+ item.getTotal() +"\n";
        }
        str += "Total\t\t: "+this.total;
        return str;
    }
}