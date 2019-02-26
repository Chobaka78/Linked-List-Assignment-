/*
*Main.java
*Usman Farooqi
*This is the main testing class where all the methods are tested
 */
package Question7;

public class Main {
    public static void main(String[] args) {
        LList usman = new LList();
        usman.enqueue(334);
        usman.enqueue(244);
        usman.enqueue(244);
        usman.enqueue(44);
        usman.enqueue(44);
        usman.enqueue(3);
        usman.add(12000);
        System.out.println("Original: " + usman);
        usman.Clone();
        System.out.println("clone: " + usman);
    }
}
