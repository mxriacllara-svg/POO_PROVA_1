package poo_prova_1;

public class Funcionario {
    
    private String nome;
    private String cpf;
    private Departamento departamento;
    private Cargo cargo;
    private double salario;
    private boolean ativo = true;


    public Funcionario(String nome, String cpf, Departamento departamento, Cargo cargo, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.departamento = departamento;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    public Funcionario() {
    }

    public void alterarDados(String nome, String cpf, Departamento departamento, Cargo cargo, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.departamento = departamento;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    public double aplicarReajuste(double percentual) {
        salario = salario + (salario * (percentual/100));
        return salario;
    }
    public void demitir(){
        ativo = false;
    }
    
    public String toString() {
        return "Funcionario: " + "\nnome=" + nome + "\ncpf=" + cpf + "\ndepartamento=" + departamento.getNome() + "\ncargo=" + cargo.getNome() + "\nsalario=" + salario + "\nativo=" + ativo;
    }

    public String toString2() {
        return "Funcionario: " + "\nnome=" + nome + "\ncpf=" + cpf + "\ndepartamento=" + departamento + "\ncargo=" + cargo + "\nsalario=" + salario + "\nativo=" + ativo;
    }
    
    
}
