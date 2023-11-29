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
public class Vehicle {
    private String myBrand;
    private String myModel;
    
    public Vehicle(){
    }
    public String getBrand(){
        return myBrand;
    }
    public void setBrand(String brand){
        this.myBrand = brand;
    }
    public String getModel(){
        return myModel;
    }
    public void setModel(String model){
        this.myModel = model;
    }
}
