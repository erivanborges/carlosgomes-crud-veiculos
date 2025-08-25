/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrador
 */
public class Teste {
    
    private static Leitura leitura = new Leitura();
        
    private static Passeio veiculoPasseio;
    private static Carga veiculoCarga;
    
    private static Passeio[] vetVeiculoPasseio = new Passeio[5];
    private static Carga[] vetVeiculoCarga = new Carga[5];
    
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("####### ATENÇÃO #######");
        System.out.println("");
        
        boolean continuar = true;
        int opcao = 0;
        
        while (continuar) {
            System.out.println("\n\t\t\t MENU INICIAL");
            System.out.println("\n\t (1) Cadastrar veículo de PASSEIO");
            System.out.println("\n\t (2) Cadastrar veículo de CARGA");
            System.out.println("\n\t (3) Imprimir todos os veículos de PASSEIO");
            System.out.println("\n\t (4) Imprimir todos os veíclos de CARGA");
            System.out.println("\n\t (5) Imprimir o veículo de PASSEIO pela placa");
            System.out.println("\n\t (6) Imprimir o veículo de CARGA pela placa");
            System.out.println("\n\t (7) Sair do Sistema");
            
            //try {
                opcao = Integer.parseInt(leitura.entDados("\n\t Escolha uma opção"));
            //} catch (NumberFormatException e) {
            //    System.out.println("Deve ser um número inteiro - Press <ENTER>");
            //    leitura.entDados(" ");
            //}
            
            switch (opcao) {
                case 1:
                    for (int i = achaVagoPasseio(); i < vetVeiculoPasseio.length; i++) {
                        if (i == -1) {
                            leitura.entDados("\nVetor de PASSEIO está cheio! press <ENTER>");
                            break;
                        }
                        
                        veiculoPasseio = new Passeio();
                        vetVeiculoPasseio[i] = cadastraVeiculoPasseio(veiculoPasseio);
                        
                        leitura.entDados("\nVeículo de PASSEIO armazenado na posição " 
                                + i + " do vetor - press <ENTER>");
                        
                        String respPasseio = leitura.entDados("\nDeseja cadastrar outro "
                                + "veículo de PASSEIO? <s/n>");
                        
                        if (respPasseio.equalsIgnoreCase("n")) {
                            break;
                        }
                        
                        if (achaVagoPasseio() == -1) {
                            leitura.entDados("\nVetor de PASSEIO está cheio! press <ENTER>");
                            break;
                        }
                    }
                    break;
                    
                case 2:
                    for (int i = achaVagoCarga(); i < vetVeiculoCarga.length; i++) {
                        if (i == -1) {
                            leitura.entDados("\nVetor de CARGA está cheio! press <ENTER>");
                            break;
                        }
                        
                        veiculoCarga = new Carga();
                        vetVeiculoCarga[i] = cadastraVeiculoCarga(veiculoCarga); 
                        
                        leitura.entDados("\nVeículo de CARGA armazenado na posição " 
                                + i + " do vetor - press <ENTER>");
                        
                        String respCarga = leitura.entDados("\nDeseja cadastrar outro "
                                + "veículo de CARGA? <s/n>");
                        
                        if (respCarga.equalsIgnoreCase("n")) {
                            break;
                        }
                        
                        if (achaVagoCarga() == -1) {
                            leitura.entDados("\nVetor de CARGA está cheio! press <ENTER>");
                            break;
                        }
                    }
                    break;
                    
                case 7:
                    continuar = false;  
                    break;
                default:
                    leitura.entDados("\n O valor deve ser maior ou igual a 1 e menor ou igual a 7"
                            + " press <ENTER...>");
                    break;
            }
        }
    }
    
    public static int achaVagoPasseio() {
        for (int i = 0; i < vetVeiculoPasseio.length; i++) {
            if (vetVeiculoPasseio[i] == null) {
                return i;
            }
        }
        return -1;
    }
    
    public static int achaVagoCarga() {
        for (int i = 0; i < vetVeiculoCarga.length; i++) {
            if (vetVeiculoCarga[i] == null) {
                return i;
            }
        }
        return -1;
    }
    
    public static Passeio cadastraVeiculoPasseio(Passeio passeio) {
        System.out.println("\n=================================");
        System.out.println("Cadastro de veículo de PASSEIO");
        System.out.println("==================================");
        passeio.setCor(leitura.entDados("Cor.............:"));
        passeio.setMarca(leitura.entDados("Marca.........:"));
        passeio.setModelo(leitura.entDados("Modelo.......:"));
        passeio.setPlaca(leitura.entDados("Placa.........:"));
        passeio.setQtdRodas(Integer.parseInt(leitura.entDados("Qtdade de rodas.........:")));
        passeio.setVelocMax(Float.parseFloat(leitura.entDados("Veloc. Máxima..........:")));
        passeio.setQtdPassageiros(Integer.parseInt(leitura.entDados("Qtdade de passageiros.........:")));
        passeio.getMotor().setPotencia(Integer.parseInt(leitura.entDados("Potência do motor........:")));
        passeio.getMotor().setQtdPist(Integer.parseInt(leitura.entDados("Qtdade de pistão...........:")));
        return passeio;
    }
    
    public static Carga cadastraVeiculoCarga(Carga carga) {
        System.out.println("===================================");
        System.out.println("Cadastro de veículos de CARGA");
        System.out.println("===================================");
        carga.setCor(leitura.entDados("Cor.............:"));
        carga.setMarca(leitura.entDados("Marca.........:"));
        carga.setModelo(leitura.entDados("Modelo.......:"));
        carga.setPlaca(leitura.entDados("Placa.........:"));
        carga.setQtdRodas(Integer.parseInt(leitura.entDados("Qtdade de rodas.........:")));
        carga.setVelocMax(Float.parseFloat(leitura.entDados("Veloc. Máx.........:")));
        carga.setCargaMax(Integer.parseInt(leitura.entDados("Carga Máx.........:")));
        carga.setTara(Integer.parseInt(leitura.entDados("Tara.........:")));
        carga.getMotor().setPotencia(Integer.parseInt(leitura.entDados("Potência do motor.........:")));
        carga.getMotor().setQtdPist(Integer.parseInt(leitura.entDados("Qtdade de pistão...........:")));
        return carga;
    }
}
