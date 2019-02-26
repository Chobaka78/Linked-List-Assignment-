package Question2;

public class Main {
    public static void main(String[] args) {
        LList usman = new LList();
        usman.enqueue(40);
        usman.enqueue(100);
        System.out.println(usman);
        usman.dequeue();
        System.out.println(usman);
        usman.add(200);
        usman.add(300);
        System.out.println(usman);
    }
}
