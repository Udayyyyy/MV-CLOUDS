package Day7;

public class six {
public static void main(String [] args){
        dog jack=new dog();
        jack.eat();
        jack.breathe();
        jack.legs=4;
        System.out.println(jack.legs);
        jack.run();
        jack.bark();
        jack.types=0;
        System.out.println(jack.types);
     }
    
}

    class Animal{

        void eat(){
            System.out.println("Animal is eating");
        }
        void breathe(){
            System.out.println("Animal is breathing.");
        }
    }

     class mamels extends Animal{
        int legs;
        void run(){
            System.out.println("Animal is running...");
        }
    }
     class dog extends mamels{
        int types;
        void bark(){
            System.out.println("Dog is barking...");
        }
    }



    

