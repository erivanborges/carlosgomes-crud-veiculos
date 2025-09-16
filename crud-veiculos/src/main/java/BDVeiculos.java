/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrador
 */
public class BDVeiculos {
    
    private Passeio[] vetVeiculoPasseio;
    private Carga[] vetVeiculoCarga;

    public BDVeiculos() {
        this.vetVeiculoPasseio = new Passeio[5];
        this.vetVeiculoCarga = new Carga[5];
    }
    
    public BDVeiculos(Passeio[] vetVeiculoPasseio, Carga[] vetVeiculoCarga) {
        this.vetVeiculoPasseio = vetVeiculoPasseio;
        this.vetVeiculoCarga = vetVeiculoCarga;
    }

    /**
     * @return the vetVeiculoPasseio
     */
    public Passeio[] getVetVeiculoPasseio() {
        return vetVeiculoPasseio;
    }

    /**
     * @param aVetVeiculoPasseio the vetVeiculoPasseio to set
     */
    public void setVetVeiculoPasseio(Passeio[] aVetVeiculoPasseio) {
        vetVeiculoPasseio = aVetVeiculoPasseio;
    }

    /**
     * @return the vetVeiculoCarga
     */
    public Carga[] getVetVeiculoCarga() {
        return vetVeiculoCarga;
    }

    /**
     * @param aVetVeiculoCarga the vetVeiculoCarga to set
     */
    public void setVetVeiculoCarga(Carga[] aVetVeiculoCarga) {
        vetVeiculoCarga = aVetVeiculoCarga;
    }
    
    public int achaVagoPasseio() {
        for (int i = 0; i < vetVeiculoPasseio.length; i++) {
            if (vetVeiculoPasseio[i] == null) {
                return i;
            }
        }
        return -1;
    }
    
    public int achaVagoCarga() {
        for (int i = 0; i < vetVeiculoCarga.length; i++) {
            if (vetVeiculoCarga[i] == null) {
                return i;
            }
        }
        return -1;
    }
    
    public void imprimeVeiculoPasseio(Passeio veiculoPasseio, int i) {
        System.out.println("\nO veículo de PASSEIO armazenado no endereço.......:" + i +" (vetor do vetVeiculoPasseio)");
        System.out.println("Cor......................: " + veiculoPasseio.getCor());
        System.out.println("Marca....................: " + veiculoPasseio.getMarca());
        System.out.println("Placa....................: " + veiculoPasseio.getPlaca());
        System.out.println("Qtdade de rodas..........: " + veiculoPasseio.getQtdRodas());
        System.out.println("Veloc. Máx...............: " + veiculoPasseio.getVelocMax());
        System.out.println("Qtdade de passageiros....: " + veiculoPasseio.getQtdPassageiros());
        System.out.println("Potência do motor........: " + veiculoPasseio.getMotor().getPotencia());
        System.out.println("Qtdade de pistão.........: " + veiculoPasseio.getMotor().getQtdPist());
        System.out.println("Qtdade passag. + qtdade rodas...: " + veiculoPasseio.calcular());  
    }
    
    public void imprimeVeiculoCarga(Carga veiculoCarga, int i) {
        System.out.println("\nO veículo de CARGA armazenado no endereço.......:" + i +" (vetor do vetVeiculoPasseio)");
        System.out.println("Cor......................: " + veiculoCarga.getCor());
        System.out.println("Marca....................: " + veiculoCarga.getMarca());
        System.out.println("Placa....................: " + veiculoCarga.getPlaca());
        System.out.println("Qtdade de rodas..........: " + veiculoCarga.getQtdRodas());
        System.out.println("Veloc. Máx...............: " + veiculoCarga.getVelocMax());
        System.out.println("Carga Máx....: " + veiculoCarga.getCargaMax());
        System.out.println("Tara....: " + veiculoCarga.getTara());
        System.out.println("Potência do motor........: " + veiculoCarga.getMotor().getPotencia());
        System.out.println("Qtdade de pistão.........: " + veiculoCarga.getMotor().getQtdPist());
        System.out.println("Tara * Carga Máx...: " + veiculoCarga.calcular());  
    }
    
    public boolean verifPasseioExist(Passeio passeio) throws VeicExistException {
        for (int i = 0; i < this.getVetVeiculoPasseio().length; i++) {
            if (this.getVetVeiculoPasseio()[i] != null) {
                if (this.getVetVeiculoPasseio()[1].getPlaca().equalsIgnoreCase(passeio.getPlaca())) {
                    throw new VeicExistException();
                }
            }
        }
        return true;
    }
    
    public boolean verifCargaExist(Carga carga) throws VeicExistException {
        for (int i = 0; i < this.getVetVeiculoCarga().length; i++) {
            if (this.getVetVeiculoCarga()[i] != null) {
                if (this.getVetVeiculoCarga()[i].getPlaca().equalsIgnoreCase(carga.getPlaca())) {
                    throw new VeicExistException();
                }
            }
        }
        return true;
    }
    
}
