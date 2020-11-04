/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119060.latihan35.tunjangan2;
import java.util.Scanner;
import tunjangan2.tunjangan2;
/**
 *
 @author Megianto Adi saputra
 * Nama         : Megianto Adi Saputra
 * Kelas        : IF-2
 * NIM          : 10119060
 * Deskripsi    : Program Tunjangan
 */
public class PBOIF210119060Latihan35Tunjangan2 {
     
        
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        tunjangan2 tunj = new tunjangan2();
          System.out.println("================= Program Tunjangan =================== ");
         System.out.print("Berapa gaji Pokok anda perbulan? : Rp.");
         tunj.gajipokok =input.nextInt();
         
         System.out.print("Status Anda ? (menikah/belum)    :");
         tunj.status = input.next();
         
         tunj.tampilHasilHitung();
        
    }
    
}
