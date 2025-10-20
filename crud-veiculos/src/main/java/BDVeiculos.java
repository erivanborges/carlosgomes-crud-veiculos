
import java.util.List;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrador
 */
public class BDVeiculos {
    
    private List<Passeio> listaVeiculoPasseio;
    private List<Carga> listaVeiculoCarga;

    public BDVeiculos() {
        this.listaVeiculoPasseio = new ArrayList<Passeio>();
        this.listaVeiculoCarga = new ArrayList<Carga>();
    }
    
    public BDVeiculos(List<Passeio> listaVeiculoPasseio, List<Carga> listaVeiculoCarga) {
        this.listaVeiculoPasseio = listaVeiculoPasseio;
        this.listaVeiculoCarga = listaVeiculoCarga;
    }

     /**
     * @return the listaVeiculoPasseio
     */
    public List<Passeio> getListaVeiculoPasseio() {
        return listaVeiculoPasseio;
    }

    /**
     * @param listaVeiculoPasseio the listaVeiculoPasseio to set
     */
    public void setListaVeiculoPasseio(List<Passeio> listaVeiculoPasseio) {
        this.listaVeiculoPasseio = listaVeiculoPasseio;
    }

    /**
     * @return the listaVeiculoCarga
     */
    public List<Carga> getListaVeiculoCarga() {
        return listaVeiculoCarga;
    }

    /**
     * @param listaVeiculoCarga the listaVeiculoCarga to set
     */
    public void setListaVeiculoCarga(List<Carga> listaVeiculoCarga) {
        this.listaVeiculoCarga = listaVeiculoCarga;
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
        for (int i = 0; i < this.getListaVeiculoPasseio().size(); i++) {
            if (this.getListaVeiculoPasseio().get(i) != null) {
                if (this.getListaVeiculoPasseio().get(i).getPlaca().equalsIgnoreCase(passeio.getPlaca())) {
                    throw new VeicExistException();
                }
            }
        }
        return true;
    }
    
    public boolean verifCargaExist(Carga carga) throws VeicExistException {
        for (int i = 0; i < this.getListaVeiculoCarga().size(); i++) {
            if (this.getListaVeiculoCarga().get(i) != null) {
                if (this.getListaVeiculoCarga().get(i).getPlaca().equalsIgnoreCase(carga.getPlaca())) {
                    throw new VeicExistException();
                }
            }
        }
        return true;
    }
    
}
