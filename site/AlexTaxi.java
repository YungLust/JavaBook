package site;

public class AlexTaxi {
    private double calcPrice;
    private double standartPriceUa = 0.5;
    private double comfortPriceUa = 0.55;
    private double businessPriceUa = 0.7;
    private double minivanPriceUa = 0.7;

    private double standartPriceEu = 0.8;
    private double comfortPriceEu = 0.85;
    private double businessPriceEu = 1;
    private double minivanPriceEu = 1;

    // methods to display different tarifs` price within Ukraine
    public void calcStandart(double distance) {
        calcPrice = distance * standartPriceUa;
        System.out.printf("standart: %d \n", roundPrice(calcPrice));
    }

    public void calcComfort(double distance) {
        calcPrice = distance * comfortPriceUa;
        System.out.printf("comfort: %d \n", roundPrice(calcPrice));
    }

    public void calcBusiness(double distance) {
        calcPrice = distance * businessPriceUa;
        System.out.printf("business: %d \n", roundPrice(calcPrice));
    }

    public void calcMinivan(double distance) {
        calcPrice = distance * minivanPriceUa;
        System.out.printf("minivan: %d \n", roundPrice(calcPrice));
    }

    // methods to display different tarifs` price within Ukraine & Europe
    public void calcStandart(double distanceUa, double distanceEu) {
        calcPrice = distanceUa * standartPriceUa + distanceEu * standartPriceEu;
        System.out.printf("standart: %d \n", roundPrice(calcPrice));
    }

    public void calcComfort(double distanceUa, double distanceEu) {
        calcPrice = distanceUa * comfortPriceUa + distanceEu * comfortPriceEu;
        System.out.printf("comfort: %d \n", roundPrice(calcPrice));
    }

    public void calcBusiness(double distanceUa, double distanceEu) {
        calcPrice = distanceUa * businessPriceUa + distanceEu * businessPriceEu;
        System.out.printf("business: %d \n", roundPrice(calcPrice));
    }

    public void calcMinivan(double distanceUa, double distanceEu) {
        calcPrice = distanceUa * minivanPriceUa + distanceEu * minivanPriceEu;
        System.out.printf("minivan: %d \n", roundPrice(calcPrice));
    }

    // method to get rounded price
    private int roundPrice(double price) {
        // get rid of float
        // System.out.println(price);
        int roundedPrice = (int) Math.ceil(price);

        // Get the last digit
        int thirdDigit = (roundedPrice % 10) / 1;

        // If the last digit is in range from 1 to 5
        if (thirdDigit >= 1 && thirdDigit < 5) {
            // round the last digit to 5
            roundedPrice = (roundedPrice / 10) * 10 + 5;

            // If the last digit is in range from 5 to 10
        } else if (thirdDigit >= 5 && thirdDigit < 10) {
            // Round up to the next digit
            roundedPrice = ((roundedPrice / 10) + 1) * 10;
        }
        return roundedPrice;
    }

    public static void main(String[] args) {
        AlexTaxi alex = new AlexTaxi();
        double distanceUa = 736;
        double distanceEu = 1260 - 736;
        System.out.println("Route: From Kharkiv to Budapest");
        System.out.println("Travelled distance in Ukraine: " + distanceUa + " km");
        System.out.println("Travelled distance in Europe: " + distanceEu + " km\n");
        System.err.println("Tarifs` prices:");
        alex.calcStandart(distanceUa, distanceEu);
        alex.calcComfort(distanceUa, distanceEu);
        alex.calcBusiness(distanceUa, distanceEu);
        alex.calcMinivan(distanceUa, distanceEu);
    }

}

/*
 * recommended the distance to be at least 80 km
 * code was created to calculate price for taxi that travels
 * from one city to another which excludes such occasions
 */
