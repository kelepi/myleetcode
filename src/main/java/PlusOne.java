/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/4
 * Time: 10:05
 */
/*
Given a non-negative number represented as an array of digits, plus one to the number.

The digits are stored such that the most significant digit is at the head of the list.
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0) {
            return digits;
        }
        int add = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (add == 0) {
                break;
            }
            digits[i] = (digits[i] + add) % 10;
            add = digits[i] == 0 ? 1 : 0;
        }
        if (add == 0) {
            return digits;
        } else {
            int[] re = new int[digits.length + 1];
            re[0] = 1;
            for (int i = 0; i != digits.length; i++) {
                re[i + 1] = digits[i];
            }
            return re;
        }
    }
}
