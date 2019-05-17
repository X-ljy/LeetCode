package leetcode;

public class leetcode4 {


    static  public double FindMedianSortedArrays(int[] nums1, int[] nums2)
    {
        int length1 = nums1.length;
        int length2 = nums2.length;
        int length = length1 + length2;
        int[] nums = new int[length];

        for (int i = 0 ,i1 = 0 , i2 = 0;i < length; ++i)
        {
            if (i1 == length1)
            {
                nums[i] = nums2[i2++];
            }
            else if (i2 == length2)
            {
                nums[i] = nums1[i1++];
            }
            else
            {
                if (nums1[i1] < nums2[i2])
                {
                    nums[i] = nums1[i1++];
                }
                else
                {
                    nums[i] = nums2[i2++];
                }
            }
        }

        if (length % 2 != 0) {
            return nums[length / 2];
        }
        else
        {
            int l = length / 2;
            return (nums[l - 1] + nums[l]) / 2.0;
        }
    }

    public static void main(String[] args){

        int[] a  = {1,3,4};
        int[] b = {2};
        System.out.println(FindMedianSortedArrays(a,b));

    }
}
