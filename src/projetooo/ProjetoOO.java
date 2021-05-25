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
        Scanner ler = new Scanner(System.in);
        int op;
        op = 1;
        while(op != 0 ){
            System.out.println("BANCO VAI COM DEUS");
            System.out.println("1 - Cadastro");
            System.out.println("2 - Exibir Conta");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Emitir Saldo");
            System.out.println("0 - Sair");
            op = ler.nextInt();
            if(op==1){
                objConta.cadastrarConta();
            }else if(op==2){
                objConta.mostrarConta();
            }else if(op==3){
                System.out.println("Qual o valor do Deposito?");
                objConta.depositar(ler.nextDouble());
            }else if(op==4){
                System.out.println("Qual o valor do Saque?");
                objConta.sacar(ler.nextDouble());
            }else if(op==5){
                objConta.emitirSaldo();
            }else if(op==0){
                System.out.println("Obrigado pelo uso!!");
            }else{
                System.out.println("Opção inválida!!");
            }
                    
            
            
            
        }
        

    }

}
