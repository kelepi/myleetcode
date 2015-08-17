package leetcode;

/**
 * Created by Patrick on 15/6/13.
 */
public class RectangleArea {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int overlapArea = 0;
        int maxLeftX = Math.max(A, E);
        int maxLeftY = Math.max(B, F);

        int minRightX = Math.min(C, G);
        int minRightY = Math.min(D, H);

        if (maxLeftX > minRightX || maxLeftY > minRightY) {
            overlapArea = 0;
        } else {
            overlapArea = (minRightX - maxLeftX) * (minRightY - maxLeftY);
        }

        return (D - B) * (C - A) + (H - F) * (G - E) - overlapArea;
    }
}
