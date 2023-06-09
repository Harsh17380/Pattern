
public class Mirror_left_Pyramid {
    public static void main(String[] args) {
        int row = 5 ;
        rows(row,row,1);
    }

    public static void rows(int row,int i,int s) {
        if (row == 0){
            return ;
        }
        int x = i - s ;
        stars(i,x);
        System.out.println();
        rows(row-1,i,s+1);
    }

    public static void stars(int i,int x) {
        if (i==0){
            return;
        } else if (x>0) {
            System.out.print(" ");
            stars(i-1,x-1);
        }else {
            System.out.print("*");
            stars(i-1,x);
        }
    }
}
