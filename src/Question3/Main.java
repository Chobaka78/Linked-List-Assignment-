package Question3;

public class Main {
    public static void main(String[] args) {
        LList usman = new LList();
        usman.enqueue(40);
        usman.enqueue(1400);
        usman.enqueue(2340);
        usman.enqueue(2333);
        System.out.println(usman);
        usman.delete(40);
        System.out.println(usman);
        usman.deleteAt(0);
        System.out.println(usman);
    }
}
