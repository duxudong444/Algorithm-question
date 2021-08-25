package dxd.title;

/**
 * @author: Xudong Du
 * @Date: Create in 12:41 2021/8/25
 * @Description:
 *  ����һ��m x n ��ά�ַ�����board ��һ���ַ�������word �����word �����������У����� true �����򣬷��� false ��
 * ���ʱ��밴����ĸ˳��ͨ�����ڵĵ�Ԫ���ڵ���ĸ���ɣ����� �����ڡ� ��Ԫ������Щˮƽ���ڻ�ֱ���ڵĵ�Ԫ��ͬһ����Ԫ���ڵ���ĸ�������ظ�ʹ�á�
 *���룺board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
 * �����true
 * ���룺board = [["a","b"],["c","d"]], word = "abcd"
 * �����false
 **/

public class Title12 {
    public static boolean exist(char[][] board, String word) {
        //�ж��Ƿ�Ϊ��
        if(board == null || board.length == 0 || board[0].length == 0){
            return false;
        }
        //���ַ���ת��Ϊ�ַ�����
        char[] words = word.toCharArray();
        //����boolean�������ж��Ƿ��Ѿ���·������
        boolean[][] visited = new boolean[board.length][board[0].length];

        //�����ַ����󣬴ӡ�0��0����ʼ�������·��������true����������ڣ�����һ����
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
        //ֻҪi��jԽ�磬�����Ѿ����ʣ�������words��ֵ����ȣ�ֱ�ӷ���false
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || visited[i][j] || board[i][j] != words[start]){
            return false;
        }
        //��start������ȫwords��˵���Ѿ��ҵ�һ�����ʵ�·��������true
        if(start == words.length-1){
            return true;
        }
        //���·��ʺ��ʶ
        visited[i][j] = true;
        boolean result = false;
        //���ĸ������·�������ж�
        result = dfs(board, words, visited, i+1, j, start+1)||
                dfs(board, words, visited, i, j+1, start+1)||
                dfs(board, words, visited, i-1, j, start+1)||
                dfs(board, words, visited, i, j-1, start+1);
        //������ɺ󣬽����ʺ��ʶ��λ���Ա��´α���
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
        System.out.println("����" + word + "���ַ������еĴ���״̬�ǣ�" + exist(board,word));
    }
}
