class mean {
    static double Mean(int x[]) {
        double q = x[0] + x[1] + x[2] + x[3];
        double answer = q / x.length;
        return answer;
    }
}


class Main {
    public static void main(String[] args) {
        System.out.println(9999);
        int[] y = {1, 2, 3, 6};
        System.out.print("the mean of 1 2 3 6 is: ");
        mean.Mean(y);
        System.out.println();
    }
}


