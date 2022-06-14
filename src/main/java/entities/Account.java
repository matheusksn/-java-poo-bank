package entities;

public class Account {

    public Account(String name, String cpf){
        this.name = name;
        this.cpf = cpf;
    }

    private String name;
    private final String cpf;
    private Double money = 0.0;

    public void deposit(Double value){
        if (value > 0){
            this.money += value;
            System.out.println("R$ " + value + " depositado com sucesso");
        } else {
            System.out.println("Valor inválido");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getMoney() {
        return money;
    }
}
