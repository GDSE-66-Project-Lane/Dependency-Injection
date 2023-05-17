package lk.ijse.demo;

public class Main {
    public static void main(String[] args) {
//        Pasindu pasindu = new Pasindu(new Saduni());
        DI di = new Pasindu();
        di.setInjection(new Dasuni());
        ((Pasindu)di).pasinduIsChatting();
        ((Pasindu)di).danceWithSaduni();

    }
}
