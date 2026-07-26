public class Student {
    String name;
    int age;
    int id;
     // abstraction implementation
    private String gf;

    // abstraction methos
    private void  GF(){
        System.out.println("HIS gF");
    }
    private void gfChatting(){
        System.out.println("chatting with gf");
    }
    // GETER SETER METHOD TO ACESS private things with this layer for extraa check
    //Default constructor
    public Student(){
        System.out.println("this is default constructor");

    }

    public  Student(int id,int age,String name,String gf){
        this.id=id;
        this.age=age;
        this.name=name;
        this.gf=gf;
    }

    // geter seter for the extra layer we implementing
    public String getGf(){
        return this.gf;
    }

    //seter

    public void  setAge(int a){
        this.age=a;
    }

    public void Bunk(){
        System.out.println("Stundent Bunking");
    }



}

