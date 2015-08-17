/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/19
 * Time: 10:32
 */
/*
The set [1,2,3,…,n] contains a total of n! unique permutations.

By listing and labeling all of the permutations in order,
We get the following sequence (ie, for n = 3):

"123"
"132"
"213"
"231"
"312"
"321"
Given n and k, return the kth permutation sequence.

Note: Given n will be between 1 and 9 inclusive.
 */
public class PermutationSequence {
    public String getPermutation(int n, int k) {
        int[] factorial = new int[n];
        factorial[0] = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i != factorial.length; i++) {
            factorial[i] = factorial[i - 1] * (i + 1);
        }
        for (int i = 0; i != n; i++) {
            sb.append(i + 1);
        }
        k--;
        permutate(sb, k, factorial);
        return sb.toString();
    }

    void permutate(StringBuilder s, int k, int[] factorial) {
        for (int i = factorial.length - 1; i >= 0; i--) {
            if (k >= factorial[i]) {
                int round = k / factorial[i];
                k = k % factorial[i];

                for (int j = 0; j != round; j++) {
                    int pos = s.length() - i - 2;
                    char temp = s.charAt(pos);
                    s.setCharAt(pos, s.charAt(pos + j + 1));
                    s.setCharAt(pos + j + 1, temp);
                }
                if (k == 0) {
                    return;
                }
                permutate(s, k, factorial);
                break;
            }
        }
    }
}
