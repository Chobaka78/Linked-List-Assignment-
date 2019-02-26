package Question5;

public class Main {
    public static void main(String[] args) {
        LList usman = new LList();
        usman.enqueue(234);
        usman.enqueue(144);
        usman.enqueue(144);
        usman.enqueue(34);
        usman.enqueue(34);
        usman.enqueue(34);
        usman.enqueue(2);
        System.out.println(usman);
        usman.removeDuplicates();
        System.out.println(usman);
    }
}
