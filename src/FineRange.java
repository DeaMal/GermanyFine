public enum FineRange {
    FINE_1_TO_10(1,10, 30, 20),
    FINE_11_TO_15(11,15,50, 40),
    FINE_16_TO_20(16,20,70, 60),
    FINE_21_TO_25(21,25,115, 100),
    FINE_26_TO_30(26,30,180, 150),
    FINE_31_TO_40(31,40,260, 200),
    FINE_41_TO_50(41,50,400, 320),
    FINE_51_TO_60(51,60,560, 480),
    FINE_61_TO_70(61,70,700, 600),
    FINE_70_AND_MORE(70, Integer.MAX_VALUE,800, 700);

    private final int start;
    private final int end;
    private final int fineCountry;
    private final int fineTown;

    FineRange(int start, int end, int fineCountry, int fineTown) {
        this.start = start;
        this.end = end;
        this.fineCountry = fineCountry;
        this.fineTown = fineTown;
    }

    public static FineRange getRange(int input) {
        for (FineRange range : FineRange.values()) {
            if (input >= range.start && input <= range.end) {
                return range;
            }
        }
        throw new IllegalArgumentException("Incorrect input!");
    }

    public int getFineCountry() {
        return fineCountry;
    }

    public int getFineTown() {
        return fineTown;
    }
}
