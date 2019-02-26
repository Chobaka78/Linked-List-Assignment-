package Question3;

public class LList {
        private LNode head;
        private LNode tail;
        public LList(){
            head = null;
            tail = null;
        }
        public void push(int n){
            LNode tmp = new LNode(null,n,head);
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

        public void delete(LNode node){
            if(node == head && node == tail){

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
            for(int x = 0; x < n; x++){
                tmp = tmp.getNext();
            }
            delete(tmp);
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
