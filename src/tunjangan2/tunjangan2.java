/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunjangan2;

/**
 *
 * @author asus
 */
public class tunjangan2 {
       public String status;
        public int gajipokok;
        
        public double hitungTunjangan(){
            if ("Menikah".equals(status)){
                return 0.35 * gajipokok;
            }else{
                return 0;
            }
        }
        public double hitungGaji(){
            return gajipokok + hitungTunjangan();
            
        }
        public void tampilHasilHitung(){
           System.out.println("============ Hasil Perhitungan gajih Anda ============ ");
          System.out.println("Gaji Poko  :Rp. "+gajipokok);
          System.out.println("Tunjangan  :Rp. "+hitungTunjangan ());
          System.out.println("Total Gaji :Rp. "+hitungGaji());
        }
        
}
