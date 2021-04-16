package orientacaoobjeto;

public class Cachorro {
    
    public Cachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }
    
    public Cachorro(){
        
    }
    
    String nome;
    String raca;
    int idade;
    
    public void Latir(String latir  ){      
        System.out.println("AUAUAUAUAU");   
    }
    
    public void Apresentar(){
        System.out.println(nome);
        System.out.println(raca);
        System.out.println(idade);
    }
}
