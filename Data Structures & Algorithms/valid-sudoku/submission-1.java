class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            HashSet<Character> seenRow=new HashSet<>();
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] != '.' && !seenRow.add(board[i][j])){
                    return false;
                }
            }
        }
        for(int j=0;j<board[0].length;j++){
            HashSet<Character> seenColumn=new HashSet<>();
            for(int i=0;i<board.length;i++){
                if(board[i][j] != '.' && !seenColumn.add(board[i][j])){
                    return false;
                }
            }
        }
        for(int i=0;i<3;i++){ 
            for(int j=0;j<3;j++){ 
                HashSet<Character> seenSquare=new HashSet<>(); 
                for(int k=i*3;k<i*3+3;k++){ 
                    for(int l=j*3;l<j*3+3;l++){ 
                        if(board[k][l] != '.' && !seenSquare.add(board[k][l])){ 
                            return false; 
                        } 
                    } 
                } 
            } 
        }
        return true;
    }
}
