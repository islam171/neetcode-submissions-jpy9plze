class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, HashSet<Character>> map = new HashMap<>();

        int count = 0;
        for(int i = 0; i < board.length; i++){
            HashSet<Character> rowBlock = new HashSet<>();
            int k = 0;
            for(int j = 0; j < board.length; j++){
                if(board[i][j] != '.'){
                    rowBlock.add(board[i][j]);
                    k++;
                }
            }
            if(k != rowBlock.size()){
                return false;
            }

            HashSet<Character> columnBlock = new HashSet<>();
            k = 0;
            for(int j = 0; j < board.length; j++){
                if(board[j][i] != '.'){
                    columnBlock.add(board[j][i]);
                    k++;
                }
            }
            if(k != columnBlock.size()){
                return false;
            }

            for(int j = 0; j < board.length; j++){
                int blockNum = (i/3) * 3 + (j/3);
                if(board[i][j] != '.') {
                    if(map.containsKey(blockNum)){
                        HashSet<Character> hash = map.get(blockNum);
                        hash.add(board[i][j]);
                        map.put(blockNum, hash);
                        count++;
                    }else{
                        HashSet<Character> hash = new HashSet<>();
                        hash.add(board[i][j]);
                        map.put(blockNum, hash);
                        count++;
                    }

                }
            }
        }

        int sum = 0;
        for(int i = 0; i < 9; i++){
            if(map.containsKey(i))
            sum += map.get(i).size();
        }
        if(count != sum){
            return false;
        }


        return true;
    }
}
