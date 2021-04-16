package orientacaoobjeto;

public class Funcionario {

    public Funcionario(String nome, String departamento, double salario, String dataEntrada, String RG) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.dataEntrada = dataEntrada;
        this.RG = RG;
    }

    private String nome;
    private String departamento;
    private double salario;
    private String dataEntrada;
    private String RG;
    
    public void recebeAumento(double aumento){
        this.salario = this.salario + aumento;
        System.out.println(this.salario);
    }
    
    public void calculaGanhoAnual(){
        double ganhoAnual = this.salario * 12;
        System.out.println(ganhoAnual);
    }
    
    
    public String getNome() {
        return this.nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getSalario() {
        return salario;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public String getRG() {
        return RG;
    }
    
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
}
