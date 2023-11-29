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
public class Skateboard extends Vehicle{
    private double myBoardLength;
    
    public Skateboard(){}
    
    public double getBoardLength(){
        return myBoardLength;
    }
    public void setBoardLength(double boardLength){
        this.myBoardLength = boardLength;
    }
}
