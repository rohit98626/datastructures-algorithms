// leetcode 3453 separate squares 1
package Array;

public class separatesquare {

    public double separateSquares(int[][] squares) {
        double totalArea = 0.0;
        double min = Double.MAX_VALUE;
        double max = -Double.MAX_VALUE;

        for (int[] square : squares) {
            double len = square[2];
            totalArea += len * len;
            min = Math.min(min, square[1]);
            max = Math.max(max, square[1] + len);
        }

        double target = totalArea / 2.0;
        double low = min, high = max;

        while (high - low > 1e-5) {
            double mid = (low + high) / 2.0;

            if (areaBelow(mid, squares) < target) {
                low = mid;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public double areaBelow(double mid, int[][] squares) {
        double area = 0.0;

        for (int[] square : squares) {
            double y = square[1];
            double len = square[2];

            if (mid >= y + len) {
                area += len * len;
            } else if (mid > y) {   // ✅ CRITICAL FIX
                area += len * (mid - y);
            }
        }
        return area;
    }

    // ✅ main MUST be inside the class
    public static void main(String[] args) {

        separatesquare sol = new separatesquare();

        int[][] squares = {
            {0, 0, 2},
            {0, 1, 2}
        };

        double result = sol.separateSquares(squares);
        System.out.println("Cut line y = " + result);
    }
}
