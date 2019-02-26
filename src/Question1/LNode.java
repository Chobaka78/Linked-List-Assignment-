/*
 *LNode.java
 *Usman Farooqi
 * This class will control everything for the nodes from getting nodes to setting them and getting their values
 */
package Question1;

public class LNode {
    private int val;
    private LNode next;
    public LNode(int v,LNode n){
        val=v;
        next=n;
    }
    public int getVal(){
        return val;
    }
    public void setVal(int v){
        val=v;
    }
    public LNode getNext(){
        return next;
    }
    public void setNext(LNode n){
        next=n;
    }
    public String toString(){
        return "["+val+"]";
    }
}
