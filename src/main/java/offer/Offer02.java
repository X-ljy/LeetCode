package offer;

/**
 * @author : 夕
 * @date : 2019/8/5
 */
public class Offer02 {
    /**
     * 题目描述
     * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
     * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
     */

    public String replaceSpace(StringBuffer str) {
        //判断是否有空格，如果有则返回下标，没有则返回 -1
        int index = str.indexOf(" ");
        while(index != -1){
            str.replace(index,index+1,"%20");
            //从index之后判断是否有空格
            index = str.indexOf(" ",index);
        }
        String result = str.toString();
        return result;
    }

    public String replaceSpace01(StringBuffer str) {
        int n = str.length();//字符串的长度
        int ii = 0;//空格的个数ii
        for(int i = 0;i < n;i++){
            //检测空格
            if(str.charAt(i)==' '){
                ii++;
            }
        }

        // nn = 3 * ii + (n - ii)
        int nn = 2 * ii + n;//根据空格的个数，得到新数组的长度

        int index = nn -1;
        char[] ct = new char[nn];//新建数组
        while(n > 0){
            if(str.charAt(n - 1) != ' '){
                //如果不是空格
                ct[index--] = str.charAt(n-1);
            }
            else{
                //如果是空格
                ct[index--] = '0';
                ct[index--] = '2';
                ct[index--] = '%';
            }
            //取下一个字符
            n--;
        }
        return String.valueOf(ct);//将字符数组转为String类型后返回

    }

}
