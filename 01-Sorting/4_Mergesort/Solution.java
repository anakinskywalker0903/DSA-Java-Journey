class Solution {

    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    public void mergeSort(int[] nums, int low, int high) {

        if (low >= high) {
            return;
        }

        int mid = (low + high) / 2;

        mergeSort(nums, low, mid);
        mergeSort(nums, mid + 1, high);

        merge(nums, low, mid, high);
    }

    public void merge(int[] nums, int low, int mid, int high) {

        int i = low;
        int j = mid + 1;

        ArrayList<Integer> temp = new ArrayList<>();

        while (i <= mid && j <= high) {

            if (nums[i] <= nums[j]) {
                temp.add(nums[i]);
                i++;
            } else {
                temp.add(nums[j]);
                j++;
            }
        }

        while (i <= mid) {
            temp.add(nums[i]);
            i++;
        }

        while (j <= high) {
            temp.add(nums[j]);
            j++;
        }

        for (int k = low; k <= high; k++) {
            nums[k] = temp.get(k - low);
        }
    }
}