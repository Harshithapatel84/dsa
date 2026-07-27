class BinarySearch{
	public static void main(String[] args)
	{
		int[] arr={16, 24, 35, 40, 82};
		int key=16;
		int low=0;
		int high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			 if (arr[mid] == key) {
                System.out.println("Element Found");
                return;
            }

            if (key > arr[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }

        System.out.println("Element Not Found");
    }
}
