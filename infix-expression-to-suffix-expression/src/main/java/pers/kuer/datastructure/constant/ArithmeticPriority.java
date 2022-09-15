package pers.kuer.datastructure.constant;

/**
 * ArithmeticPriority
 *
 * @author wangkj
 * @date 2022/9/15 11:36
 */
public enum ArithmeticPriority {
    // 四则运算优先级
    ADD(1, "+"),
    MINUS(1, "-"),
    MULTIPLY(2, "*"),
    DIVISION(2, "/"),
    LEFT(3, "("),
    RIGHT(0, ")");

    /**
     * 优先级
     */
    private int priority;

    /**
     * 符号
     */
    private String symbol;

    ArithmeticPriority(int priority, String symbol) {
        this.priority = priority;
        this.symbol = symbol;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
