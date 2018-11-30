/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transaksi;

/**
 *
 * @author Irham Rizady
 */
public class Item {
    private String name; // variabel untuk menyimpan nama item
    private float price; // variabel untuk menyimpan harga item
    private int qty; // variabel untuk menyimpan jumlah item
    
    // Konstruktor
    public Item() {}

    public Item(String name, float price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }
    // getter Name
    public String getName() {
        return name;
    }
    // setter Name
    public void setName(String name) {
        this.name = name;
    }
    // getter Price
    public float getPrice() {
        return price;
    }
    // setter Price
    public void setPrice(float price) {
        this.price = price;
    }
    // getter Qty
    public int getQty() {
        return qty;
    }
    // setter Qty
    public void setQty(int qty) {
        this.qty = qty;
    }
    // returns result item * qty
    public float getTotal(){
        return this.price * this.qty;
    }
    
    public String toString() {
        return this.name;
    }
}