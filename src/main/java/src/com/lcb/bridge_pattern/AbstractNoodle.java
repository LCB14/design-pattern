package src.com.lcb.bridge_pattern;

/**
 * 桥接模式的核心部分
 */
public abstract class AbstractNoodle {

    //组合一个peppery变量，用于将该维度的变化独立出来
    protected Peppery style;

    //用于桥接“辣味”
    public AbstractNoodle(Peppery style) {

        this.style = style;
    }

    public abstract void eat();
}
