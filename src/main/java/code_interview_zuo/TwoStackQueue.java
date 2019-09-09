package code_interview_zuo;

import java.util.Stack;

/**
 * @author : 夕
 * @date : 2019/9/9
 */
public class TwoStackQueue {

    /**
     * 编写一个类，用两个栈实现队列，支持队列的基本操作（add,poll,peek）
     */

    /**
     *思路：设置两个栈，一个栈只用来压入，一个栈只用来弹出，
     * 栈是先进后出的，队列是先进先出的
     * 当一组数据入栈（压入栈）后，在从当前栈（压入栈）弹出进入到下一个栈（弹出栈）后，数据此时的弹出顺序就是对应队列的出队顺序
     * 这样设计的队列必须满足
     * 1.用来压入的栈 如果想要往 用来弹出的栈中 压入数据，则必须将 压入栈 中所有数据全部压入到 弹出栈
     * 2.用来弹出的栈如果不为空，那么用来压入的栈绝对不能向弹出栈压入数据。
     */
    private Stack<Integer> stackPush;
    private Stack<Integer> stackPop;

    public TwoStackQueue(){
        stackPush = new Stack<>();
        stackPop = new Stack<>();
    }

    public void add(int value){
        stackPush.push(value);
    }

    public int poll(){
        if(stackPop.empty() && stackPush.empty()){
            throw new RuntimeException("Queue is empty!");
        }else if (stackPop.empty()){
            while (!stackPush.empty()){
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.pop();
    }

    public int peek(){
        if(stackPop.empty() && stackPush.empty()){
            throw  new RuntimeException("Queue is empty!");
        }else if(stackPop.empty()){
            while (!stackPush.empty()){
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.peek();
    }

}
