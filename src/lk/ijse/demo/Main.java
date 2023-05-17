package lk.ijse.demo;

public class Main {
    public static void main(String[] args) {
//        Pasindu pasindu = new Pasindu(new Saduni());
        Pasindu pasindu = new Pasindu();
        pasindu.setInjection(new Saduni());
        pasindu.pasinduIsChatting();
        pasindu.danceWithSaduni();
        //test
    }
}
