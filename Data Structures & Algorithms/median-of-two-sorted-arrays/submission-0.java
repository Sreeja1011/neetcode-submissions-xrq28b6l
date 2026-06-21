class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int merged[] = new int[(n / 2) + 1];

        int f = 0, s = 0, merptr = 0;

        while (merptr < (n / 2) + 1) {

            if (f < nums1.length && s < nums2.length) {
                if (nums1[f] < nums2[s]) {
                    merged[merptr] = nums1[f];
                    f++;
                } else {
                    merged[merptr] = nums2[s];
                    s++;
                }
            } else if (f < nums1.length) {
                merged[merptr] = nums1[f];
                f++;
            } else {
                merged[merptr] = nums2[s];
                s++;
            }

            merptr++;
        }

        double median;

        if (n % 2 == 0) {
            median = (merged[n / 2] + merged[(n / 2) - 1]) / 2.0;
        } else {
            median = merged[n / 2];
        }

        return median;
    }
}