import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/21
 * Time: 14:24
 */
/*
Given a 2D board and a list of words from the dictionary, find all words in the board.

Each word must be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally
or vertically neighboring. The same letter cell may not be used more than once in a word.

For example,
Given words = ["oath","pea","eat","rain"] and board =

[
  ['o','a','a','n'],
  ['e','t','a','e'],
  ['i','h','k','r'],
  ['i','f','l','v']
]
Return ["eat","oath"].
Note:
You may assume that all inputs are consist of lowercase letters a-z.

click to show hint.

You would need to optimize your backtracking to pass the larger test. Could you stop backtracking earlier?

If the current candidate does not exist in all words' prefix, you could stop backtracking immediately.
What kind of data structure could answer such query efficiently?
Does a hash table work? Why or why not? How about a Trie?
If you would like to learn how to implement a basic trie, please work on this problem: Implement Trie (Prefix Tree) first.
 */
public class WordSearchII {
    public List<String> findWords(char[][] board, String[] words) {
        if (board == null || words == null || board.length == 0 || words.length == 0) {
            return new ArrayList<String>();
        }

        Trie trie = new Trie();
        for (String word : words) {
            trie.insert(word);
        }

        Set<String> set = new HashSet<String>();

        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int x = 0; x != board.length; x++) {
            for (int y = 0; y != board[0].length; y++) {
                findWordsImpl(x, y, board, visited, trie, set, new StringBuilder());
            }
        }
        return new ArrayList<String>(set);
    }

    private void findWordsImpl(int x, int y, char[][] board, boolean[][] visited, Trie trie, Set<String> set, StringBuilder sb) {
        if (x >= 0 && x < board.length && y >= 0 && y < board[0].length && !visited[x][y]) {
            visited[x][y] = true;

            sb.append(board[x][y]);
            String s = sb.toString();
            if (trie.startsWith(s)) {
                if (trie.search(s)) {
                    set.add(s);
                }
                findWordsImpl(x - 1, y, board, visited, trie, set, sb);
                findWordsImpl(x + 1, y, board, visited, trie, set, sb);
                findWordsImpl(x, y - 1, board, visited, trie, set, sb);
                findWordsImpl(x, y + 1, board, visited, trie, set, sb);
            }
            sb.deleteCharAt(sb.length() - 1);
            visited[x][y] = false;
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
}