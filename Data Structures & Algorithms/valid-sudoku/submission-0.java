class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String>hs=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char num=board[i][j];
                if(num=='.'){
                    continue;
                }
                String rowKey=num+"in row"+i;
                String colKey=num+"in col"+j;
                String squ=num +"in box"+ i/3+ " - "+j/3;
                if(!hs.add(rowKey)||!hs.add(colKey)||!hs.add(squ)){
                    return false;
                } 
            }
        }
        return true;
    }
}
