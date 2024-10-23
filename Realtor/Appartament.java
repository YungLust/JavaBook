package Realtor;

public class Appartament extends BuildingEstate {
    public Appartament(int id, float price, float area) {
        super(id, price, area);
    }

    @Override
    public float getPrice (){
        float price = super.getPrice();
        if (super.isOnSale()){
            float discount = price/10; //10%
            return (price-discount);
        }
        else{
            return price;
        }
    }
}
