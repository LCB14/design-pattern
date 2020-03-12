package src.com.lcb.builder_pattern;

/**
 * 扮演指挥者的角色，控制建造过程。
 */
public class PersonDirector {

    public void constructPerson(PersonBuilder pb) {

        //按照 头部--->身体--->四肢 的顺序创建人物  
        pb.buildHead();
        pb.buildBody();
        pb.buildFoot();
    }
}  