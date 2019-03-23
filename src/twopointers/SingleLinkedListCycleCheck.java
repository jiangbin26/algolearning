package twopointers;

import java.util.HashSet;
import java.util.Set;

public class SingleLinkedListCycleCheck {

    private class LinkedList{
        LinkedList next;
        int value;
        LinkedList(int value){
            this.value = value;
        }
    }

    private LinkedList buildLinkedList(){
        LinkedList node = new LinkedList(1);
        node.next = new LinkedList(2);
        node.next.next = new LinkedList(8);
        node.next.next.next = new LinkedList(4);
        node.next.next.next.next = node.next;
        return node;
    }

    public boolean checkSingleLinkedListIsCycleWithoutSet(){
        LinkedList head = buildLinkedList();
        LinkedList fast = head ,slow = head;
        while(fast != null  && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) return true;
        }
        return false;
    }

    public boolean checkSingleLinkedListIsCycleWithSet(){
        LinkedList head = buildLinkedList();
        Set<LinkedList> elementSet = new HashSet<>();
        for(LinkedList p = head;p != null ;p = p.next){
            if(elementSet.contains(p)) return true;
            elementSet.add(p);
        }
        return false;
    }

    public static void main(String[] args) {
        //System.out.print(new SingleLinkedListCycleCheck().checkSingleLinkedListIsCycleWithoutSet());
        System.out.print(new SingleLinkedListCycleCheck().checkSingleLinkedListIsCycleWithSet());
    }
}
