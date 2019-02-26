/*
*LList.java
* Usman Farooqi
* This is the class for a single linked list (not doubly linked)
* This has two new methods
* Push will add to the top of the stack
* Pop will remove from the top of the stack
 */
package Question1;

public class LList { // object list
    private LNode head;
    public LList(){ // constructor
        head=null;
    }
    public void add(int n){ // given add method to add elements
        LNode tmp=new LNode(n,head);
        head=tmp;
    }
    @Override
    public String toString(){ // prints out visual representation of the list
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

    public void push(int n){ // push method adds to top of stack
        LNode tmp = new LNode(n,head);
        head = tmp;
    }

    public LNode pop(){ // pop method removes from top
        if(head == null){ // if the list is empty
            return null;  // return nothing
        }
        else{ // else
            LNode tmp = head;
            head = tmp.getNext(); // make head point to next element (nothing will point to current so it will disappear)
            return tmp;
        }

    }
}
