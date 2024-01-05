class Node{
    int data;
    Node next;
    Node prev;

    //Constructors

    public Node(int data1, Node next1, Node back1){
        this.data = data1;
        this.next = next1;
        this.prev = back1;
    }

    public Node(int data1){
        this.data = data1;
        this.next = null;
        this.prev = null;
    }
}

public class DoublyLL {

    private static Node convertarr2DLL(int [] arr){
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i = 1; i<arr.length;i++){
            Node temp = new Node(arr[i], null , prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    private static void print(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    //delete head node
/*
   private static Node deleteHead(Node head){
        if(head == null || head.next == null)
        return null;

        Node prev = head;
        head = head.next;

        head.prev = null;
        prev.next = null;

        return head;

    }

    //delete tail node
    public static Node deleteLastNode(Node head) {
        // Write your code here
         if(head == null || head.next == null)
        return null;

        Node tail = head;
        while(tail.next!=null){
            tail =tail.next;
        }
        Node newTail = tail.prev;
        newTail.next = null;
        tail.prev = null;
        return head;
    }

    //delete kth node


    private static Node deletekthelement(Node head, int k){
        if(head == null)
            return null;


        Node temp = head;
        int cnt =0 ;

        while(temp!=null){
            cnt++;
            if(cnt == k)
                break;

            temp = temp.next;
        }

        Node back = temp.prev;
        Node front = temp.next;

        if(back == null && front == null)   
            return null;
        else if(back == null)
            return deleteHead(head);
        else if (front == null)
            return deleteLastNode(head);


        back.next = front;
        front.prev = back;


        temp.next =null;
        temp.prev = null;
        return head;
    }

 */
    private static void deleteNode(Node temp){
        Node back = temp.prev;
        Node front = temp.next;


        //edge case
        if(front == null){
            back.next= null;
            temp.prev = null;
            return;
        }

        back.next = front;
        front.prev = back;


        temp.next = null;
        
        temp.prev =null;
        return;
    }

    //insertion at head

    private static Node insertionBeforeHead(Node head, int val){
    
        Node newHead = new Node(val, head, null); 

        head.prev = newHead;
        return newHead;

    }

    //insert before tail

    private static Node insertionBeforeTail(Node head, int val){

        if(head.next == null)
            return insertionBeforeHead(head, val);

        Node tail = head;
        while(tail.next!=null){
            tail=tail.next;
        }
        Node prev = tail.prev;

        Node newNode = new Node(val, tail, prev);
        prev.next= newNode;
        tail.prev = newNode;
        return head;
    }

    //insert after head;
   private static Node insertAfterHead(Node head, int val){
    Node temp = head;
    int count = 0;

    while(temp!=null){
        count++;
        if(count == 2) break;
        temp = temp.next;
    }
    Node newNode = new Node(val, temp, head);

    head.next = newNode;
    temp.prev = newNode;

    newNode.next =temp;
    newNode.prev = head;
    return head;
   }

    //insert before kth element;
   private static Node insertbeforekthel(Node head, int val,int k){
    if(k == 1)
        return insertionBeforeHead(head, val);

    Node temp = head;
    int count = 0;

    while(temp!=null){
        count++;
        if(count == k) break;
        temp = temp.next;
    }
    Node back = temp.prev;
    Node newNode = new Node(val, temp, back);

    back.next = newNode;
    temp.prev = newNode;

    newNode.next =temp;
    newNode.prev = back;
    return head;
   }
    public static void main(String[] args){
        int [] arr = {12,7,5,1};
        Node head = convertarr2DLL(arr);
        //head = deleteLastNode(head);
        //deleteNode(head.next);
       //head= insertionBeforeTail(head, 10);
       head = insertbeforekthel(head, 10,3);
        print(head);
    }
}
