public class GardenItem extends Product{
    public GardenItem(int ID, String title, double price) {
        super(ID, title, price);
    }

    @Override
    public String toString() {
        return "GardenItem{}";
    }
}
