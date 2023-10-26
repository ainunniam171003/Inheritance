/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasInheritance;

/**
 *
 * @author WINDOWS 10
 */
public class main {
    public static void main(String[] args) {
        Makanan makanan = new Makanan();
        
        makanan.berasa("Ayam");
        Ayam ayam = new Ayam();
        ayam.Rasa();
        
        makanan.berasa("Udang");
        Udang udang = new Udang();
        udang.Rasa();
        
        makanan.berasa("Lele");
        Lele lele = new Lele();
        lele.Rasa();
    }
}
