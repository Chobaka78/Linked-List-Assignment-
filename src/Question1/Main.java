/*
 *Main.java
 *Usman Farooqi
 *This is the main testing class where all the methods are tested
 */
package Question1;

public class Main {
    public static void main(String[] args) {
        LList nums=new LList();
        nums.push(300);
        nums.push(30);
        nums.push(20);
        System.out.println(nums);
        nums.pop();
        System.out.println(nums);
    }

}
