package Question2;

public class LList {
    private LNode head;
    private LNode tail;
    public LList(){
        head = null;
        tail = null;
    }
    public void add(int n){
        LNode tmp = new LNode(null,n,head);
        head.setPrev(tmp);
        head = tmp;
    }
    public void enqueue(int n){
        if(head == null){
            head = new LNode(null,n,null);
            tail = head;
        }
        else{

            LNode tmp = new LNode (tail,n,null);
            tail.setNext(tmp);
            tail = tmp;
        }
    }

    public LNode dequeue(){
        if(head == null){
            return null;
        }

        else{
            LNode tmp = head;
            head = tmp.getNext();
            return tmp;
        }
    }
    @Override
    public String toString(){
        String ans="";
        LNode tmp=head;
        while(tmp!=null){
            ans+=tmp+"-";//will call toString
            tmp=tmp.getNext();
        }
        if(ans.length() != 0){
            ans=ans.substring(0,ans.length()-1);
        }
        return ans;
    }
}
