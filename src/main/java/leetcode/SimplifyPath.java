package leetcode;

import java.util.Stack;

/**
 * Created by Patrick on 15/5/2.
 */
/*
Given an absolute path for a file (Unix-style), simplify it.

For example,
path = "/home/", => "/home"
path = "/a/./b/../../c/", => "/c"
 */
public class SimplifyPath {
    public String simplifyPath(String path) {
        String strs[] = path.split("/");
        Stack<String> stack = new Stack<String>();
        for (String str : strs) {
            str = str.trim();
            if (str.equals("..")) {
                if (!stack.empty()) {
                    stack.pop();
                }
            } else if (!str.isEmpty() && !str.equals(".")) {
                stack.push(str);
            }
        }
        StringBuilder sb = new StringBuilder("/");
        if (!stack.empty()) {
            for (String str : stack) {
                sb.append(str).append("/");
            }
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
}
