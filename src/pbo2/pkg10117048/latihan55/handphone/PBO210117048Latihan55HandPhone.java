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
public class PBO210117048Latihan55HandPhone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Android andro = new Android("Samsung","Android","Grand",3000000);
        andro.setKeyStore("234ibfd3840fo");
        andro.displayProduct();
        System.out.println("Android KeyStore : "+andro.getKeyStore());
        System.out.println("");
        
        BlackBerry bb = new BlackBerry("BlackB","RIM","Curve",2000000);
        bb.setPinBB("BHS249");
        bb.displayProduct();
        System.out.println("PIN : "+bb.getPinBB());
        System.out.println("");
        
        WindowsPhone wp = new WindowsPhone("Nokia","Win8","Lumia",3500000);
        wp.setWpKeyStore("UUUQIJWORJ");
        wp.displayProduct();
        System.out.println("Wp Key Store : "+wp.getWpKeyStore()); 
      
    }
   
}
