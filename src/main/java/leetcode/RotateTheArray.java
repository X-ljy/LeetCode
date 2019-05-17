package leetcode;

/**
 * @author 夕
 * @date 2019/4/16
 */
public class RotateTheArray {

    public static int[] rotate(int[] nums, int k) {

        //如果k值等于length ,则表示进行了一次循环，数组并未移位，所以要将k 值取余
        k %= nums.length;
        //设置临时数组存放将要从末尾移位的元素
        int[] temp = new int[k];
        for(int i = 0; i<k ; i++  ){
            temp[k-1-i] = nums[nums.length-1-i];
        }
        //将数组中的元素进行移位，只移动不会出现移动到头部的元素。
        //并且先从下标最大的元素开始移动，防止出现，下标小的元素 掩盖 需要移动的 下标大的元素的值
        for(int j = nums.length-1-k; j >= 0; j--){
            nums[k+j] = nums[j] ;
        }

        //拼接出移动的数组
        for(int t = 0; t<k ;  t++ ){
            nums[t] = temp[t];
        }

        return nums;

    }

    public static void main(String[] args) {
        int[] nums = rotate(new int[]{1, 2, 3, 4, 5, 6, 7},3);
        for (int i =0 ; i < nums.length; i++){
            System.out.println("nums"+nums[i]);
        }
    }
}
