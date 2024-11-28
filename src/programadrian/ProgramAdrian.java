/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package programadrian;

/**
 *
 * @author Admin
 */
public class ProgramAdrian {
    private int Energi;
    private int Air;
    private int Limbah;
    private String rekomendasi;
    
    
    public ProgramAdrian(int Energi, int Air, int Limbah, String rekomendasi){
        this.Energi = Energi;
        this.Air = Air;
        this.Limbah = Limbah;
        this.rekomendasi = rekomendasi;
    }
    
    public int getEnergi(){
        return Energi;
    }
    
    public int getAir(){
        return Air;
    }
    
    public int getLimbah(){
        return Limbah;
    }
    
    public void setrekomendasi(String rekomendasi){
        this.rekomendasi = rekomendasi;
    }
    
}
