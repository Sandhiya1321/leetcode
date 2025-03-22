import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> list = new ArrayList<>();
        int ptr = 0, ptr1 = 0;

        while (ptr < nums1.length && ptr1 < nums2.length) {
            if (nums1[ptr][0] == nums2[ptr1][0]) {
                list.add(new int[]{nums1[ptr][0], nums1[ptr][1] + nums2[ptr1][1]});
                ptr++;
                ptr1++;
            } else if (nums1[ptr][0] < nums2[ptr1][0]) {
                list.add(new int[]{nums1[ptr][0], nums1[ptr][1]});
                ptr++;
            } else {
                list.add(new int[]{nums2[ptr1][0], nums2[ptr1][1]});
                ptr1++;
            }
        }

        while (ptr < nums1.length) {
            list.add(new int[]{nums1[ptr][0], nums1[ptr][1]});
            ptr++;
        }

        while (ptr1 < nums2.length) {
            list.add(new int[]{nums2[ptr1][0], nums2[ptr1][1]});
            ptr1++;
        }

        return list.toArray(new int[list.size()][]);
    }
}
