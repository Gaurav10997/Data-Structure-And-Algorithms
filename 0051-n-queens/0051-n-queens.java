class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean[][] matrix = new boolean[n][n];
        return NQueens(matrix,0);
    }
    
    static List<List<String>> NQueens(boolean[][] matrix, int r) {
    List<List<String>> ans = new ArrayList<>();
    if (r == matrix.length) {
        ans.add(queens(matrix,r));
        return ans;
    }
    for (int c = 0; c < matrix.length; c++) {
        if (isSafe(matrix, r, c)) {
            matrix[r][c] = true;
            ans.addAll(NQueens(matrix, r + 1));
            //adding all answers together from different function calls because new list created everytime.
            matrix[r][c] = false;
            //backtracking
        }
    }
    return ans;
}
 static boolean isSafe(boolean[][] matrix, int r, int c) {
    //Vertical up
    for (int i = 0; i <r; i++) {
        if (matrix[i][c]) {
            return false;
        }
    }
    //Diagonal left
	
    int minLeft = Math.min(r,c);
    for (int i = 0; i <= minLeft; i++) {
        if (matrix[r - i][c - i]) {
            return false;
        }
    }
    //Diagonal right
	
    int maxRight = Math.min(r, matrix.length-c-1)  ;
    for (int i = 0; i <=maxRight; i++) {
        if (matrix[r - i][c + i]) {
            return false;
        }
    }
    return true;
}
static List<String> queens(boolean[][] matrix, int r) {
    List<String> ans = new ArrayList<>();
    //This generate Arraylist in form of Q and . by comparing with boolean matrix
    for (boolean[] row : matrix) {
        String str="" ;
        for (boolean element : row) {
            if (element == true) {
                str+="Q";
            } else {
                str+=".";
            }
        }
        ans.add(str);
    }
    return ans;
}
}