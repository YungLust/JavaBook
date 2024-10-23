package Realtor;

public class BuildingEstate {
    private int id;
    private float price;
    private float area;


    public BuildingEstate(int id, float price, float area) {
        this.id = id;
        this.price = price;
        this.area = area;
    }

    protected boolean isOnSale(){
        if (id % 3 == 0) {
            return true;
        }
        else{
            return false;
        }
    }

    public int getId() {
        return id;
    }

    public float getPrice() {
        return price;
    }

    public float getArea() {
        return area;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
