/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetooo;

import java.util.Scanner;

/**
 *
 * @author Jeferson
 */
public class Conta {
    //atributos
    public String nome;
    public String numConta;
    public String agencia;
    public String banco;
    public double saldo;
    //construtor
    public Conta(){
        this.nome = "Joaquim Pereira";
        this.numConta = "123-12";
        this.agencia = "149";
        this.banco = "NuBanco";
        this.saldo = 50.00;
        
       
    }
    
    public void mostrarConta(){
        System.out.println("========================================");
        System.out.println("Nome: "+nome);
        System.out.println("Num. Conta: "+numConta);
        System.out.println("Agência: "+agencia);
        System.out.println("Banco: "+banco);
        System.out.println("Saldo R$: "+saldo);
        System.out.println("========================================");
    }
    
    public void cadastrarConta(){
        Scanner ler = new Scanner(System.in);
        System.out.println("CADASTRO DE NOVA CONTA");
        System.out.println("========================================");
        System.out.println("Informe o seu nome");
        this.nome = ler.nextLine();
         System.out.println("Informe o nº da conta:");
        this.numConta = ler.nextLine();
         System.out.println("Informe o nº da agência");
        this.agencia = ler.nextLine();
         System.out.println("Informe o nome do banco");
        this.banco = ler.nextLine();
         System.out.println("Informe o saldo inicial");
        this.saldo = ler.nextDouble();
        while(this.saldo<50){
            
            System.out.println("Sr. Depositar um valor maior que R$50,00..");
            System.out.println("Informe o saldo inicial:");
            this.saldo = ler.nextDouble();
        }
     mostrarConta();
    }
    public void depositar(double valor){
        if(valor<=0){
            System.out.println("Malandro!! deposite um valor superior a zero!!");
        }else{
        this.saldo = this.saldo + valor;//acumulador
        emitirSaldo();
        }
    }
    public void sacar(double valor){
        if(valor>this.saldo){
            System.out.println("Sem Saldo!!! ");
            emitirSaldo();
        }else{
        this.saldo = this.saldo - valor; 
        emitirSaldo();
        }
    }
    public void emitirSaldo(){
        System.out.println("Saldo em conta R$"+this.saldo);
    }
    
}
