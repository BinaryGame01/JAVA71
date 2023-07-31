import java.util.Scanner;
public class P{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0;i<a;i++){
            int b = sc.nextInt();
            int c = sc.nextInt();
            int p = (b-c)/4;
            int q = (b-c)%4;
            if(b<=c){
                System.out.println("0");
            }else if(b>c && q==0){
                System.out.println(p);
            }else{
                System.out.println(p+1);
            }
        }
    }
}




//import java.util.Scanner;
//public class P {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//
//        int numTestCases = scanner.nextInt();
//
//
//        for (int i = 0; i < numTestCases; i++) {
//
//            int numChildren = scanner.nextInt();
//            int candiesWithChef = scanner.nextInt();
//
//
//            int packetsNeeded = Math.max(0, (numChildren - candiesWithChef + 3) / 4);
//
//
//            System.out.println(packetsNeeded);
//        }
//
//        scanner.close();
//    }
//}