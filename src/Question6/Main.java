package Question6;

public class Main {
    public static void main(String[] args) {
        LList usman = new LList();
        usman.enqueue(334);
        usman.enqueue(244);
        usman.enqueue(244);
        usman.enqueue(44);
        usman.enqueue(44);
        usman.enqueue(3);
        System.out.println(usman);
        usman.reverse();
        System.out.println(usman);
    }
}
