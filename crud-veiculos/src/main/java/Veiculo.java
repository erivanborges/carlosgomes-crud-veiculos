/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrador
 */
public abstract class Veiculo {
    
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private float velocMax;
    private int qtdRodas;
    private Motor motor;
    
    public Veiculo() {
        this.placa = "";
        this.marca = "";
        this.modelo = "";
        this.cor = "";
        this.velocMax = 0f;
        this.qtdRodas = 0;
        this.motor = new Motor();
    }
    
    public Veiculo(String placa, String marca, String modelo,
                    String cor, float velocMax, int qtdRodas,
                        Motor motor) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.velocMax = velocMax;
        this.qtdRodas = qtdRodas;
        this.motor = motor;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the velocMax
     */
    public float getVelocMax() {
        return velocMax;
    }

    /**
     * @param velocMax the velocMax to set
     */
    public void setVelocMax(float velocMax) {
        this.velocMax = velocMax;
    }

    /**
     * @return the qtdRodas
     */
    public int getQtdRodas() {
        return qtdRodas;
    }

    /**
     * @param qtdRodas the qtdRodas to set
     */
    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    /**
     * @return the motor
     */
    public Motor getMotor() {
        return motor;
    }

    /**
     * @param motor the motor to set
     */
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    
    public abstract float calcVel(float velocMax);
    
}
