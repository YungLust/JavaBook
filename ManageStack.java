class Stack/*(int size)*/{ //Нельзя указывать аргументы в классе
    private int stackPointer = -1;
    private int stck[];
    
    //Чтобы передать аргументы при создании экземпляра
    //нужен конструктор (метод без типа данных с названием класса)
    Stack(int size){
        stck = new int[size];
        stackPointer = -1;
    }
    public void push(int val){
        if (stackPointer == stck.length - 1){
            System.out.println("Stack is full. You should pop");
        }
            else {
            stck[++stackPointer]=val;
        }
    }

    public int pop(){
        if (stackPointer == -1){
            System.out.println("Stack is empty");
            return 0;
        }
        else return stck[stackPointer--];
        
    }
}
public class ManageStack {
    public static void main(String args[]){
        Stack st = new Stack(10);
        st.pop();
        for (int i = 0; i < 14; i++) st.push(12*i);
            for (int i = 0; i < 14; i++) System.out.println(st.pop());
    }
}
