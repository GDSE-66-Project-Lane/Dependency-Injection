package lk.ijse.demo;

public class Main {
    public static void main(String[] args) {
//        Pasindu pasindu = new Pasindu(new Saduni());
        DI di = new Pasindu();
        //DI means super reference. but DI interface does not include the below methods expect inject
        //they are inside the Sub Class Pasindu
        // So here we can use class casting to resolve this matter
        // Here we can cast DI(Super Interface) to its Sub Class as below
        di.setInjection(new Dasuni()); // here no need to cast. because DI reference owns inject method
        ((Pasindu)di).pasinduIsChatting();// casting DI to its Sub Class Pasindu
        ((Pasindu)di).danceWithSaduni();// casting DI to its Sub Class Pasindu

    }
}
