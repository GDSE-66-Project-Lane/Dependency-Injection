package lk.ijse.demo;
//if the dependency is injected to a class through the property then it is known as property injection

public class Pasindu {
//    Wedding wedding=new Saduni();//property injection


    Wedding wedding;

    //Constructor Injection
    public Pasindu(Wedding w){
        this.wedding=w;
    }



    public void pasinduIsChatting(){
        wedding.chattingWithPasindu();
    }

    public void danceWithSaduni(){
        wedding.dancing();
    }
}
