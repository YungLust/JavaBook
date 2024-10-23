package Realtor;

public class Studio extends BuildingEstate{
    public Studio(int id, float price, float area) {
        super(id, price, area);
    }

    @Override
    protected boolean isOnSale(){
        int id = super.getId();
        if (id % 5 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public float getPrice(){
        float price = super.getPrice();
        if (isOnSale()){
            float discount = price/10; //10%
            return price-discount;
        }
        else{
            return price;
        }
    }
}
