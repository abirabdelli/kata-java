package model;

public record Dice(int d1, int d2, int d3, int d4, int d5) {
    public static final int DEFAULT_LENGTH = 5;

    public int[] toArray() {
        return new int[]{d1, d2, d3, d4, d5};
    }

    public int getLength() {
        return DEFAULT_LENGTH;
    }

}



