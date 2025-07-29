/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrador
 */
public class Carga extends Veiculo implements Calcular {
    
    private int cargaMax;
    private int tara;
    
    public Carga() {
        this.cargaMax = 0;
        this.tara = 0;
    }
    
    public Carga(int cargaMax, int tara) {
        this.cargaMax = cargaMax;
        this.tara = tara;
    }

    /**
     * @return the cargaMax
     */
    public int getCargaMax() {
        return cargaMax;
    }

    /**
     * @param cargaMax the cargaMax to set
     */
    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    /**
     * @return the tara
     */
    public int getTara() {
        return tara;
    }

    /**
     * @param tara the tara to set
     */
    public void setTara(int tara) {
        this.tara = tara;
    }

    @Override
    public float calcVel(float velocMax) {
        return velocMax * 100000;
    }

    @Override
    public int calcular() {
        return this.getTara() * this.getCargaMax();
    }
    
}
