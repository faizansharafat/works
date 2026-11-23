class engen{
    void start(){
        System.out.println("hello i amstarting from: ");
    }
}
class car{
    
        engen e=new engen();
        void drive(){
        e.start();
        }
}

public class hasA{
    public static void main(String[] args) {   
        car c1=new car();
        c1.drive();
    }
}