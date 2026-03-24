public abstract class Product {
    private int ID;
    private String title;
    private double price;

    public Product(int ID, String title, double price){
        this.ID = ID;
        this.title = title;
        this.price = price;
    }
    public abstract void (){}
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
