package com.java.collection.test;

public enum Ranks {
    RANK1(2),RANK2(3),RANK3(1);

    private int rank;

    Ranks(int rank) {
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
