package src.com.lcb.memento_pattern;
/*
 * 
 * 用于管理备忘对象
 * 
 * */
public class MemoManager {
	
    MemoBean memento;

    public MemoBean getMemento() {
        return memento;
    }

    public void setMemento(MemoBean memento) {
        this.memento = memento;
    }
}