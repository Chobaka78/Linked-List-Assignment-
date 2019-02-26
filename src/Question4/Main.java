package Question4;

public class Main {
    public static void main(String[] args) {
        LList usman = new LList();
        usman.enqueue(2334);
        usman.enqueue(34);
        usman.enqueue(22);
        usman.enqueue(2);
        System.out.println(usman);
        usman.sortedInsert(1);
        System.out.println(usman);
    }
}
