package 互联网公司.头条;

import org.junit.Test;
import tools.ListNode;

/**
 * 可见{@link tools.ListNode#reverse(ListNode)}
 * 记得当时做了好久，现在再做一遍
 * 总结：链表不要以为一个指针就能做好，起码3个。先画图，在图上能一步一步做下来。再落到代码上。
 */
// 7:40 - 7:52 - 7：59
public class 反转链表 {
    MyListNode initList(int [] arr){
        MyListNode head = new MyListNode(-1,null);
        MyListNode pointer = head;
        for (int i = 0; i < arr.length; i++) {
            MyListNode node = new MyListNode(arr[i], null);
            pointer.next = node;
            pointer = node;
        }
        return head;
    }
    static class MyListNode{
        int val;
        MyListNode next;

        public MyListNode(int val, MyListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    MyListNode reverse(MyListNode input){
        if(input == null || input.next == null){
            return input;
        }

        MyListNode p = input.next;
        input.next = null;
        while(p!=null){
            MyListNode q = p;
            p = p.next;
            q.next = input.next;
            input.next = q;

        }
        return input;
    }
    /**
     * 使用debug看一下即可，不做打印
     */
    @Test
    public void testInit(){
        initList(new int[]{});
        initList(new int[]{1});
        initList(new int[]{1,2});
        initList(new int[]{1,2,3,4,5,6,7});
    }
    @Test
    public void testReverse(){
        MyListNode list = initList(new int[]{1, 2, 3, 4});
        MyListNode reverse = reverse(list);
        System.out.println("end");
    }

}
