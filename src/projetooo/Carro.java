package projetooo;

/**
 * @author Jeferson
 */
public class Carro {
    //atributos == caracteristicas
    public String modelo;
    public String marca;
    public String cor;
    public int ano;
    public boolean completo;
    public String tipoCombustivel;
       
    //métodos == ações
    public void andar(){
        System.out.println("Carro andando");
    }
    public void buzinar(){
        System.out.println("Carro buzinando");
    }
    public void ligarFarol(){
        System.out.println("Carro com os farois ligado");
    }
    public void desligarFarol(){
        System.out.println("Carro com os farois desligado");
    }
    public void desligar(){
        System.out.println("Carro desligado!!");
    }
    public void ligar(){
        System.out.println("Carro Ligado");
    }
    public void mostrarCarro(){
        System.out.println("Modelo: "+modelo+" Marca: "+marca+" Cor: "+cor);
        System.out.println("Combustivel:"+ tipoCombustivel +" Ano:"+ano);
        if(completo){
            System.out.println("Carro Completinho");
        }else{
            System.out.println("Carro péladinho");
        }
    }
    
    
}
