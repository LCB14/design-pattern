package src.com.lcb.adapter_pattern_class;

/**
 * 类适配器
 * <p>
 * 类适配器需要继承src类这一点算是一个缺点,因为这要求dst必须是接口，有一定局限性;
 * 且src类的方法在Adapter中都会暴露出来，也增加了使用的成本。
 * 但同样由于其继承了src类，所以它可以根据需求重写src类的方法，使得Adapter的灵活性增强了。
 */
public class AdapterPattern {

    public static void main(String[] args) {

        System.out.println("===============类适配器==============");
        Mobile mobile = new Mobile();
        mobile.charging(new VoltageAdapter());

    }

}
