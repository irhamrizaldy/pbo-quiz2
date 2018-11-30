/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transaksi;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Irham Rizady
 */
public class TrxTableModel extends DefaultTableModel{
    private String[] columns; // variabel String array kolom untuk menyimpan nama kolom
    
    // Konstruktor
    public TrxTableModel(){
        this.columns = new String[]{
            "Nama", "Harga", "Jumlah"
        };
    }
    // getter Nama Kolom
    public String[] getColumnName(){
        return this.columns;
    }
}
