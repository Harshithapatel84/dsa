class EvenOdd {
    public static void main(String... values) {

        int num[] = {1,2,3,4};
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < num.length; i++) {

            if (num[i] % 2 == 0) {
                evenSum += num[i];
            } else {
                oddSum += num[i];
            }
        }

        System.out.println("sum of even num is:"+oddSum);
        System.out.println("sum of odd num is:"+evenSum);
    }
}