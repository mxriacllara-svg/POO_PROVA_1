package poo_prova_1;

public class TesteSistema {

    public static void main(String[] args) {
        Departamento departamento = new Departamento("Compras");
        Departamento departamento2 = new Departamento("Vendas");
        Cargo Comprador = new Cargo("Comprador");
        Cargo Vendedor = new Cargo("Vendedor");
        Funcionario F1 = new Funcionario("Maria", "111.222.333-44",departamento2,Vendedor, 1621.00);
        Funcionario F2 = new Funcionario("Pietro", "999.888.777-66", departamento, Comprador,3000.00);
        Funcionario F3 = new Funcionario();
        
        
        System.out.println(F1.toString());
        System.out.println("\n"+F2.toString());
        System.out.println("\n"+F3.toString2());
        
        F3.alterarDados("Joao", "222.333.444-55", departamento2, Comprador, 2000.00);
        System.out.println("\n" + F3.toString2());
        
        F1.aplicarReajuste(15);
        System.out.println("\n"+F1.toString());
        
        F3.demitir();
        System.out.println("\n"+F1.toString());
        System.out.println("\n"+F2.toString());
        System.out.println("\n"+F3.toString2());
        
        
    }    

}
