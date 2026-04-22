public class Customer implements Financable {
    private String name;
    private String surname;
    private double balance;

    public Customer(String name, String surname) {
        this.name = name;
        this.surname = surname;
        balance = 1500;
    }

    @Override
    public double checkBalance(){
        return balance;
    }

    @Override
    public boolean HasEnoughMoney() {
        return false;
    }

    @Override
    public String getFinanceStatus() {
        return "";
    }
}
