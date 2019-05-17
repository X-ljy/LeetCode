package DataStructure;

public class leetcode74 {

    /**
     * 由于这个二位数组是按照每行整数从左到右升序排序的，
     * 所以可以先 target 与 数组右上角的数据比较大小。
     * 如果target大于右上角的，则这一行都不存在要找的数据，可以跳过这一行，接着从下一行的最右边开始。
     *
     * 如果target小于右上角的，则证明target所在的那列不可能存在搜索的数据了，所以可以将列数减一，继续比较。
     *
     * @param matrix
     * @param target
     * @return
     */
    public boolean searchMatrix(int[][] matrix,int target){
        //判断长度为零的情况
        if(matrix.length == 0){
            return false;
        }

        //初始化行标为0
        int rowIndex = 0;
        //初始化列标为最右边
        int cloIndex = matrix[0].length -1;
        //由于行标一直 ++ 列标一直 ——
        //所以进入循环的条件变为行标小于matrix.length(二位数组的行数)，列标大于等于 0
        while (rowIndex < matrix.length && cloIndex >= 0){

            /**
             *      * 由于这个二位数组是按照每行整数从左到右升序排序的，
             *      * 所以可以先 target 与 数组右上角的数据比较大小。
             *      * 如果target大于右上角的，则这一行都不存在要找的数据，可以跳过这一行，接着从下一行的最右边开始。
             *      *
             *      * 如果target小于右上角的，则证明target所在的那列不可能存在搜索的数据了，所以可以将列数减一，继续比较。
             *      *
             */
            if(target == matrix[rowIndex][cloIndex] ){
                return true;
            }else if(target > matrix[rowIndex][cloIndex]){
                rowIndex++;
            }else {
                cloIndex--;
            }
        }
        return false;
    }
}
