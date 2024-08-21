package site;
public class AlexTaxi {
    private double calc_price;
    private double standart_price = 0.5 ;
    private double comfort_price = 0.55;
    private double business_price = 0.7;
    private double minivan_price = 0.7;

    //methods to display different tarifs` price 
    public void calc_standart(double distance){
        calc_price = distance * standart_price;
        System.out.printf("standart:%d \n", roundPrice(calc_price));
    }
    public void calc_comfort(double distance){
        calc_price = distance * comfort_price;
        System.out.printf("comfort:%d \n", roundPrice(calc_price));
    }
    public void calc_business(double distance){
        calc_price = distance * business_price;
        System.out.printf("business:%d \n", roundPrice(calc_price));
    }
    public void calc_minivan(double distance){
        calc_price = distance * minivan_price;
        System.out.printf("minivan:%d \n", roundPrice(calc_price));
    }

    //method to get rounded price
    private int roundPrice(double price){
        //get rid of float
        System.out.println(price);
        int rounded_price = (int) Math.ceil(price);

        // Get the last digit
        int thirdDigit = (rounded_price % 10) / 1;

        // If the last digit is in range from 1 to 5
        if (thirdDigit >= 1 && thirdDigit < 5 ) {
            //round the last digit to 5
            rounded_price = (rounded_price / 10) * 10 + 5;

        // If the last digit is in range from 5 to 10 
        } else if (thirdDigit >= 5 && thirdDigit < 10) {
            // Round up to the next digit
            rounded_price = ((rounded_price / 10) + 1) * 10;
        }
        return rounded_price;
        }
        
    public static void main(String[] args) {
        AlexTaxi alex = new AlexTaxi();
        double distance = 85;
        alex.calc_standart(distance);
        alex.calc_comfort(distance);
        alex.calc_business(distance);
        alex.calc_minivan(distance);
    }
    
}

        /* recommended the distance to be at least 80 km
        *  code was created to calculate price for taxi that travels 
        *  from one city to another which excludes such occasions
        */
