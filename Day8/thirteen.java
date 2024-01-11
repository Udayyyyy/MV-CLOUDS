package Day8;

public class thirteen {
    public static void main(String[] args) {
        int n = 5, r = 3;

        System.out.println(n+"P"+r+" = "+permutation(n, r));
        System.out.println(n+"C"+r+" = "+combination(n, r));        
    }

    public static int factor(int n){

    if(n==0 || n==1){
        return 1;
    } 
    else{
      return n*factor(n-1);
    }
}
static int  permutation(int n, int r) {
        return factor(n) / factor(n - r);
    }

static int  combination(int n, int r) {
        return factor(n) / (factor(r)*factor(n - r));
    }
    
}
