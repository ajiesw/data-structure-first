# 数据结构堆栈的使用

将中缀表达式转换为后缀表达式，或者前缀表达式
并且计算结果，可以使用数组或链表的方式实现

- 从头到尾读取中缀表达式的每个对象，对不同对象按不同的情况处理
    1. 运算数：直接输出
    2. 左括号：压入堆栈
    3. 右括号：将栈顶的运算符弹出并输出，知道遇到左括号（出栈不输出）
    4. 运算符：
        - 若优先级大于栈顶运算符是，压入堆栈
        - 若优先级小于等于栈顶运算符时，将栈顶运算符弹出并输出；在比较新的栈顶运算符，知道该运算符大于栈顶运算符优先级为止，然后将该运算符压入堆栈
    5. 若各对象处理完毕，则把堆栈中留存的运算符一并输出