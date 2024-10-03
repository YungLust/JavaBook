import java.util.Random;

enum Answers{
    NO,YES,PROBABLY,SOON,LATER,NEVER,KYS,DONT
}
class Question{
    Random rand = new Random();
    //we create method with the name 'ask' that returns 'Answers'
    Answers ask (){
        int randomInt = rand.nextInt(100);
        int randomInt1 = rand.nextInt(100);
        if (randomInt < 30){ //20%
            return Answers.YES;
        }
        else if (randomInt < 50){ //20 %
            return Answers.NO;
        }
        else if (randomInt < 65){ //15%
            return Answers.PROBABLY;
        }
        else if (randomInt < 79){ //14%
            return Answers.LATER;
        }
        else if (randomInt < 93){ //14%
            return Answers.SOON;
        } 
        else if (randomInt < 98){ //5%
            return Answers.NEVER;
        } 
        else if (randomInt < 99 && randomInt1 == 1) { //0.01%
            return Answers.KYS;
        } 
        else {
            return Answers.DONT;
        }
    }
}
class AskMe {
    //we create method that is available without creating class object
    //it takes Answers varialbe
    //that we take from Question`s class method - 'ask'
    static void answer (Answers answer){
        switch (answer) {
            case YES:
                System.out.println("Yes!");
                break;
            case NO:
                System.out.println("No!");
                break;
            case PROBABLY:
                System.out.println("Probably.");
                break;
            case LATER:
                System.out.println("Later...");
                break;
            case SOON:
                System.out.println("Soon...");
                break;
            case NEVER:
                System.out.println("Never.");
                break;
            case DONT:
                System.out.println("Don`t ask me. I don`t know!");
                break;
            case KYS:
                System.out.println("Wow you are really lucky! Now kill yourself!");
                break;
            default:
            System.out.println("Error");
                break;
        }   
    }
    public static void main (String[] args){
        Question q = new Question();
        answer(q.ask());
        for (int i = 0; i < 10; i++){
            answer(q.ask());
        }
    }
}
