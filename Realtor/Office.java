package Realtor;

public class Office extends BuildingEstate{
    public Office(int id, float price, float area) {
        super(id, price, area);
    }

    @Override
    public float getPrice(){
        float price = super.getPrice();
        if (super.isOnSale()){
            float discount = price / 20; //5%
            return price - discount;
        }
        else{
            return price;
        }
    }
}
