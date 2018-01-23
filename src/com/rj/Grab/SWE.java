package com.rj.Grab;

public class SWE {

    class RowAbc {
        boolean[] ABC;
        boolean isABCAvailableForThree = true;

        RowAbc() {
            this.ABC = new boolean[3];
        }
    }

    class RowDefg {
        boolean[] DEFG;
        boolean isDEFGAvailableForThree = true;

        RowDefg() {
            this.DEFG = new boolean[4];
        }
    }

    class RowHjk {
        boolean[] HJK;
        boolean isHJKAvailableForThree = true;

        RowHjk() {
            this.HJK = new boolean[3];
        }
    }


    public int solution(int N, String S) {

        int seatsForThree = 0;

        RowAbc[] columnAbc = new RowAbc[N];
        RowDefg[] columnDefg = new RowDefg[N];
        RowHjk[] columnHjk = new RowHjk[N];

        if (S == null || S.equalsIgnoreCase("") || S.equalsIgnoreCase(""))
            return 3;

        String[] seats = S.split(" ");
        for (String seat : seats) {
            int row = Integer.parseInt(seat.substring(0, seat.length() - 1)) - 1;
            columnAbc[row] = new RowAbc();
            columnDefg[row] = new RowDefg();
            columnHjk[row] = new RowHjk();

            switch (seat.charAt(seat.length() - 1)) {
                case 'A':
                    columnAbc[row].ABC[0] = true;
                    columnAbc[row].isABCAvailableForThree = false;
                    break;
                case 'B':
                    columnAbc[row].ABC[1] = true;
                    columnAbc[row].isABCAvailableForThree = false;
                    break;
                case 'C':
                    columnAbc[row].ABC[2] = true;
                    columnAbc[row].isABCAvailableForThree = false;
                    break;
                case 'D':
                    columnDefg[row].DEFG[0] = true;
                    break;
                case 'E':
                    columnDefg[row].DEFG[1] = true;
                    columnDefg[row].isDEFGAvailableForThree = false;
                    break;
                case 'F':
                    columnDefg[row].DEFG[2] = true;
                    columnDefg[row].isDEFGAvailableForThree = false;
                    break;
                case 'G':
                    columnDefg[row].DEFG[3] = true;
                    break;
                case 'H':
                    columnHjk[row].HJK[0] = true;
                    columnHjk[row].isHJKAvailableForThree = false;
                    break;
                case 'J':
                    columnHjk[row].HJK[1] = true;
                    columnHjk[row].isHJKAvailableForThree = false;
                    break;
                case 'K':
                    columnHjk[row].HJK[2] = true;
                    columnHjk[row].isHJKAvailableForThree = false;
                    break;
            }
        }
        for (int i = 0; i < N; i++) {

            if (columnAbc[i].isABCAvailableForThree) ++seatsForThree;
            if (columnDefg[i].isDEFGAvailableForThree) ++seatsForThree;
            if (columnHjk[i].isHJKAvailableForThree) ++seatsForThree;
        }
        return seatsForThree;
    }
}
