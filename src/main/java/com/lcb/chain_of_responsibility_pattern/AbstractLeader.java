package com.lcb.chain_of_responsibility_pattern;

/**
 * @author lichangbao
 */
public abstract class AbstractLeader {

    private AbstractLeader nextLeader;

    public AbstractLeader getNextLeader() {

        return nextLeader;
    }

    public void setNextLeader(AbstractLeader nextLeader) {

        this.nextLeader = nextLeader;
    }

    abstract void handler(Files file);
}