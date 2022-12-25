package com.patterns.adapter;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        super(peg.getWidth());
        this.peg = peg;
    }

    public double getRadius() {
        return peg.getWidth() * Math.sqrt(2) / 2;
    }
}
//Strategy dùng khi có một họ các thuật toán. Khi muốn sử dụng một thuật toán nào đó.