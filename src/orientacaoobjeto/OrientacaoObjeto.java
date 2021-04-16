package orientacaoobjeto;

public class OrientacaoObjeto {

    public static void main(String[] args) {
      
        Funcionario f1 = new Funcionario("Gustavo", "Educação", 15000, "14n123m", "12/01/2012");
          
        System.out.println(f1.getNome());
        System.out.println(f1.getDepartamento());
        System.out.println(f1.getSalario());
        System.out.println(f1.getRG());
        System.out.println(f1.getDataEntrada());
        
        f1.setNome("Gustavo Roberto");
        
        System.out.println(f1.getNome());
        
        f1.recebeAumento(1000);
        f1.calculaGanhoAnual();

    }
    
}
