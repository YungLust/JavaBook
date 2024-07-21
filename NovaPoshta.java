/*
 * class for boxes with some delivery
 */
class Box{
    private double width;
    private double height;
    private double depth;
    private double mass;

    //constuctor to copy other objects of class Package
    Box(Box object){
        object.width = width;
        object.height = height;
        object.depth = depth;
        object.mass = mass;
    }
    //constructor to manually write box properties
    Box(double w, double h, double d, double m){
        w = width;
        h = height;
        d = depth;
        m = mass;
    }
    //constructor for box w/o measurments
    Box(){
        width=-1;
        height=-1;
        depth=-1;
        mass=-1;
    }
}

/* 
class for boxes that has special properties
and treated specially (e.g: glass)
*/
class SpecialBox extends Box{
    String material;
    SpecialBox(double w, double h, double d, double m, String mat){
        super(w,h,d,m);//calling the constructor of super class
        mat = material;
    }
}

class Package extends Box{
    Package(double w, double h, double d, double m){
        super(w,h,d,m);

    }
}


public class NovaPoshta {
    public static void main(String[] args){

    }
}
