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
            
            try {
                opcao = Integer.parseInt(leitura.entDados("\n\t Escolha uma opção"));
            } catch (NumberFormatException e) {
                System.out.println("Deve ser um número inteiro - Press <ENTER>");
                leitura.entDados(" ");
            }
            
            switch (opcao) {
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
    
}
