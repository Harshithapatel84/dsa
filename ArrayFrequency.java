class ArrayFrequency {
    public static void main(String... values) {

        int arr[] = {1,2,2,3,4,5,5,6};

        for(int i = 0; i < arr.length; i++) {

            boolean visited = false;
            for(int k = 0; k < i; k++) {
                if(arr[i] == arr[k]) {
                    visited = true;
                    break;
                }
            }

            if (visited) continue;

            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            System.out.println(arr[i] + "->" + count);
        }
    }
}