package Realtor;
import java.util.Random;
import java.util.Random.*;

public class Main {
    public static void main (String[] args){
        Office office2 = new Office (2, 220500, 169);
        Office office3 = new Office(3, 220500, 169);
        Appartament apr1 = new Appartament(1, 55900, 60);
        Appartament apr3 = new Appartament(3, 55900, 60);
        Studio std1 = new Studio(1, 45250, 60);
        Studio std5 = new Studio(5, 45250, 50);
        System.out.println("Office2: "+office2.getPrice());
        System.out.println("Office3: "+office3.getPrice());
        System.out.println("*\nAppr1: "+apr1.getPrice());
        System.out.println("Appr3: "+apr3.getPrice());
        System.out.println("*\nStudio1: "+std1.getPrice());
        System.out.println("Studio5: "+std5.getPrice());
    }
}
