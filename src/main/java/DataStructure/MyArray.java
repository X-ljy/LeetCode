package DataStructure;

/**
 * @author 夕
 * @date 2019/7/21
 */
public class MyArray {
    private int[] data;
    private int size;

    /**
     * 构造函数，传入容量capacity构造MyArray
     * @param capacity
     */
    public MyArray(int capacity){
        data = new int[capacity];
        size = 0;
    }

    /**
     * 无参构造函数，默认数组的容量capacity = 10
     */
    public MyArray(){
        this(10);
    }

    /**
     * 获取数组中元素个数
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * 获取数组的容量
     * @return
     */
    public int getCapacity(){
        return data.length;
    }

    /**
     * 返回数组是否为空
     * @return
     */
    public boolean isEmpty(){
        return size == 0;
    }

    
}

