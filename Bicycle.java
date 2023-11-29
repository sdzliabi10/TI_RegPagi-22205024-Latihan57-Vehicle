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
 */
public class Bicycle extends Vehicle {
    private int myGearCount;
    
    public Bicycle(){
    }
    public int getGearCount(){
        return myGearCount;
    }
    public void setGearCount(int gearCount){
        this.myGearCount = gearCount;
    }
}
