/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrador
 */
public class Passeio extends Veiculo implements Calcular {
    
    private int qtdPassageiros;
    
    public Passeio() {
        this.qtdPassageiros = 0;
    }
    
    public Passeio(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    /**
     * @return the qtdPassageiros
     */
    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    /**
     * @param qtdPassageiros the qtdPassageiros to set
     */
    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    @Override
    public float calcVel(float velocMax) {
        return velocMax * 1000;
    }

    @Override
    public int calcular() {
        return this.getQtdPassageiros() + super.getQtdRodas();
    }
    
}
