
public class E {
    public static void main(String[] args){
        int A[] = {1,2,3,5,6};

        int  Tsum = 0;
        for (int i=0; i<=A.length+1; i++){
            Tsum = Tsum+i;
        }
        System.out.println(Tsum);

        int Asum=0;
        for(int i=0;i<A.length;i++){
            Asum=Asum+A[i];
        }
        System.out.println(Asum);
        System.out.println(Tsum-Asum);
    }
}