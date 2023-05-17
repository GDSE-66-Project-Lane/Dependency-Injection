package lk.ijse.demo;

public class Main {
    public static void main(String[] args) {
//        Pasindu pasindu = new Pasindu(new Saduni());
        DI pasindu = new Pasindu();
        ((Pasindu)pasindu).setInjection(new Dasuni());
        ((Pasindu)pasindu).pasinduIsChatting();
        ((Pasindu)pasindu).danceWithSaduni();

    }
}
