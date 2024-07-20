class AbsoluteValue{
    static int abs(int a){
        int res;
        res = a > 0 ? a : -a; 
        return res;
    }
    static void printGuide(){
        System.out.printf("\n\nConstruction of Ternary Expressions:\n<result> = <testCondition> ? value1 : value2\n\nIf <testCondition> is True than <result> = value1\nIf <testCondition> is False than <result> = value2\n");
    }
}
public class TernaryExperssions {
    public static void main(String[] args) {
        int test = -234;
        /*
        можно не делать экземпляр класса AbsoluteValue
        а сразу же вызвать метод через оператор точку с указанием названия класса 
        это можно сделать благодаря static в методе abs
        */
        System.out.println("Absolute value of "+test+" = "+AbsoluteValue.abs(test));
        test = 91238;
        System.out.println("Absolute value of "+test+" = "+AbsoluteValue.abs(test));
        test= -91240;
        System.out.println("Absolute value of "+test+" = "+AbsoluteValue.abs(test));
        AbsoluteValue.printGuide();
    }
}
