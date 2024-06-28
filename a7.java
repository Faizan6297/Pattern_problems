public class a7 {
    public static void main(String[] args) {
        int t=1;
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                if(t==10){
                    t=0;
                }
                System.out.print(t);
            }
            System.out.println();
            t++;
        }
    }
}
