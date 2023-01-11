public class nqueensnrows {

    public static Boolean isSafe(char board[][],int row,int col){
        //for vertcal up check
        for(int i=row-1,j=col;i>=0;i--){
            if(board[i][j]=='Q'){
                return false;
            }}
         //for right diagonal up  check
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
              //for vertcal up check
        for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        
        return true;
    }
    static int count=0;
    public static void nqnr(char board[][],int row){
        //base case
        if(row==board.length){
            printarr(board);
            count++;
            return;
        }

        //column loop
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)==true){
             board[row][j]='Q';
             nqnr(board,row+1);//function call
            board[row][j]='x';//backtracking to remove the previous elements
        }
    }
    }
    public static Boolean onesolnnqnr(char board[][],int row){
        //base case
        if(row==board.length){
            printarr(board);
            return true;
        }

        //column loop
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)==true){
             board[row][j]='Q';
             
             if(onesolnnqnr(board,row+1)){
                return true;
             }
           
        }
    }
    return false;
    }
    public static void printarr(char board[][]){
        System.out.println("------------------------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
             System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n=3;
        char board[][]=new char[n][n];
        //intialize
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
             board[i][j]='x';
            }
        }
        //nqnr(board,0);
        //System.out.println("total ways to print n Queens "+count);
        System.out.println(onesolnnqnr(board,0));
    }}
    

