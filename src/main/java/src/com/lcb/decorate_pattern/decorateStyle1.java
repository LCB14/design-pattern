package src.com.lcb.decorate_pattern;

/**
 * 装饰1
 */
public class decorateStyle1 extends Decorate {

    @Override
    public void operation() {

        super.operation();
        System.out.println("给待装饰对象穿上袜子...");
    }
}
