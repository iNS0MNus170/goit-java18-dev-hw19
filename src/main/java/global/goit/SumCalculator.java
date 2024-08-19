package global.goit;

public class SumCalculator {

    int sum(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        }
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += i;
        }
        return res;
    }
}

