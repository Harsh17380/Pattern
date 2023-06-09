public class Mirror_Inverted_Half_Pyramid {
    public static void main(String[] args) {
        int row = 5 ;
        rows(row,1,5);
    }

    public static void rows(int row,int i,int n) {
        if (row == 0){
            return ;
        }
        int x = n - row;
        stars(row,x,n);
        System.out.println();
        rows(row-1,i,n);
    }

    public static void stars(int i,int x, int n) {
        if (i==0){
            return;
        }/* else if (x>0) {
            System.out.print(" ");
            stars(i-1,x-1);
        }*/else {
            if (x > 0) {
                System.out.print(" ");
                stars(i, x - 1, n);
            } else {
                System.out.print("*");
                stars(i - 1, x, n);
            }
        }
    }
}
