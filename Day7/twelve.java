package Day7;

public class twelve {
        public static void main(String[] args){

        teacher t1=new teacher();
        t1.duty();
        t1.name();
        t1.personid();

    }

    
}

interface profile{

    void name();
    void personid();
}

interface work{
    void duty();
    void personid();
}

class teacher implements profile,work {

    public void name(){
        System.out.println("Teache's name");
    }
    
    public void duty(){
        System.out.println("Teache's duty");
    }
    public void personid() {
        System.out.println("Personal ID is 09876543");
    }
}
