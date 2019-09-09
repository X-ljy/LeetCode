package code_interview_zuo;

import java.util.Stack;

/**
 * @author : 夕
 * @date : 2019/9/9
 */
public class MyStack {
    /**
     * 实现一个特殊的栈，在实现栈的基本功能的基础上，在实现返回最小元素的操作
     *
     * 要求：pop push getMin 操作时间复杂度都为O(1)
     */

    /**
     * 使用一个栈保存当前栈中的数据，另一个栈保存每一步的最小值。
     * 在数据栈的操作过程中，保持最小栈的有效性。
     */
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public MyStack(Stack stackData,Stack stackMin){
        this.stackData = stackData;
        this.stackMin = stackMin;
    }

    public int  pop(){
        if(this.stackData.empty()){
            throw new RuntimeException("栈为空");
        }
        int value = stackData.pop();
        if(value == this.stackMin.peek()){
            this.stackMin.pop();
        }
        return value;
    }

    public void push(int value){
        if(this.stackMin.empty()){
            this.stackMin.push(value);
        } else if(value <= this.stackMin.peek()){
            stackMin.push(value);
        }
        this.stackData.push(value);
    }

    public int getMin(){
        if(this.stackMin.empty()){
            throw new RuntimeException("最小栈为空");
        }
        return this.stackMin.peek();
    }
}
