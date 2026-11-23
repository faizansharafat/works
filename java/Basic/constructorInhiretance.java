class father{
    String name;
    int age;
    String fName;
    father(){
        System.out.println("i am constructor");
    }
    father(String name,String fName){
        System.out.println("i am a constructor with two par");

    }
    father(String name ){
        System.err.println("lam a par conssrtuctor:");
    }
}
class son extends father{
    son(){
        super("faizan","Sharafat Ali");
        System.out.println("i am a construtor of son class ");
    }
}

public class constructorInhiretance{
    void main() {

        // father f1=new father();
        son s1=new son();
        // System.out.println(f1.name);
    }
    
}
