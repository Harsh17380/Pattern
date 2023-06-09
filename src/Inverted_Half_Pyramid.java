public class Inverted_Half_Pyramid {
    public static void main(String[] args) {
        row(5,5);
    }

    public static void row(int n , int i) {
        if (n==0){
            return;
        }
        star(i);
        System.out.println();
        row(n-1,i-1);
    }

    public static void star(int i) {
        if (i==0){
            return;
        }
        System.out.print("*");
        star(i-1);
    }
}
