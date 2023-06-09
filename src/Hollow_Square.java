public class Hollow_Square {
    public static void main(String[] args) {
        int rows = 5 ;
        row(rows,rows,rows);
    }

    public static void row(int n , int i,int x) {
        if (n==0){
            return;
        }
        star(n,i,x);
        System.out.println();
        row(n-1,i,x);
    }

    public static void star(int n,int i,int x) {
        if (i==0){
            return;
        } else if (n==x || n==1) {
            System.out.print("*");
            star(n,i-1,x);
        } else {
            if (i==x || i==1){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            star(n,i-1,x);
        }

    }
}
