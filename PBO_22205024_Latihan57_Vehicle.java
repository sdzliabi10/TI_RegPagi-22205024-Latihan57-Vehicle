/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspert11_Latihan57_vehicle;


/**
 *
 * @author Administrator
 * Nama : Sofiullah Abi Sadzili
 * Nim  : 22205024
 * Prodi: Teknik Informatika
 * Deskripsi : Program ini berisi tentang vehicle berupa bicycle dan skateboard.
 *                      
 */
public class PBO_22205024_Latihan57_Vehicle {
    public static void main(String[] args){
        Bicycle bycl = new Bicycle();
        bycl.setBrand("Trek Bike");
        bycl.setModel("7.4FX");
        bycl.setGearCount(23);
        
        System.out.println("Bicycle");
        System.out.println("Brand : " + bycl.getBrand());
        System.out.println("Model : " + bycl.getModel());
        System.out.println("Jumlah Gear : " + bycl.getGearCount());
        System.out.println("");
        
        Skateboard sktbrd = new Skateboard();
        sktbrd.setBrand("Ally Skate");
        sktbrd.setModel("Rocket");
        sktbrd.setBoardLength(54.5);
        
        System.out.println("Skateboard");
        System.out.println("Brand : " + sktbrd.getBrand());
        System.out.println("Model : " + sktbrd.getModel());
        System.out.println("Panjangnya Board : " + sktbrd.getBoardLength());
    }
}
