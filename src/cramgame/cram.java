package oday;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class cram {
    static ArrayList<Integer> array;

    public static int calculateGrundy(int n) {
        array = new ArrayList<Integer>();
        if (n != 0 && n != 1) {
            for(int i = 0; i <= n; ++i) {
                array.add(i, calculate(i));
            }

            return (Integer)array.get(n);
        } 
            return 0; 
    }

    public static int calculate(int n) {
        if (n != 0 && n != 1) {
            Set<Integer> Set = new HashSet<Integer>();

            for(int i = 0; i < n / 2; ++i) {
                Set.add((Integer)array.get(n - i - 2) ^ (Integer)array.get(i));
            }

            return calculateMex(Set);
        }
            return 0;
    }

    public static int calculateMex(Set<Integer> Set) {
        int Mex;
        for(Mex = 0; Set.contains(Mex); ++Mex) {
        }
        return Mex;
    }

    public static void main(String[] args) {
        System.out.println(calculateGrundy(100));
    }
}

	

