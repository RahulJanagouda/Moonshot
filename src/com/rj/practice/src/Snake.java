package com.rj.practice.src;

import java.util.LinkedList;

public class Snake{
    static int N = 6;
    static int M = 6;
    int[][] matrix = new int[N][M];
    Pair[][] mark = new Pair[N][M];


    class Pair{
        public int x;
        public int y;
        public Pair(int xVal,int yVal){
            x = xVal;
            y = yVal;
        }
    }

    public static void main(String[] args){
        Snake sn = new Snake();
        sn.matrix[0] = new int[]{1,1,1,1,1,1};
        sn.matrix[1] = new int[]{1,1,0,0,0,1};
        sn.matrix[2] = new int[]{1,0,1,1,1,1};
        sn.matrix[3] = new int[]{1,0,1,0,0,0};
        sn.matrix[4] = new int[]{1,0,1,1,3,0};
        sn.matrix[5] = new int[]{1,0,0,0,0,0};

        sn.findRoute();
    }

    public  void findRoute(){
        LinkedList<Pair> visitList = new LinkedList<Pair>();
        visitList.addFirst(new Pair(0,0));
        mark[0][0] = new Pair(0,0);
        Pair found;
        while(!visitList.isEmpty()){
            Pair pair = visitList.removeLast();
            found = getNeighbords(pair.x,pair.y,pair,visitList);
            if(found != null){
                trace(found);
                break;
            }
        }
    }
    public  void trace(Pair dest){
        int x = dest.x;
        int y = dest.y;
        Pair parent;
        while(!(x == 0 && y == 0)){
            System.out.println(x+" : "+y);
            parent = (mark[x][y]);
            x = parent.x;
            y = parent.y;
        }
    }

    public  Pair getNeighbords(int x,int y,Pair parent,LinkedList<Pair> queue ){
        //Horizontal range
        int xMin = Math.max(x-1, 0);
        int xMax = Math.min(x+1,M-1);
        int yMin = Math.max(y-1,0);
        int yMax = Math.min(y+1,N-1);
        for(int xp = xMin; xp <= xMax; xp++){
            for(int yp = yMin; yp <= yMax; yp++){
                //visited?
                if(mark[xp][yp] != null)
                    continue;

                mark[xp][yp] = parent;

                //passable?
                if(matrix[xp][yp] == 1){
                    queue.addFirst(new Pair(xp,yp));
                }
                //goal?
                if(matrix[xp][yp] == 3){
                    System.out.println("found: "+x+":"+y);
                    return new Pair(xp,yp);
                }
            }
        }
        return null;
    }
}