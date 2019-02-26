package Question4;

public class LNode {
    private int val;
    private LNode next;
    private LNode previous;

    public LNode(LNode p, int v,LNode n){
        val = v;
        next = n;
        previous = p;
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
    public LNode getPrev(){
        return previous;
    }
    public void setNext(LNode n){
        next=n;
    }
    public void setPrev(LNode n){
        previous = n;
    }
    public String toString(){
        return "["+val+"]";
    }
}
