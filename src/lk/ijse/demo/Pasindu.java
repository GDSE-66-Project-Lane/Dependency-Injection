package lk.ijse.demo;
//if the dependency is injected to a class through the property then it is known as property injection

//if the dependency can be set while creating the object then we can use this constructor injection method
public class Pasindu implements DI {
//    Wedding wedding=new Saduni();//property injection


    Wedding wedding;

    //Constructor Injection
//    public Pasindu(Wedding w){
//        this.wedding=w; // dependency is setted through the constructor
//    }

    //setter method injection
    //if we get to know about the dependency after
    //passing the above two methods then this method is used to set the dependency
    @Override
    public void setInjection(Wedding w){
        this.wedding=w;
    }


    public void pasinduIsChatting(){
        wedding.chattingWithPasindu();
    }

    public void danceWithSaduni(){
        wedding.dancing();
    }
}
