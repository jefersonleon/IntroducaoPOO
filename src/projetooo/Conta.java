/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetooo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Jeferson
 */
public class Conta {

    //atributos - caracteristica
    public String nome;
    public String numConta;
    public String agencia;
    public String banco;
    public double saldo;
    public boolean ativo;
    public String data;
    public String hora;

    //construtor
    public Conta() {
        this.nome = "Joaquim Pereira";
        this.numConta = "123-12";
        this.agencia = "149";
        this.banco = "NuBanco";
        this.saldo = 50.00;
        this.data = fd.format(agora);
        this.hora = fh.format(agora);
        this.ativo = true;

    }
    //O comandos abaixo servem: o primeiro para capturar do sistema a data e o segundo serve para formatar
    LocalDateTime agora = LocalDateTime.now();
    DateTimeFormatter fd = DateTimeFormatter.ofPattern("dd/MM/uuuu");
    DateTimeFormatter fh = DateTimeFormatter.ofPattern("HH:mm:ss");
    int dep = 0;
    int sac = 0;

    public void mostrarConta() {
        criarCabecalho();
        System.out.println("Nome: " + nome);
        System.out.println("Num. Conta: " + numConta);
        System.out.println("Agência: " + agencia);
        System.out.println("Banco: " + banco);
        System.out.println("Saldo R$: " + saldo);
        System.out.println("Data Cadastro: " + data);
        System.out.println("Hora Cadastro:" + hora);
        if (ativo) {
            System.out.println("Cliente Ativo");
        } else {
            System.out.println("Cliente Inativo");
        }
        System.out.println("========================================");
    }

    public void cadastrarConta() {
        Scanner ler = new Scanner(System.in);
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter fd = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        DateTimeFormatter fh = DateTimeFormatter.ofPattern("HH:mm:ss");
        criarCabecalho();
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

        while (this.saldo < 50) {
            criarCabecalho();
            System.out.println("Sr. Depositar um valor maior que R$50,00..");
            System.out.println("Informe o saldo inicial:");
            this.saldo = ler.nextDouble();
        }
        this.data = fd.format(agora);
        this.hora = fh.format(agora);
        mostrarConta();
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            criarCabecalho();
            System.out.println("Malandro!! deposite um valor superior a zero!!");
            System.out.println("==============================================");
        } else {
            dep++;
            LocalDateTime agora = LocalDateTime.now();
            this.data = fd.format(agora);
            this.hora = fh.format(agora);
            System.out.println("Depositado!");
            criarCabecalho();
            this.saldo = this.saldo + valor;//acumulador
            extrato = extrato + "\nDeposito em: " + fd.format(agora) + " - " + fh.format(agora) + " R$ " + valor + "\n";
            emitirSaldo();
        }
    }

    public void sacar(double valor) {
        if (valor > this.saldo) {
            criarCabecalho();
            System.out.println("Sem Saldo!!! ");
            System.out.println("========================================");
            emitirSaldo();
        } else {
            sac++;
            criarCabecalho();
            this.saldo = this.saldo - valor;
            valorExtrato = valor;
            emitirSaldo();
        }
    }

    public void emitirSaldo() {
        criarCabecalho();
        System.out.println("Saldo em conta R$" + this.saldo);
        System.out.println("========================================");
    }

    public void criarCabecalho() {
        System.out.println("========================================");
        System.out.println("          BANCO DO POBRELIGTH");
        System.out.println("========================================");
    }
    double valorExtrato = 0;
    String extrato;

    public void emitirExtrato() {
        criarCabecalho();
        System.out.println("           E X T R A T O \n========================================\n  Data:" + fd.format(agora) + " - Hora:" + fh.format(agora)
                + "\n Nome:" + nome
                + "\n Agencia:" + agencia + " - Conta:" + numConta);

        if (dep > 0 || sac > 0) {
            extrato = extrato;
        }
        System.out.println(extrato);
        System.out.println("\n=====================================\nTotal em conta: R$" + this.saldo);

    }
}
