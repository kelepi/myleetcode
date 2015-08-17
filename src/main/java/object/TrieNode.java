package object;

/**
 * Created by Patrick on 15/5/9.
 */
public class TrieNode {
    TrieNode[] childs = new TrieNode[26];
    boolean word = false;

    // Initialize your data structure here.
    public TrieNode() {
    }

    public boolean exist(char c) {
        return childs[c - 'a'] != null;
    }

    public boolean search(String s) {
        if (s == null) {
            return false;
        }
        if (s.length() == 0) {
            return true;
        }
        char c = s.charAt(0);
        String sub = s.substring(1);
        if (sub.length() == 0) {
            return exist(c) && childs[c - 'a'].word;
        } else {
            return exist(c) && childs[c - 'a'].search(sub);
        }
    }

    public void addChild(char c) {
        if (!exist(c)) {
            childs[c - 'a'] = new TrieNode();
        }
    }

    public void addChilds(String s) {
        if (s == null || s.length() == 0) {
            return;
        }
        char c = s.charAt(0);
        String sub = s.substring(1);
        addChild(c);
        if (sub.length() == 0) {
            childs[c - 'a'].word = true;
        } else {
            childs[c - 'a'].addChilds(sub);
        }
    }

    public boolean startsWith(String prefix) {
        if (prefix == null) {
            return false;
        }
        if (prefix.length() == 0) {
            return true;
        }
        char c = prefix.charAt(0);
        return exist(c) && childs[c - 'a'].startsWith(prefix.substring(1));
    }
}
