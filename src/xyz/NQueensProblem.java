package xyz;

public class NQueensProblem {
	    static int N = 4;
	    static int[] pos = new int[N];

	    public static void main(String[] args) {
	        solve(0);
	    }

	    static void solve(int row) {
	        if (row == N) {
	            printSolution();
	            return;
	        }

	        for (int col = 0; col < N; col++) {
	            if (isSafe(row, col)) {
	                pos[row] = col;
	                solve(row + 1);
	            }
	        }
	    }

	    static boolean isSafe(int row, int col) {
	        for (int i = 0; i < row; i++) {
	            if (pos[i] == col || Math.abs(pos[i] - col) == Math.abs(i - row))
	                return false;
	        }
	        return true;
	    }

	    static void printSolution() {
	        for (int i = 0; i < N; i++) {
	            for (int j = 0; j < N; j++) {
	                if (pos[i] == j) System.out.print("Q ");
	                else System.out.print(". ");
	            }
	            System.out.println();
	        }
	        System.out.println();
	    }
	}
