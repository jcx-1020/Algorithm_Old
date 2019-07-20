package leetcode;


/**
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 */
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        merge(nums1, m, nums2, n);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null || nums1.length == 0) {
            System.out.println("[]");
            return;
        }
        if (m == 0 && nums1.length==n){
            printArray(nums2, n);
            return;
        }
        if (nums2 == null || nums2.length == 0) {
            printArray(nums1, m);
            return;
        }
        int len = nums1.length;
        int i = m - 1, j = n - 1;
        while (i >= 0 && j >= 0){
            if (nums1[i] > nums2[j]) {
                nums1[len - 1] = nums1[i];
                len--;
                i--;
            } else {
                nums1[len - 1] = nums2[j];
                len--;
                j--;
            }
        }
        /*for (int i = m - 1, j = n - 1; i > 0 || j > 0; ) {
            if (nums1[i] > nums2[j]) {
                nums1[len - 1] = nums1[i];
                len--;
                i--;
            } else {
                nums1[len - 1] = nums2[i];
                len--;
                j--;
            }
        }*/
        printArray(nums1, nums1.length);
    }

    public static void printArray(int[] arr, int l) {
        System.out.print("[");
        for (int i = 0; i < l; i++) {
            if (i == l - 1) {
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ",");
            }
        }
    }

}
