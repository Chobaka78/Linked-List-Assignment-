package Question5;

public class LList {
    private LNode head;
    private LNode tail;
    public LList(){
        head = null;
        tail = null;
    }
    public void add(int n){ // modified add version from single linked list
        LNode tmp = new LNode(null,n,head);
        head.setPrev(tmp);
        head = tmp;
    }
    public void enqueue(int n){
        if(head == null){
            LNode tmp = new LNode(null,n,null);
            head = tmp;
            tail = tmp;
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
    public void delete(LNode node){
        if(node == head && node == tail){
            head = null;
            tail = null;
        }
        else if(node == head){
            head = node.getNext();
            head.setPrev(null);
        }
        else if(node  == tail){
            tail = node.getPrev();
            tail.setNext(null);
        }
        else{
            node.getPrev().setNext(node.getNext());
            node.getNext().setPrev(node.getPrev());
        }
    }

    public void delete(int n){
        LNode tmp = head;
        while (tmp != null){
            if(tmp.getVal() == n){
                delete(tmp);
                return;
            }
        }
    }

    public void deleteAt(int n){
        LNode tmp = head;
        int i = 0;
        while(i < n){
            tmp = tmp.getNext();
            i += 1;
        }
        delete(tmp);
    }

    public void sortedInsert(int n){
        LNode tmp = head;
        if(head == null){
            enqueue(n);
        }
        else{
            while (tmp != null){
                if(tmp.getNext() != null){
                    if(tmp.getVal() >= n && tmp.getNext().getVal() <= n){
                        LNode tmp2 = new LNode(tmp, n, tmp.getNext());
                        tmp.setNext(tmp2);
                        tmp2.getNext().setPrev(tmp2);
                        return;
                    }
                }
                else{
                    LNode tmp2 = new LNode(tail,n,null);
                    tmp2.getPrev().setNext(tmp2);
                }
                tmp = tmp.getNext();
            }
        }

    }

    public boolean contains (int n){
        LNode tmp = head;
        while (tmp != null){
            if(tmp.getVal() == n){
                return true;
            }
            tmp = tmp.getNext();
        }
        return false;
    }

    public void removeDuplicates(){
        LNode tmp = head;
        LList newlist = new LList();
        while (tmp != null) {
            if(!newlist.contains(tmp.getVal())){
                newlist.enqueue(tmp.getVal());
            }
            tmp = tmp.getNext();
        }
        head = newlist.head;
        tail = newlist.tail;
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
