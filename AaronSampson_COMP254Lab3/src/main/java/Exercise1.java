public class Exercise1 {

    //use addition and subtraction only to decrease n and mutiply
    public static int integers(int m, int n){
        //Base case
        if (n==0)
            return 0;
        else
            // X m by (n-1)
            return m + integers(m, n-1);
    }

    public static void main(String[] args) {
        int m = 10; //added number
        int n = 8; // add m 8 times
        System.out.println(m + "x"+n+"="+integers(m,n));
    }
}
