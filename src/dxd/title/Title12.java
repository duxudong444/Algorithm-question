package dxd.title;

/**
 * @author: Xudong Du
 * @Date: Create in 12:41 2021/8/25
 * @Description:
 *  给定一个m x n 二维字符网格board 和一个字符串单词word 。如果word 存在于网格中，返回 true ；否则，返回 false 。
 * 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中 “相邻” 单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。
 *输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
 * 输出：true
 * 输入：board = [["a","b"],["c","d"]], word = "abcd"
 * 输出：false
 **/

public class Title12 {
    public static boolean exist(char[][] board, String word) {
        //判断是否为空
        if(board == null || board.length == 0 || board[0].length == 0){
            return false;
        }
        //将字符串转化为字符数组
        char[] words = word.toCharArray();
        //定义boolean数组来判断是否已经被路径包括
        boolean[][] visited = new boolean[board.length][board[0].length];

        //遍历字符矩阵，从【0，0】开始，如果有路径，返回true，如果不存在，则逐一遍历
        for(int i = 0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(dfs(board, words, visited, i, j, 0)){
                    return true;
                }
            }
        }

        return false;

    }

    private static boolean dfs(char[][] board, char[] words, boolean[][] visited, int i, int j, int start) {
        //只要i，j越界，或者已经访问，或者与words的值不相等，直接返回false
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || visited[i][j] || board[i][j] != words[start]){
            return false;
        }
        //当start遍历完全words，说明已经找到一个合适的路径，返回true
        if(start == words.length-1){
            return true;
        }
        //留下访问后标识
        visited[i][j] = true;
        boolean result = false;
        //对四个方向的路径进行判断
        result = dfs(board, words, visited, i+1, j, start+1)||
                dfs(board, words, visited, i, j+1, start+1)||
                dfs(board, words, visited, i-1, j, start+1)||
                dfs(board, words, visited, i, j-1, start+1);
        //遍历完成后，将访问后标识复位，以便下次遍历
        visited[i][j] = false;
        return result;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'a','b','c','d','e'},
                {'s','f','c','s'},
                {'a','d','e','f'}
        };
        String word = "abcced";
        System.out.println("单词" + word + "在字符网格中的存在状态是：" + exist(board,word));
    }
}
