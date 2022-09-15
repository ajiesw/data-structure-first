package pers.kuer.datastructure.stack;

/**
 * Stack
 *
 * @author wangkj
 * @date 2022/9/15 17:09
 */
public interface Stack<T> {

    /**
     *
     * 堆栈是否为空
     *
     * @description:
     * @param
     * @return:
     * @author: wangkj6
     * @time: 2022/9/15 17:32
     */
    boolean isEmpty();

    /**
     *
     * 堆栈是否已满
     *
     * @description:
     * @param
     * @return:
     * @author: wangkj6
     * @time: 2022/9/15 17:32
     */
    boolean isFull();

    /**
     *
     * 入栈
     *
     * @description:
     * @param element
     * @return:
     * @author: wangkj6
     * @time: 2022/9/15 17:34
     */
    void push(T element);

    /**
     *
     * 出栈
     *
     * @description:
     * @param
     * @return:
     * @author: wangkj6
     * @time: 2022/9/15 17:34
     */
    T pop();
}
