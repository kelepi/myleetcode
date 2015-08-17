/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/19
 * Time: 10:17
 */
/*
Design a data structure that supports the following two operations:

void addWord(word)
bool search(word)
search(word) can search a literal word or a regular expression string containing only letters a-z or .. A . means it can represent any one letter.

For example:

addWord("bad")
addWord("dad")
addWord("mad")
search("pad") -> false
search("bad") -> true
search(".ad") -> true
search("b..") -> true
Note:
You may assume that all words are consist of lowercase letters a-z.

click to show hint.

You should be familiar with how a Trie works. If not, please work on this problem: Implement Trie (Prefix Tree) first.
 */
public class WordDictionary {
    Trie trie = new Trie();

    // Adds a word into the data structure.
    public void addWord(String word) {
        trie.insert(word);
    }

    // Returns if the word is in the data structure. A word could
    // contain the dot character '.' to represent any one letter.
    public boolean search(String word) {
        return trie.search(word);
    }
}

class TrieNode {
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
            if (c == '.') {
                for (int i = 0; i != childs.length; i++) {
                    if (childs[i] != null && childs[i].word) {
                        return true;
                    }
                }
                return false;
            }
            return exist(c) && childs[c - 'a'].word;
        } else {
            if (c == '.') {
                for (int i = 0; i != childs.length; i++) {
                    if (childs[i] != null && childs[i].search(sub)) {
                        return true;
                    }
                }
                return false;
            } else {
                return exist(c) && childs[c - 'a'].search(sub);
            }
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

class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        root.addChilds(word);
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        return root.search(word);
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        return root.startsWith(prefix);
    }
}

// Your WordDictionary object will be instantiated and called as such:
// WordDictionary wordDictionary = new WordDictionary();
// wordDictionary.addWord("word");
// wordDictionary.search("pattern");
