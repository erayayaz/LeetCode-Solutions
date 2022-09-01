class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0 ; i < board.length; i++) {
            Set<Character> charSet = new HashSet<>();
            for (int j = 0; j< board.length; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if(charSet.contains(board[i][j])) {
                    return false;
                }
                charSet.add(board[i][j]);
            }

        }

        for (int i = 0 ; i < board.length; i++) {
            Set<Character> charSet = new HashSet<>();
            for (int j = 0; j< board.length; j++) {
                if (board[j][i] == '.') {
                    continue;
                }
                if(charSet.contains(board[j][i])) {
                    return false;
                }
                charSet.add(board[j][i]);
            }

        }

        for (int i = 0 ; i < board.length; i=i+3) {
            for (int j = 0; j < board.length; j=j+3) {
                Set<Character> charSet = new HashSet<>();

                for (int l = i, count = 0; count < 3; count++, l++) {
                    for(int k = j, cnt = 0; cnt < 3; cnt++, k++) {
                        if (board[l][k] == '.') {
                            continue;
                        }
                        if(charSet.contains(board[l][k])) {
                            return false;
                        }
                        charSet.add(board[l][k]);
                    }
                }

            }

        }
        return true;
    }
}