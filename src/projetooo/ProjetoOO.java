package projetooo;

import java.util.Scanner;

/**
 *
 * @author Jeferson
 */
public class ProjetoOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta objConta = new Conta();
        objConta.mostrarConta();
        objConta.cadastrarConta();
        Scanner ler = new Scanner(System.in);
        System.out.println("Quanto deseja depositar?");
        objConta.depositar(ler.nextDouble());
        System.out.println("Quanto deseja Sacar?");
        objConta.sacar(ler.nextDouble());
        

    }

}
