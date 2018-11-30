/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transaksi;

import java.util.HashMap;
import java.util.ArrayList;
/**
 *
 * @author Irham Rizady
 */
public class TrxComboModel {
    private HashMap<String, Float> items = new HashMap<>();
    
    public TrxComboModel(){
        this.items.put("Gula", new Float(15000));
        this.items.put("Kopi", new Float(10000));
        this.items.put("Susu", new Float(5000));
        this.items.put("Tepung", new Float(7000));
    }
    public ArrayList<String> getNames(){
        ArrayList<String> str = new ArrayList<>();
        for (String item : this.items.keySet()) {
            str.add(item);
        }
        return str;
    }
    public ArrayList<Float> getPrices(){
        ArrayList<Float> flt = new ArrayList<>();
        for (Float item : this.items.values()) {
            flt.add(item);
        }
        return flt;
    }
    public void addItem(String name, float price){
        this.items.put(name, price);
    }
}