class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int c = 0; c < 9; c++) {
            HashSet<Character> present = new HashSet<>();
            for (int r = 0; r < 9; r++) {
                if (board[r][c] == '.') continue;
                if (present.contains(board[r][c])) return false;
                present.add(board[r][c]);
            }
        }
        
        for (int r = 0; r < 9; r++) {
            HashSet<Character> present = new HashSet<>();
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == '.') continue;
                if (present.contains(board[r][c])) return false;
                present.add(board[r][c]);
            }
        }

        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                HashSet<Character> present = new HashSet<>();
                for (int bR = r * 3; bR < r * 3 + 3; bR++) {
                    for (int bC = c * 3; bC < c * 3 + 3; bC++) {
                        if (board[bR][bC] == '.') continue;
                        if (present.contains(board[bR][bC])) return false;
                        present.add(board[bR][bC]);
                    }
                }
            }
        }

        return true;
    }
}
