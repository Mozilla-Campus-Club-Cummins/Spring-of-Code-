class Gold_for_7_Days_of_Work_Solution {
    public static int cutGoldBar(int pieces) {
        int cuts = 0;
        int count = 1;
        while ((Math.pow(2, count) - 1) < pieces) { // (2^count - 1) < pieces
            cuts++;
            count++;
        }
        return cuts;
    }

    public static void main(String[] args) {
        int pieces = 7; // Gold Bar has 7 pieces connected by chain
        int cuts_req = cutGoldBar(pieces);
        System.out.print("The gold bar with " + pieces + " pieces need minimum " + cuts_req
                + " cuts, so that employer can pay a piece of gold every day.");
    }
}