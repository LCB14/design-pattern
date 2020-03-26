package com.lcb.chain_of_responsibility_pattern;

public abstract class Lingdao {

    private Lingdao nextLingdao;

    public Lingdao getNextLingdao() {

        return nextLingdao;
    }

    public void setNextLingdao(Lingdao nextLingdao) {

        this.nextLingdao = nextLingdao;
    }

    abstract void chuli(Files file);
}