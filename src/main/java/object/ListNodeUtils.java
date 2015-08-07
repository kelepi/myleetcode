package object;

import com.google.common.base.Charsets;
import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/4/28
 * Time: 11:25
 */
public class ListNodeUtils {
    public static ListNode makeList(int[] ints) {
        ListNode head = null;
        ListNode cur = null;
        for (int i : ints) {
            if (head == null) {
                head = new ListNode(i);
                cur = head;
            } else {
                ListNode node = new ListNode(i);
                cur.next = node;
                cur = cur.next;
            }
        }
        return head;
    }

    public static ListNode[] makeLists(int[][] intss) {
        ListNode[] lists = new ListNode[intss.length];
        for (int i = 0; i != intss.length; i++) {
            int[] ints = intss[i];
            ListNode listNode = makeList(ints);
            lists[i] = listNode;
        }
        return lists;
    }

    public static ListNode[] makeListsFromFile(String file) {
        List<String> lines = null;
        try {
            lines = Files.readLines(new File(ListNodeUtils.class.getClassLoader().getResource(file).toURI()), Charsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        ListNode[] lists = new ListNode[lines.size()];
        for (int i = 0; i != lines.size(); i++) {
            String line = lines.get(i);
            String[] nums = line.split(",");
            ListNode head = null, newHead = null;
            for (String num: nums) {
                ListNode node = new ListNode(Integer.parseInt(num.trim()));
                if (head == null) {
                    head = node;
                    newHead = head;
                } else {
                    head.next = node;
                    head = head.next;
                }
            }
            lists[i] = newHead;
        }
        return lists;
    }

    public static void print(ListNode l) {
        while (l != null) {
            System.out.print(l.val + "->");
            l = l.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    public static boolean equal(ListNode l, ListNode r) {
        while (l != null && r != null) {
            if (l.val != r.val) {
                return false;
            }
            l = l.next;
            r = r.next;
        }
        return l == null && r == null;
    }
}
