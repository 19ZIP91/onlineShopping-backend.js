public abstract class Product {
    private int ID;
    private String title;
    private double price;

    private void preincrement(){
        ++ID;
    }

    public Product(String title, double price){
        preincrement();
        this.title = title;
        this.price = price;
    }

    public int getID(){
        return this.ID;
    }

    public void setID(int ID){
        this.ID = ID;
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;
    }
}
