public class P1_Start_Square {
    public static void main(String[] args) {
        int row = 5 ;
        rows(row,row);
    }

    public static void rows(int row,int n) {
        if (row == 0){
            return ;
        }
        stars(n);
        System.out.println();
        rows(row-1,n);
    }

    public static void stars(int n) {
        if (n==0){
            return;
        }
        System.out.print("*");
        stars(n-1);
    }
}
