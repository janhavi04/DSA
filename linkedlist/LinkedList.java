class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }
     Node(int data1){
        this.data = data1;
        this.next = null;
    }
}


class LinkedList{
    private static Node convertArrtoLL(int[] arr){
    Node head = new Node(arr[0]);
    Node mover = head;
    for(int i = 1; i<arr.length;i++){
        Node temp = new Node(arr[i]);
        mover.next = temp;
        mover= temp;
    }
    return head;
}

//length of linkedlist
private static int lengthofLL(Node head){
    int cnt = 0;
    Node temp = head; 
     while(temp != null){
            //System.out.print(temp.data+ " ");
            temp = temp.next;
            cnt++;
        }
        return cnt;
}
//printinf ll

private static void print(Node head){
    while(head!=null){
        System.out.print(head.data +" ");
        head=head.next;
    }
}
//delete head node
/*
private static Node removeHead(Node head){
    if (head == null)
        return null;
    head = head.next;
    return head;
}
*/
//delete tail node
/*
private static Node removeTail(Node head){
    if(head == null || head.next == null)
        return null;

    Node temp = head;
    while(temp.next.next !=null){
        temp= temp.next;
    }
    temp.next = null;
    return head;
}
*/

//delete kth node
/*
private static Node removekthNode(Node head,int k){
    if(head == null || head.next == null)
        return null;
    if(k == 1)
    {
        head = head.next;
        return head;
    }

    Node temp = head;
    Node prev = null;
    int cnt = 0;
    while(temp !=null){
        cnt++;
        if(cnt == k){
            prev.next = prev.next.next;
            temp = null;
            break;
        }
        prev = temp;
        temp = temp.next;
    }
    return head;
}
*/
//delete depending on value

/*private static Node removeElement(Node head,int el){
    if(head == null || head.next == null)
        return null;
    if(head.data == el)
    {
        head = head.next;
        return head;
    }

    Node temp = head;
    Node prev = null;
    
    while(temp !=null){
      
        if(temp.data == el){
            prev.next = prev.next.next;
            temp = null;
            break;
        }
        prev = temp;
        temp = temp.next;
    }
    return head;
}*/

//Insert at the head
/*
private static Node insertHead(Node head, int val){
    Node temp = new Node(val, head);
    return temp;
}*/

//Insert at the tail

/*private static Node insertatLast(Node head, int val){
    if(head == null)
        return new Node(val);

    Node temp = head;
    while(temp.next != null){
        temp = temp.next;
    }

    Node newNode = new Node(val);
    temp.next = newNode;
    return head;
}*/
//insert at k position

/*private static Node insertatK(Node head, int val, int k){
    if(head == null){
        if(k==1)
            return new Node (val);
        else return null;
    }
        if(k==1)
            return new Node (val, head);

        int cnt = 0;
        Node temp = head;

        while(temp!=null){
            cnt++;
            if(cnt == k-1){
                Node newNode = new Node(val, temp.next);
                temp.next = newNode;
                break;
            }
            temp =temp.next;
        }
        return head;

    }
*/
    //insert at k position

private static Node insertBeforeValue(Node head, int el, int val){
    if(head == null){
        return null;
    }
        if(head.data==val)
            return new Node (el, head);

      
        Node temp = head;

        while(temp.next!=null){
           
            if(temp.next.data == val){
                Node newNode = new Node(el, temp.next);
                temp.next = newNode;
                break;
            }
            temp =temp.next;
        }
        return head;

    }


   
    public static void main(String[] args){
        int[] arr = {12,5,6,8,10,15};
       Node head = convertArrtoLL(arr);
        //Node y = new Node(arr[0]);
        //System.out.print(head.data);
   
       // System.out.println(lengthofLL(head));
       
        //traversing in LL

       /* Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        } */
        //head = removeHead(head);
        //head = removeTail(head);
        //head= removekthNode(head, 1);
       // head= removeElement(head, 15);
       //head = insertHead(head, 10);
       //head = insertatLast(head, 7);
       head = insertBeforeValue(head, 7, 5);
        print(head);
    }
}