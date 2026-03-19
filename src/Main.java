public class Main {
    public static void main(String[] args) {
        Category product1 = new Category(1, "baton", 80.99);
        System.out.println(product1.getID() + " " + product1.getTitle() + " " + product1.getPrice());
    }
}