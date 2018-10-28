/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117048.latihan55.handphone;

/**
 *
 * @author 
 * Nama : Rizal Arif Nugraha 
 * Nim : 10117048 
 * Kelas : PBO2 
 * Deskripsi Program : Program ini berisi tentang menampilkan jenis-jenis dan 
 *                     type handphone.
 */
public class BlackBerry extends HandPhone {

    private String pinBB;

    public BlackBerry(String man, String os, String model, int harga) {
        super(man, os, model, harga);
        this.manufacture = man;
        this.operatingSystem = os;
        this.model = model;
        this.harga = harga;

    }

    public String getPinBB() {
        return pinBB;
    }

    public void setPinBB(String pinBB) {
        this.pinBB = pinBB;
    }

}
