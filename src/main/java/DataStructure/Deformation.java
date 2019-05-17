package DataStructure;

import java.util.Scanner;

public class Deformation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入str1");
        String str1 = scanner.nextLine();
        System.out.println("输入str2");
        String str2 = scanner.nextLine();
        System.out.println("str1 str2 是否为变形数: "+isDeformation(str1,str2));
    }
        
        public static boolean isDeformation(String str1, String str2){

            /**
             * 如果str1 str2任意一个为null则返回为false，
             * str1 str2 长度不同则返回为false；
             */
            if(str1 == null ||  str2 == null || str1.length() != str2.length()){
                return false;
            }

            /**
             * 将字符串变为字符数组；
             * 申请一个长度为256的int数组，作为计数器，使用char数组的元素作为下标，计算每个字符出现的次数
             */
            char[] char1 = str1.toCharArray();
            char[] char2 = str2.toCharArray();
            int[] count = new int[256];

            //同一种字符，不断++，得到一个int数组
            for(int i = 0;i<char1.length;i++)
            {
                count[char1[i]]++;
            }

            //验证str2，同一种字符，不断——,如果出现减少后的值小于0，则返回false；
            for(int i = 0;i<char2.length;i++){

                if(count[char2[i]]--  ==  0){
                    return false;
                }
            }

            return true;
        }
        

}
